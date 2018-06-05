class Main {

  public static int sum(int number1, int number2, int number3, int number4){
    int sum = number1 + number2 + number3 + number4;
    return sum;
  }

  public static int least(int number1, int number2){
    if (number1 < number2){
      return number1;
    }
    else{
      return number2;
    }
  }

  public static int greatest(int number1, int number2, int number3){
    if(number1 > number2 && number1>number3){
      return number1;
    }
    else if(number2 > number1 && number2>number3){
      return number2;
    }
    else{
      return number3;
    }
  }

  public static double average(int number1, int number2, int number3, int number4){
    double sum = number1 + number2 + number3 + number4;
    double average = sum/4;
    return average;
  }

  public static void main(String[] args) {
    /*int answer = sum(4, 3, 6, 1);
    System.out.println("sum: " + answer);*/

    /*int answer = least(100,50);
    System.out.println("Least: " + answer);*/

    /*int answer = greatest(2, 7, 3);
    System.out.println("Greatest: " + answer);*/

    double answer = average(4, 3, 6, 1);
    System.out.println("Average: " + answer);

  }
}
