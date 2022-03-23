package se.lexicon;

public class Car {

  String brand;
  String registrationNumber;
  short maxSpeed;
  String ownerName;
  String color;


  public static void main(String[] args) {
    Car volvoXC40 = new Car();
    volvoXC40.color = "gray";
    volvoXC40.registrationNumber = "abcd-123456";
    volvoXC40.brand = "Volvo";
    volvoXC40.ownerName = " VOLVO";
    volvoXC40.maxSpeed = 200;
  }



}
