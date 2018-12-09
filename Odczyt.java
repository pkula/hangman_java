import java.util.Scanner;

public class Odczyt {

    String odczyt() {
      String o;
      Scanner odczyt = new Scanner(System.in);

      o = odczyt.nextLine().toUpperCase();
      return o;

    }
}
