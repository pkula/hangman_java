import java.io.IOException;


public class Controler {

    Controler() throws IOException {
      Odczyt odczyt = new Odczyt();
      String o;
      Clear clear = new Clear();

      CapitalAndCountry r = new CapitalAndCountry();
      r.randomCityAndCountry("");
      System.out.println(r.capital);
      GuessTable table = new GuessTable(r.capital);

      table.viewTable();
      table.viewFailedLetters();
      table.viewLifePoints();
      do {
        System.out.println("Enter letter or word");
        o = odczyt.odczyt();
        clear.clear();
        if (o.length() == 1){
          table.changeLetters(o);
        }
        else{
          if (o.equals(r.capital.toUpperCase())){
            table.if_win = true;
          }
          else{
            table.life_points = table.life_points - 2;
            table.ifLose();
          }
        }
        table.viewTable();
        table.viewFailedLetters();
        table.viewLifePoints();

        System.out.println("");
        System.out.println("");
        if (table.if_win){
          Win win = new Win();
          win.win();
        }
        else if(table.if_lose){
          Lose lose = new Lose();
          lose.lose();
        }
        Runtime.getRuntime().exec("clear");
      } while (!table.if_win && !table.if_lose);



    }
}
