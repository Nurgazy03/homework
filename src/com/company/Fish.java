package com.company;

public class Fish {

    private String breed;
    private String size;
    private String colour;
    private String price;
    private Fish information;

    void showInfo() {
        System.out.println("breed = " +breed);
        System.out.println("size = " +size);
        System.out.println("colour = " +colour);
        System.out.println("price = " +price);


    }

    void dish() {
        System.out.println(breed+" " + "will tasty dish");
    }

    void fresh() {
        System.out.println(breed+" " +"has caught recently");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getPrice() {
        return price;
    }
}
