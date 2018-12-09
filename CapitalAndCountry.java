import java.io.File;
import java.util.Scanner;
import java.util.Random;
import java.io.BufferedReader;
import java.io.FileReader;
//import java.io.FileWriter;
import java.io.IOException;
//import java.io.PrintWriter;
import java.util.regex.Pattern;


public class CapitalAndCountry{

    String capital;
    String country;

      void randomCityAndCountry(String path) throws IOException {
        if (path == ""){path = "countries_and_capitals.txt";}

        String[] records = new String[1000];
        int n = 0;
        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String textLine = bufferedReader.readLine();
        do {
          records[n] = textLine;
          n++;
          textLine = bufferedReader.readLine();
        } while(textLine != null);
        bufferedReader.close();

        Random rand = new Random();
        int random_index = rand.nextInt(n);

        String[] output = records[random_index].split(Pattern.quote(" | "));

        capital = output[1];
        country = output[0];

      }
}
