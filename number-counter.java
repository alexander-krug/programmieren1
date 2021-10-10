public class starterklasse {
public static void main (String[] args) {
  
  int Counterfor0 = 0;
	int Counterfor1 = 0;
	int Counterfor2 = 0;
	int Counterfor3 = 0;
	int Counterfor4 = 0;
	int[] array_a =  {1,1,4,4,4,4,4,2,2,2,3,3,3,0};
	for (int i = 0; i <= 13; i++) {
		if (array_a[i] == 0) {
			Counterfor0 += 1;
		}
		if (array_a[i] == 1) {
			Counterfor1 += 1;
		}
		if (array_a[i] == 2) {
			Counterfor2 += 1;
		}
		if (array_a[i] == 3) {
			Counterfor3 += 1;
		}
		if (array_a[i] == 4) {
			Counterfor4 += 1;
		}
	}
	System.out.println("Anzahl der Null ist " + Counterfor0 + ".");
	System.out.println("Anzahl der Eins ist " + Counterfor1 + ".");
	System.out.println("Anzahl der Zwei ist " + Counterfor2 + ".");
	System.out.println("Anzahl der Drei ist " + Counterfor3 + ". ");
	System.out.println("Anzahl der Vier ist " + Counterfor4 + ".");

}
}
 
