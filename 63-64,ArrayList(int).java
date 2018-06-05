import java.util.*;
import java.util.Scanner;

class Main {

  public static int countItems(ArrayList<String> list){
    return list.size();
  }

  public static void removeLast(ArrayList<String> list){
    int length = list.size()-1;
    list.remove(length);
  }

  public static void main(String[] args) {
    /*ArrayList<String> list = new ArrayList<String>();
    list.add("Hallo");
    list.add("Ciao");
    list.add("Hello");
    System.out.println("There are this many items in the list:");
    System.out.println(countItems(list));*/

    ArrayList<String> brothers = new ArrayList<String>();
    brothers.add("Dick");
    brothers.add("Henry");
    brothers.add("Michael");
    brothers.add("Bob");

    System.out.println("brothers:");
    System.out.println(brothers);

    // sorting brothers
    Collections.sort(brothers);
    // removing the last item
    removeLast(brothers);

    System.out.println(brothers);
  }
}
