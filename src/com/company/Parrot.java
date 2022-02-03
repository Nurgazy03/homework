package com.company;

public class Parrot {
    private String name;
    private String breed;
    private String colour;
    private String quality;
    private Parrot info;


    void showInfo() {
        System.out.println("Name = " + name);
        System.out.println("breed = " + breed);
        System.out.println("colour = " + colour);
        System.out.println("quality = " + quality);

    }

    void able() {
        System.out.println(name+" "+"can talk");
    }

    void tipe() {
        System.out.println(name+" "+"is a pet");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }
}
