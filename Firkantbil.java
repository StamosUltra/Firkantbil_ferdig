/*    Firkantbil.java Super Happy Go Go Team 2016 - 09 - 06
* v-0.1.0
* Program som styrer en bil med 2 motorer. Bilen skal oppf�re seg slik:
* 1. kj�r framover
* 2. Sving h�yre
* 3. Sving h�yre
* 4. Sving h�yre
* 5. Stoppe

* Bilen oppf�rer seg p� f�lgende m�te:
* 1. Kj�rer frem
* 2. Svinger 95 grader h�yre
* 3. Kj�rer frem
* 4. Svinger 95 grader h�yre
* 5. Kj�rer frem
* 6. Svinger 95 grader h�yre
* 7. Kj�rer frem
* 8. Stopper
*/

import lejos.hardware.motor.*;
import lejos.hardware.lcd.*;

public class Firkantbil
{
  public static void main (String[] args)  throws Exception
  {
     Motor.B.setSpeed(450);  // sett hastighet (toppfart = 900)
	 Motor.C.setSpeed(450);

     // Kj�r framover
     System.out.println("Fram 2000 ms");
     Motor.B.forward();  // Start motor A - kj�r framover
     Motor.C.forward();  // Start motor C - kj�r framover
     Thread.sleep(2000); // Vent i 1000 ms f�r vi g�r videre i koden

     // Sving
     LCD.clearDisplay();
     System.out.println("Snu 180 grader");
     Motor.B.forward();  // roter 180 gr med motor A
     Motor.C.stop();
     Thread.sleep(600);  // vent til rotasjon er ferdig

     // Kj�r framover
     System.out.println("Fram 2000 ms");
     Motor.B.forward();  // Start motor A - kj�r framover
     Motor.C.forward();  // Start motor C - kj�r framover
     Thread.sleep(2000); // Vent i 1000 ms f�r vi g�r videre i koden

     // Sving
     LCD.clear();
     System.out.println("Snu 180 grader");
     Motor.B.forward();  // roter 180 gr med motor A
     Motor.C.stop();
     Thread.sleep(600);  // vent til rotasjon er ferdig

     // Kj�r framover
     System.out.println("Fram 2000 ms");
     Motor.B.forward();  // Start motor A - kj�r framover
     Motor.C.forward();  // Start motor C - kj�r framover
     Thread.sleep(2000); // Vent i 1000 ms f�r vi g�r videre i koden

     // Sving
     LCD.clear();
     System.out.println("Snu 180 grader");
     Motor.B.forward();  // roter 180 gr med motor A
     Motor.C.stop();
     Thread.sleep(600);  // vent til rotasjon er ferdig

     // Kj�r framover
     System.out.println("Fram 2000 ms");
     Motor.B.forward();  // Start motor A - kj�r framover
     Motor.C.forward();  // Start motor C - kj�r framover
     Thread.sleep(2000); // Vent i 1000 ms f�r vi g�r videre i koden
  }
}

/* Programmet svinger litt for mye.
* Det anbefales � svinge ved � bruke kommandoen: Rotate, ikke Forward*/