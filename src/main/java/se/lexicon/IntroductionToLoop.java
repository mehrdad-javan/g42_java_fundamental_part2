package se.lexicon;

import java.util.Scanner;

public class IntroductionToLoop {

  public static void main(String[] args) {
    /*
    Scanner sc = new Scanner(System.in);
    boolean isAdult = true;
    System.out.println("Start");

    while (isAdult){

      System.out.println("How old are you?");
      int age = sc.nextInt();
      if (age >= 18){
        System.out.println("you are an adult");
      } else {
        System.out.println("You are a child");
      }

      System.out.println(" do you want to continue( 0(y) , 1(n) )? ");
      int isContinue = sc.nextInt();
      if(isContinue == 1){
        isAdult = false;
      }

    }

    System.out.println("End");
*/


    /*for(int i = 1  ;  i <= 6 ; i++){
      if (i % 2 == 0){
        System.out.println("number " + i + " is an even number");
      } else {
        System.out.println("number " + i + " is an odd number");
      }

    }*/


    System.out.println("--------------------");

    /*int j = 1;
    while (j <=6){
      if (j % 2 == 0){
        System.out.println("number " + j + " is an even number");
      } else {
        System.out.println("number " + j + " is an odd number");
      }
      j++;
    }*/

    /*for(int i = 1  ;  i <= 6 ; i++){
      if(i == 3){
        continue;
      }

      System.out.println(i);
    }*/



    /*for(int i = 1  ;  i <= 6 ; i++){
     if (i == 5){
       break;
     }
      System.out.println(i);
    }*/

    Scanner sc = new Scanner(System.in);
    while (true){
      System.out.println("Enter your name:");
      String name = sc.nextLine();
      System.out.println("my name is " + name);

      System.out.println(" do you want to continue? (y,n)");
      String isContinue = sc.nextLine();
      if (isContinue.equals("n")){
        break;
      }

    }

  }


}
