/**
 * Schreiben Sie ein kleines Programm, in dem Sie die Java Operatoren <<, 
 * >>, >>>, ^, & und | auf ihre Funktionalität testen.
 */
package lektion2;

/**
 * @author Mathias Weigert i10b
 * 
 */
public class Aufgabe21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte byte1 = 0b0001101;
		byte byte2 = 0b1011101;
		System.out
				.println("Byte 1 = 0000 1101 (13) und Byte 2 = 0101 1101 (93)");
		System.out
				.println("***************************************************");
		System.out.println("             Anwendung von << um 3");
		System.out.println();
		System.out.println("Byte 1 << 3 = " + (byte1 << 3) + "(0110 1000)");
		System.out.println("Byte 2 << 3 = " + (byte2 << 3) + "(10 1110 1000)");
		System.out
				.println("***************************************************");
		System.out.println("             Anwendung von >> um 3");
		System.out.println();
		System.out.println("Byte 1 >> 3 = " + (byte1 >> 3) + "(0000 0001)");
		System.out.println("Byte 2 >> 3 = " + (byte2 >> 3) + "(0000 1011)");
		System.out
				.println("***************************************************");
		System.out.println("         Anwendung von Byte 1 & Byte 2");
		System.out.println();
		System.out.println("Byte 1 & Byte 2 = " + (byte1 & byte2)
				+ "(0000 1101)");
		System.out.println();
		System.out.println("Kontrolle:                       0000 1101");
		System.out.println("                               & 0101 1101");
		System.out.println("                               -----------");
		System.out.println("                                 0000 1101");
		System.out
		.println("***************************************************");
		System.out.println("         Anwendung von Byte 1 | Byte 2");
		System.out.println();
		System.out.println("Byte 1 | Byte 2 = " + (byte1 | byte2)
				+ "(0101 1101)");
		System.out.println();
		System.out.println("Kontrolle:                       0000 1101");
		System.out.println("                               | 0101 1101");
		System.out.println("                               -----------");
		System.out.println("                                 0101 1101");
		System.out
				.println("***************************************************");
	}

}
