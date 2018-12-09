class GuessTable{
  String guess_table;
  String failed_letters;
  String main_capital;
  int life_points;
  boolean if_win;
  boolean if_lose;

  GuessTable(String capital){
    if_win = false;
    if_lose = false;
    guess_table = "";
    main_capital = capital.toUpperCase();
    failed_letters = "";
    life_points = 10;
    for (int i=0;i<main_capital.length();i++){
      guess_table = guess_table + "_";
    }
    changeLetters(" ");
  }

  void ifLose(){
    if (life_points <= 0){
      if_lose = true;
    }
  }

  void ifWin(){
    if_win = true;
    for (int i=0; i<guess_table.length();i++){
      if (guess_table.substring(i,i+1).equals("_")){
        if_win = false;
      }
    }
  }

  void addFailedLetter(String letter){
    boolean if_exist = false;
    for (int i=0; i<failed_letters.length();i++){
      if (failed_letters.substring(i,i+1).equals(letter)){
        if_exist = true;
      }
    }
    if (!if_exist) {
      failed_letters = failed_letters + letter;
    }
  }

  void viewTable(){
    System.out.println("Slowo zgadywane:" + guess_table);
  }

  void viewFailedLetters(){
    System.out.println("Letter which dont exist in word:  " + failed_letters);
  }

  void viewLifePoints(){
    System.out.println("Your life:  " + life_points);
  }

  void changeLetters(String letter){
    boolean if_fail = true;
    int len = guess_table.length();
    for (int i=0;i < len;i++){
      if (main_capital.substring(i,i+1).equals(letter)){
        if_fail = false;
        if (i == 0){
          guess_table = letter + guess_table.substring(i+1,len);
        }
        else if (i == len-1){
          guess_table = guess_table.substring(0,len-1) + letter;
        }
        else {
          guess_table = guess_table.substring(0,i)+letter+guess_table.substring(i+1,len);
        }
      }
    }
    if (if_fail&&!letter.equals(" ")){
      life_points = life_points - 1;
      addFailedLetter(letter);
    }
    ifWin();
    ifLose();
  }



















}
