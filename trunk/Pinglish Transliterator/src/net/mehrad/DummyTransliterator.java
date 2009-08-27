package net.mehrad;

/**
 * this transliterator is a conversion from
 * a ready python version by textpad, syntax
 * is really messy. its DUMMY.
 * @author Mehrad
 *
 */
public class DummyTransliterator implements Transliterator{

	public String convert(String originalBlipTest) {

		char a[] = originalBlipTest.toLowerCase().toCharArray();
		int b = a.length;
		int d = 0;
		String e = "";
		StringBuffer buffer = new StringBuffer();
		while (d < b) {
			char i = a[d];
			char c;
			if (i == 'b')
				c = unichar(1576);
			else if (i == 'd')
				c = unichar(1583);
			else if (i == 'f')
				c = unichar(1601);
			else if (i == 'h')
				c = unichar(1607);
			else if (i == 'j')
				c = unichar(1580);
			else if (i == 'l')
				c = unichar(1604);
			else if (i == 'm')
				c = unichar(1605);
			else if (i == 'n')
				c = unichar(1606);
			else if (i == 'p')
				c = unichar(1662);
			else if (i == 'r')
				c = unichar(1585);
			else if (i == 't')
				c = unichar(1578);
			else if (i == 'v')
				c = unichar(1608);
			else if (i == 'z' && d == b - 1)
				c = unichar(1586);
			else if (i == 'z' && a[d + 1] == 'h') {
				c = unichar(1688);
				d = d + 1;
			} else if (i == 'z')
				c = unichar(1586);
			else if (i == 's' && d == b - 1)
				c = unichar(1587);
			else if (i == 's' && a[d + 1] == 'h') {
				c = unichar(1588);
				d = d + 1;
			} else if (i == 's')
				c = unichar(1587);
			else if (i == 'g' && d == b - 1)
				c = unichar(1711);
			else if (i == 'g' && a[d + 1] == 'h') {
				c = unichar(1602);
				d = d + 1;
			} else if (i == 'g')
				c = unichar(1711);
			else if (i == 'k' && d == b - 1)
				c = unichar(1705);
			else if (i == 'k' && a[d + 1] == 'h') {
				c = unichar(1582);
				d = d + 1;
			} else if (i == 'k')
				c = unichar(1705);
			else if (i == 'c' && a[d + 1] == 'h') {
				c = unichar(1670);
				d = d + 1;
			} else if (i == 'x') {
				c = unichar(1688);
				d = d + 1;
			} else if (i == 'a' && d == b - 1)
				c = unichar(1575);
			else if (i == 'a' && a[d + 1] == 'a' && d == 0) {
				c = unichar(1570);
				d = d + 1;
			} else if (i == 'a' && a[d + 1] == 'a' && a[d - 1] == chr(32)) {
				c = unichar(1570);
				d = d + 1;
			} else if (i == 'a' && a[d + 1] == chr(32))
				c = unichar(1575);
			else if (i == 'a' && a[d + 1] == 'a') {
				c = unichr(1575);
				d = d + 1;
			} else if (i == 'a' && d == 0)
				c = unichr(1575);
			else if (i == 'a' && a[d - 1] == chr(32))
				c = unichr(1575);
			else if (i == 'a') {
				d = d + 1;
				continue;
			} else if (i == 'e' && d == b - 1)
				c = unichr(1607);
			else if (i == 'e' && a[d + 1] == 'i' && a[d + 2] == chr(32)) {
				c = (char) (unichr(1740) + unichr(1740));
				d = d + 1;
			} else if (i == 'e' && a[d + 1] == 'i' && a[d + 1] != chr(32)) {
				c = (char) (unichr(1593) + unichr(1740));
				d = d + 1;
			} else if (i == 'e' && a[d + 1] == 'e' && a[d - 1] == chr(32)) {
				c = (char) (unichr(1593) + unichr(1740));
				d = d + 1;
			} else if (i == 'e' && a[d + 1] == 'e') {
				c = (char) (unichr(1593) + unichr(1740));
				d = d + 1;
			} else if (i == 'e' && a[d + 1] != 'e' && d == 0)
				c = unichr(1575);
			else if (i == 'e' && a[d + 1] == chr(32))
				c = unichr(1607);
			else if (i == 'e') {
				d = d + 1;
				continue;
			} else if (i == 'o' && d == b - 1)
				c = unichr(1608);
			else if (i == 'o' && a[d + 1] == 'o' && d == 0) {
				c = (char) (unichr(1575) + unichr(1608));
				d = d + 1;
			} else if (i == 'o' && a[d + 1] == 'o' && a[d - 1] == chr(32)) {
				c = (char) (unichr(1575) + unichr(1608));
				d = d + 1;
			} else if (i == 'o' && a[d + 1] == 'o') {
				c = unichr(1608);
				d = d + 1;
			} else if (i == 'o' && a[d + 1] == 'a') {
				c = (char) (unichr(1608) + unichr(1575));
				d = d + 1;
			} else if (i == 'o' && a[d + 1] == 'u') {
				c = (char) (unichr(1593) + unichr(1608));
				d = d + 1;
			} else if (i == 'o' && d == 0)
				c = unichr(1575);
			else if (i == 'o' && a[d - 1] == chr(32))
				c = unichr(1575);
			else if (i == 'o' && a[d + 1] == chr(32))
				c = unichr(1608);
			else if (i == 'o') {
				d = d + 1;
				continue;
			} else if (i == 'i' && d == b - 1)
				c = unichr(1740);
			else if (i == 'i' && d == 0)
				c = (char) (unichr(1575) + unichr(1740));
			else if (i == 'i')
				c = unichr(1740);
			else if (i == 'y')
				c = unichr(1740);
			else if (i == 'u' && d == 0)
				c = (char) (unichr(1575) + unichr(1608));
			else if (i == 'u')
				c = unichr(1608);
			else if (i == ' ' && a[d + 1] == 'e' && a[d + 2] != 'i'
					&& a[d + 2] != 'e')
				c = (char) (unichr(32) + unichr(1575));
			else if (i == ' ' && a[d + 1] == 'i')
				c = (char) (unichr(32) + unichr(1575));
			else if (i == ' ' && a[d + 1] == 'u')
				c = (char) (unichr(32) + unichr(1575));
			else if (i == ' ')
				c = unichr(32);
			else
				c = i;
			e = e + c;
			d = d + 1;

			buffer.append(c);
		}

		return buffer.toString();

	}

	/**
	 * unichr function in python
	 * @param a
	 * @return
	 */
	public static char unichr(int a) {
		return (char) a;
	}

	/**
	 * unichar function in python
	 * @param a
	 * @return
	 */
	public static char unichar(int a) {
		return (char) a;
	}

	/**
	 * chr function in python
	 * @param a
	 * @return
	 */
	public static char chr(int a) {
		return (char) a;
	}
}
