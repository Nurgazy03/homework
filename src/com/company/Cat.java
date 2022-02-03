package com.company;

public class Cat {

   private String name;
   private String age;
   private String colour;
   private String breed;
   private Cat information;


    void showInfo() {
        System.out.println("name ="+" "+name);
        System.out.println("age ="+" "+age);
        System.out.println("colour ="+" "+colour);
        System.out.println("breed ="+" "+breed);
    }

    void ability() {
        System.out.println(name+" can catch a mouse");
    }
    void hobby() {
        System.out.println(name+" is sleeping at this moment");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getColor() {
        return colour;
    }

    public void setColor(String color) {
        this.colour = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }


}
