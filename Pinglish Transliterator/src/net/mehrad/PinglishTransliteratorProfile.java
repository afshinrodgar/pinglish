package net.mehrad;

import com.google.wave.api.ProfileServlet;


public class PinglishTransliteratorProfile extends ProfileServlet{

	private static final long serialVersionUID = 2640169007060414414L;

	@Override
	public String getRobotAvatarUrl() {
		return "http://pinglish2parsi.appspot.com/_wave/robot/profile.PNG";
	}
	
	@Override
	public String getRobotName() {
		return "Parsi Transliterator";
	}

	@Override
	public String getRobotProfilePageUrl() {
		return "http://www.mehrad.net";
	}
}
