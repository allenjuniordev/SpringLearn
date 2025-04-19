package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public String createOrder(String name, String coffee){
        if (name =="tomato"){
            System.out.println("You ordered a " + coffee);
            return "You ordered a " + coffee;
        } else {
            System.out.println("Sorry, we don't serve your type of coffee");
            return "Sorry, we don't serve your type of coffee";
        }
    }
}