package se.lexicon;

import java.util.Scanner;

public class Calculator {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    displayMenu();

    System.out.println("Enter Number1: ");
    int number1 = sc.nextInt();
    System.out.println("Enter Number2: ");
    int number2 = sc.nextInt();

    System.out.println("Enter Operation Type ( + , - )");
    String operation = sc.next();

    switch (operation){
      case "+":
        int additionResult = addition(number1,number2);
        System.out.println(additionResult);
        break;
      case "-":
        int subtractionResult = subtraction(number1, number2);
        System.out.println(subtractionResult);
        break;
      default:
        System.out.println("Operation type is not valid!");
    }


  }

  // [access modifier] static [return type] [method name] ([params]) {}
  public static int addition(int num1, int num2){
    int result = num1 + num2;
    return result;
  }

  public static int subtraction(int n1,int n2){
    return n1 - n2;
  }

  // * & /



  public static void displayMenu(){
    System.out.println(" ### Welcome tou my Calculator #### ");
    System.out.println(" + : Addition");
    System.out.println(" - : Subtraction");
    System.out.println("####################################");
  }



}
