import java.util.*;
import java.util.Scanner;

class Main {
    public static int sum(ArrayList<Integer> list) {
      int sum = 0;
      for(int i : list){
        sum += i;
      }
      return sum;
  }

  public static double average(ArrayList<Integer> list) {
    int length = list.size();
    int sum = 0;
    double average;
    
    for(int i : list){
      sum += i;
    }
    average = (double)sum/length;
    return average;
}

  public static ArrayList<Integer> lengths(ArrayList<String> list) {
    ArrayList<Integer> lengthList = new ArrayList<Integer>();
    for (String word:list){
      lengthList.add(word.length());
    }
    return lengthList;
  }

  public static int greatest(ArrayList<Integer> list) {
    int max = list.get(0);
    for(int i : list){
      if(i > max){
        max = i;
      }
    }
    return max;
  }

  public static double variance(ArrayList<Integer> list) {
    double sampleVar = 0;
    double varResult;
    for(int i : list){
        sampleVar += Math.pow((i-average(list)), 2);
    }
    varResult = (double)sampleVar / (list.size()-1);
    return varResult;
  } 


  public static void main(String[] args) {
    /*ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(3);
    list.add(2);
    list.add(7);
    list.add(2);

    System.out.println("The sum: " + sum(list));

    list.add(10);

    System.out.println("the sum: " + sum(list));*/

    /*ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(3);
    list.add(2);
    list.add(7);
    list.add(2);

    System.out.println("The average is: " + average(list));*/

    /*ArrayList<String> list = new ArrayList<String>();
    list.add("Hallo");
    list.add("Moi");
    list.add("Benvenuto!");
    list.add("badger badger badger badger");
    ArrayList<Integer> lengths = lengths(list);

    System.out.println("The lengths of the Strings: " + lengths);*/

    /*ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(3);
    list.add(2);
    list.add(7);
    list.add(2);

    System.out.println("The greatest number is: " + greatest(list));*/

    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(3);
    list.add(2);
    list.add(7);
    list.add(2);

    System.out.println("The variance is: " + variance(list));

  }
}
