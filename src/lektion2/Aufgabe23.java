/**
 * Schreiben Sie ein kleines Programm, in dem Sie einen zweidimensionalen Array definieren, erzeugen und initialisieren,
 * initialisieren Sie den Array auf zwei verschiedene Arten.
 */
package lektion2;

/**
 * @author Mathias Weigert i10b
 * 
 */
public class Aufgabe23 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArray1;
		int[] intArray1;
		boolean[] boolArray1;

		strArray1 = new String[128];
		String[] strArray2 = { "Es", "war", "einmal", "in", "einem", "tiefen", "..." };

		intArray1 = new int[42];
		int[] intArray2 = { 128, 25, 23, 49, 889, 5, 13 };

		boolArray1 = new boolean[23];
		boolean[] boolArray2 = { true, false, false, true, true, true, false };

		System.out.println("strArray1: strArray1 = new String[128]");
		System.out.println("Element 25: " + strArray1[25]);
		System.out.println("strArray2: String[] strArray2 =  {'Es', 'war', 'einmal', 'in', 'einem', 'tiefen', '...'} ");
		System.out.println("Element 4: " + strArray2[4]);
		System.out.println();
		
		System.out.println("intArray1: intArray1 = new int[42];");
		System.out.println("Element 13: " + intArray1[13]);
		System.out.println("intArray2: int[] intArray2 = { 128, 25, 23, 49, 889, 5, 13 }");
		System.out.println("Element 1: " + intArray2[1]);
		System.out.println();
		
		System.out.println("boolArray1: boolArray1 = new boolean[23]");
		System.out.println("Element 15: " + boolArray1[15]);
		System.out.println("boolArray2: boolean[] boolArray2 = { true, false, false, true, true, true, false }");
		System.out.println("Element 5: " + boolArray2[5]);
	}

}
