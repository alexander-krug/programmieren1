public class Startklasse {
  public static void main (String[] args) {
    //Fahrenheit to Celsius calculator
	    System.out.println("Bitte Temperatur in Grad Fahrenheit ohne Sonderzeichen eingeben, z.B. 20.");
	    java.util.Scanner scanner = new java.util.Scanner(System.in);
    	double TempFahrenheit = scanner.nextDouble();
    	TempFahrenheit -= 32;
	    TempFahrenheit *= 5;
    	TempFahrenheit /= 9;
	    System.out.println(TempFahrenheit);
  }
}
