

class Main {

  private static void enterWords(){
    Scanner reader = new Scanner(System.in);

    ArrayList<String> words = new ArrayList<String>();
    System.out.print("Type a word: ");
    String word = reader.nextLine();

    while(true){
      if(word.isEmpty()){
        System.out.println("You typed the following words:");
        for(String i : words){
          System.out.println(i);
        }
        break;
      }
      else{
        words.add(word);
      }
      System.out.print("Type a word: ");
      word = reader.nextLine();
    }
  }

  private static void recurringWord(){
    Scanner reader = new Scanner(System.in);

    ArrayList<String> words = new ArrayList<String>();
    System.out.print("Type a word: ");
    String word = reader.nextLine();

    while(true){
      if(words.contains(word)){
        System.out.println("You gave the word " + word + " twice");
        break;
      }
      else{
        words.add(word);
      }
      System.out.print("Type a word: ");
      word = reader.nextLine();
    }

  }

  private static void reverseList(){
    Scanner reader = new Scanner(System.in);

    ArrayList<String> words = new ArrayList<String>();
    System.out.print("Type a word: ");
    String word = reader.nextLine();

    while(true){
      if(word.isEmpty()){
        Collections.reverse(words);
        System.out.println("You typed the following words: ");
        for(String i : words){
          System.out.println(i);
        }
        break;
      }
      else{
        words.add(word);
      }
      System.out.print("Type a word: ");
      word = reader.nextLine();
    }
  }

  private static void alphaList(){
    Scanner reader = new Scanner(System.in);

    ArrayList<String> words = new ArrayList<String>();
    System.out.print("Type a word: ");
    String word = reader.nextLine();

    while(true){
      if(word.isEmpty()){
        Collections.sort(words);
        System.out.println("You typed the following words:");
        for(String i : words){
          System.out.println(i);
        }
        break;
      }
      else{
        words.add(word);
      }
      System.out.print("Type a word: ");
      word = reader.nextLine();
    }
  }

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    //enterWords();
    //recurringWord();
    //reverseList();
    //alphaList();
  }
}
