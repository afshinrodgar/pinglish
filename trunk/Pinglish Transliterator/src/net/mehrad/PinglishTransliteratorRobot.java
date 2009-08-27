package net.mehrad;

import java.util.logging.Logger;

import com.google.wave.api.AbstractRobotServlet;
import com.google.wave.api.Blip;
import com.google.wave.api.Event;
import com.google.wave.api.EventType;
import com.google.wave.api.RobotMessageBundle;
import com.google.wave.api.StyleType;
import com.google.wave.api.TextView;
import com.google.wave.api.Wavelet;

public class PinglishTransliteratorRobot extends AbstractRobotServlet {

	private static final long serialVersionUID = -4635340082570534737L;
	private static final Logger log = Logger
			.getLogger(PinglishTransliteratorRobot.class.getName());
	
	private Transliterator transliterator; 
	
	@Override
	public void processEvents(RobotMessageBundle bundle) {
		Wavelet wavelet = bundle.getWavelet();

		if (bundle.wasSelfAdded()) {
			Blip blip = wavelet.appendBlip();
			TextView textView = blip.getDocument();
			textView.append("Parsi Transliterator Started.");
		}

		for (Event e : bundle.getEvents()) {

			log.severe("Handling Event:" + e);

			if (e.getType() == EventType.BLIP_SUBMITTED) {

				TextView textView = e.getBlip().getDocument();

				if (e.getBlip().isDocumentAvailable()) {
					String currentText = textView.getText();
					textView.setStyle(StyleType.INDENT3);
					textView.replace(getTransliterator().convert(currentText));
				}
			}

			if (e.getType() == EventType.WAVELET_TITLE_CHANGED) {

				Blip blip=e.getBlip();
				TextView textView = blip.getDocument();
				String oldTitle=blip.getWavelet().getTitle();
				blip.getWavelet().setTitle(getTransliterator().convert(oldTitle));
				
				if (e.getBlip().isDocumentAvailable()) {
					String currentText = textView.getText();
					textView.replace(getTransliterator().convert(currentText));
				}
			}

		}
	}

	/**
	 * looking for better implementation of translator
	 * @return
	 */
	public Transliterator getTransliterator() {
		if(transliterator==null)
			transliterator=new DummyTransliterator();
		return transliterator;
	}

	
	
}
