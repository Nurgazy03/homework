package com.company;

public class Dog {

    private String breed;
    private String age;
    private String name;
    private String price;
    private Dog information;


    void showInfo() {
        System.out.println("Name = " + name);
        System.out.println("breed = " + breed);
        System.out.println("price = " + price);
        System.out.println("age = " + age);

    }

    void ability() {
        System.out.println(name+" is a fighting dog");
    }

    void ability2() {
        System.out.println(name+" can run fast");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Dog getInformation() {
        return information;
    }

    public void setInformation(Dog information) {
        this.information = information;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
