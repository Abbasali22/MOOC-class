import java.util.*;
import java.util.Scanner;

class Main {
  public static boolean moreThanOnce(ArrayList<Integer> list, int number) {
    int count = 0;
    for(int i : list){
      if(number == i){
        count++;
      }
    }
    if(count >= 2){
      return true;
    }
    else{
      return false;
    }
  }

  public static String reverse(String text){
    String revText = "";
    int textLen = text.length()-1;
    while(textLen >= 0){
      revText += text.charAt(textLen);
      textLen--;
    }
    return revText;
  }
  public static boolean palindrome(String text) {
    if(text.equals(reverse(text))){
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    /*ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(3);
    list.add(2);
    list.add(7);
    list.add(2);

    System.out.print("Type a number: ");
    int number = Integer.parseInt(reader.nextLine());
    if (moreThanOnce(list, number)) {
        System.out.println(number + " appears more than once.");
    } else {
        System.out.println(number + " does not appear more than once.");
      }*/

    System.out.print("Type a text: ");
    String inputText = reader.nextLine();
    String text = inputText.replaceAll("\\s+","");
    if (palindrome(text)) {
       System.out.println("The text is a palindrome!");
    } else {
       System.out.println("The text is not a palindrome!");
    }
  }
}
