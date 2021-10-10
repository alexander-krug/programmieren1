public class Startklasse {
  public static void main (string[] args){
  
 int[] array_find_max = {1,9,8,7,4,5,6,9,8,4,1,2,3,9	};
	int Aktuellezahl;
	int max = 0;
		for (int i = 0; i < 14; i++) { 
			Aktuellezahl = array_find_max[i];
			  if (Aktuellezahl > max) {
				max = Aktuellezahl;
			  }
		  }	  
		System.out.println("Die größte Zahl ist " + max + ".");
	}
}
