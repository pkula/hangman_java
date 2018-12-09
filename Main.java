import java.io.IOException;
public class Main {
    public static void main(String args[]) throws IOException {
        boolean if_want_play;
        Odczyt odczyt = new Odczyt();
        Clear clear = new Clear();
        String o;
        do{
          System.out.println("Do you want play again");
          System.out.println("If you want enter yes or y");
          System.out.println("If you dont want enter somethink dofferent");
          o = odczyt.odczyt().toUpperCase();
          clear.clear();
          if ( o.equals("YES")||o.equals("Y")||o.equals("1")){
            Controler controler = new Controller();
          }
        }while(o.equals("YES")||o.equals("Y")||o.equals("1"));


      }
}
