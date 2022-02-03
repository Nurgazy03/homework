package com.company;

public class Main {

    public static void main(String[] args) {
      Fish fish = new Fish();

      fish.setBreed("Anchous");
      fish.setColour("gray");
      fish.setSize("20sm");
      fish.setPrice("150som");

      fish.showInfo();
      fish.dish();
      fish.fresh();

        System.out.println("---------------------------------------------------------------");

      Parrot parrot = new Parrot();

      parrot.setName("Petty");
      parrot.setBreed("Kakadu");
      parrot.setColour("Yellow");
      parrot.setQuality("tolking");

      parrot.showInfo();

      parrot.able();
      parrot.tipe();


        System.out.println("---------------------------------------------------------------");


      Dog dog = new Dog();

      dog.setName("Alfa");
      dog.setAge("5 years old");
      dog.setBreed("doberman");
      dog.setPrice("1000$");

      dog.showInfo();
      dog.ability();
      dog.ability2();

        System.out.println("---------------------------------------------------------------");

      Cat cat = new Cat();

      cat.setName("Tom");
      cat.setAge("3 years old");
      cat.setColor("blue");
      cat.setBreed("pet");

      cat.showInfo();
      cat.ability();
      cat.hobby();
    }
}
