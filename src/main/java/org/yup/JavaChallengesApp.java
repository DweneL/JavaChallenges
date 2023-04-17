package org.yup;

//Doing to show you an import for now but this is not required since both are in the package
import org.yup.Challenges;
public class JavaChallengesApp {



    public static void main(String[] args){

        //this code is running greeting

        //Create a new instance of the  challenges class so we can use the challenges in our application
        Challenges challenges = new Challenges();

        //This runs the greeting method from our challenges and returns a string greeting and
        //stores it in the greeting variable we created
       // String greeting = challenges.greeting("Dwene", 22);

                //this prints the greeting to the console
       // System.out.println(greeting);

        //code below is running greetingsWithUserInput()

       // String greetingWithUserInput = challenges.greetingWithUserInput();
       // System.out.println(greetingWithUserInput);

        System.out.println(challenges.addTwoNumbers());
        System.out.println(challenges.subtractTwoNumbers());

    }
}
