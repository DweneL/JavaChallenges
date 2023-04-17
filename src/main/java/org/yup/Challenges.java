package org.yup;

import java.util.Scanner;

public class Challenges {

    public String greeting(String name, int age) {

        if (age >= 21) {
            //this is what happens if the condition is true
            return "hello " + name + ", welcome to the party!";
        } else {
            //this is what happens if false
            return "hello, " + name + ", I'm sorry but we cannot let you into the party";
        }


    }


    public String greetingWithUserInput() {

        Scanner theScanner = new Scanner(System.in);
        //we need to ask the user their name
        System.out.print("Enter your name: ");
        String name = theScanner.nextLine();
        //we need to ask the user their age
        System.out.print("Enter your age: ");
        int age = theScanner.nextInt();


        if (age >= 21) {
            //this is what happens if the condition is true
            return "hello " + name + ", welcome to the party!";

        } else {
            //this is what happens if false
            return "hello, " + name + ", I'm sorry but we cannot let you into the party";
        }

    }

    public int addTwoNumbers(){

        Scanner theScanner = new Scanner(System.in);
        //Ask the user for number 1
        System.out.print("Enter the number: ");
        int number1 = theScanner.nextInt();
        //ask the user for number 2
        System.out.print("Enter the number: ");
        int number2 = theScanner.nextInt();
        //return the sum of number1 and number2 together
        return  number1 + number2;
    }

    //create a method like the above for subtractin two numbers multiply 2 numbers
    public int subtractTwoNumbers() {

        Scanner theScanner = new Scanner(System.in);
        //Ask the user for number 1
        System.out.print("Enter the number: ");
        int number1 = theScanner.nextInt();
        //ask the user for number 2
        System.out.print("Enter the number: ");
        int number2 = theScanner.nextInt();
        //return the sum of number1 and number2 together
        return number1 - number2;
    }

}

