package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private int height; //inches
    private int weight; //lbs
    private boolean female;
    private String eyeColor;
    private int idNumber;

    public Person() {
        this.name = "";
        this.age = Integer.MAX_VALUE;
        this.height = Integer.MAX_VALUE;
        this.female = true;
        this.weight = Integer.MAX_VALUE;
        this.eyeColor = "";
        this.idNumber = Integer.MAX_VALUE;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person(String name, int age, int height, int weight, boolean female, String eyeColor, int idNumber) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
        this.female = female;
        this.idNumber = idNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }
    public boolean isFemale(){
        return female;
    }
    public void setFemale(boolean female){
        this.female = female;
    }
    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }
    public String getEyeColor(){
        return this.eyeColor;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getHeight(){
        return this.height;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getWeight(){
        return this.weight;
    }
    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }
    public int getIdNumber(){
        return this.idNumber;
    }

}
