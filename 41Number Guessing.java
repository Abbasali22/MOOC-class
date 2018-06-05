import java.util.Scanner;
import java.util.Random;

class Main {

  private static void drawNumber(){
      Random rand = new Random();
      Scanner reader = new Scanner(System.in);
      
      int randNumber = rand.nextInt(100);
      //System.out.print(randNumber); //Displays Random #
      int guessCount = 1;
      

      while(true){
        System.out.print("Guess a number: ");
        int guess = Integer.parseInt(reader.nextLine());

        if(guess < randNumber){
          System.out.println("The Number is greater, " + "guesses made: " + guessCount);
        }
        else if(guess > randNumber){
          System.out.println("The Number is lesser, " + "guesses made: " + guessCount);
        }
        else{
          System.out.println("Congratulations, your guess is correct!");
          break;
        }
        guessCount++;
      }
    }

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    drawNumber();

  }
}
