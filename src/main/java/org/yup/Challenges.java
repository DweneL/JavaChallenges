package org.yup;

import org.w3c.dom.ls.LSOutput;

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
        System.out.print("Enter your first number to add: ");
        int number1 = theScanner.nextInt();
        //ask the user for number 2
        System.out.print("Enter the second number to add: ");
        int number2 = theScanner.nextInt();
        //return the sum of number1 and number2 together
        return  number1 + number2;
    }

    //create a method like the above for subtractin two numbers multiply 2 numbers
    public int subtractTwoNumbers() {

        Scanner theScanner = new Scanner(System.in);
        //Ask the user for number 1
        System.out.print("Enter your first number to subtract: ");
        int number1 = theScanner.nextInt();
        //ask the user for number 2
        System.out.print("Enter the second number to subtract: ");
        int number2 = theScanner.nextInt();
        //return the sum of number1 and number2 together
        return number1 - number2;
    }
    public int multiplyTwoNumbers() {

        Scanner theScanner = new Scanner(System.in);
        //Ask the user for number 1
        System.out.print("Enter your first number to Multiply: ");
        int number1 = theScanner.nextInt();
        //ask the user for number 2
        System.out.print("Enter the second number to Multiply: ");
        int number2 = theScanner.nextInt();
        //return the sum of number1 and number2 together
        return number1 * number2;
    }


    public int interactiveCalculator(){

        //Fire up the scanner so we can use it
        Scanner theScanner = new Scanner(System.in);

        //displays some set of choices to the user
        System.out.println("Welcome to the calculator!");
        System.out.println("Press 1 to add numbers!");
        System.out.println("Press 2 to subtract numbers");
        System.out.println("Press 3 to multiply numbers");
        System.out.print("Enter your selection and press ENTER: ");

        //this sits and waits for the user to give (1,2,3). when they hit inter
        //their selection is stored in userSelection
        int userSelection = theScanner.nextInt();

        int result;
        // creating a variable to store the results


// figure out what to do base on useer selection
        switch (userSelection){
            case 1:
                result = this.addTwoNumbers();
                //do stuff here
                break;
            case 2:
                result = this.subtractTwoNumbers();
                //do stuff here (in the case that the user chose 2)
                break;
            case 3:
                result = this.multiplyTwoNumbers();
                //do stuff here
                break;

            default:
                System.out.println("the user chose nonsense garbage (did not exist as a choice)");
                result = 0;
        }
// hand back the result of the above math from whichever scenerio the user chose
        return result;
    }

    public String coinFlip(){

        //attempt to flip a coin
        //want to return head or tails

        if( Math.random () > .5){
            //here is where we return heads if the number generated was > .5
            return "heads";
        }else{
            //here is where we return if the number generated was less than.5
            return "tales";
        }


    }

    public String findTheBiggestNumber(){

        //this is the scanner that lets us take input from the user
        Scanner theScanner = new Scanner(System.in);

        //this is where we ask the user for input
        System.out.println("give me the first number please: ");
        //this is where we capture that input and store it in a variable called first number
        int firstNumber = theScanner.nextInt();

        //this is where we ask the user for input
        System.out.println("give me the second number please: ");
        //this is where we capture that input and store it in a variable called first number
        int secondNumber = theScanner.nextInt();

        int theBiggestNumber = Math.max(firstNumber, secondNumber);

        return "The biggest number between " + firstNumber + " and " + secondNumber + " is: " + theBiggestNumber;

    }

    public String findSmallestNumber(){

        //reference the above method to make one that finds the smaller of the two number
        Scanner theScanner = new Scanner(System.in);
        System.out.println("Please give me the first number now!");
        int firstNumber = theScanner.nextInt();
        System.out.println("Please give me the second number now!");
        int secondNumber = theScanner.nextInt();
        int theSmallestNumber = Math.min(firstNumber, secondNumber);
        return " The smallest number between " + firstNumber + " and " + secondNumber + " is " + theSmallestNumber;
    }

    public String findTheDifferenceBetweenTwoNumbers(){
        Scanner theScanner = new Scanner(System.in);

        System.out.println("Please give me the first number now!");
        int firstNumber = theScanner.nextInt();
        System.out.println("Please give me the second number now!");
        int secondNumber = theScanner.nextInt();
        int theDifference = Math.abs(firstNumber - secondNumber);

        return " The difference between " +  firstNumber + " and " + secondNumber + " is " + theDifference;

        //math.abs()
    }

    public String convertToUppercase(){

        //this is what let us take input from the user
        Scanner theScanner = new Scanner(System.in);

        System.out.println("provide a word to convert to all UPPERCASE: ");
        String theWord = theScanner.nextLine();

        return "You provided, " + theWord + " and we converted it to: " + theWord.toUpperCase();


    }

    //convertToLowercase - work like ConvertToUppercase and return some text that show us the word is converted

    public String convertToLowercase(){

        Scanner theScanner = new Scanner(System.in);
        System.out.println("provide a word to convert to all lowercase: ");
        String theWord = theScanner.nextLine();

        return "You provided, " + theWord + " and we converted it to: " + theWord.toLowerCase();
    }

    // lengthofWord - return something that lets us know how long the word provided was/is

    public String lengthOfWord(){
        Scanner theScanner = new Scanner(System.in);
        System.out.println("provide a word to be told the length of: ");
        String theWord = theScanner.nextLine();

        return "You provided" + theWord + " and the length of it is: " + theWord.length();

    }
}

