import Models.Event;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) throws IOException{

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        boolean programRunning = true;
        


//        try {
            while (programRunning) {
                System.out.println("Welcome to Entertainment Excellence Event Estimator" + " You may type '0' to exit. " +
                        "Please tell us how many people will be attending your event");
                userInput = bufferedReader.readLine();
                userGuests = Integer.parseInt(userInput);
                if (userInput.equals("q")) {
                    programRunning = false;
                } else {
                    //
                    System.out.println("Which courses will your guests be having, 'mezza', 'shawarma', 'dessert'. Please enter one at a time");

                    userInput = bufferedReader.readLine();
                }
                    if (userInput.equals("q")) {
                        programRunning = false;
                    } else {
                        userDinnerMenu.add(userInput);
                        System.out.println("Which beverages will your guests be having, 'beer and wine', 'spirits', 'nonalcoholic'");
                        userInput = bufferedReader.readLine();
                    }
                        if (userInput.equals("q")) {
                            programRunning = false;
                        } else {
                            userLibations.add(userInput);
                            System.out.println("Which entertainment will your guests be enjoying, 'DJ', 'String Quartet', 'Band'");
                            userInput = bufferedReader.readLine();
                        }
                            if (userInput.equals("q")) {
                                programRunning = false;
                            } else {
                                userEntertainment.add(userInput);
                            }


                Event userEvent = new Event(userGuests, userDinnerMenu, userLibations, userEntertainment);


                System.out.println("Your estimated cost is $" + userEvent.giveEstimate());
                System.out.println("Is your party for your 'nonprofit' or are you a 'student'");
                userInput = bufferedReader.readLine();
                if (userInput.equals("nonprofit")) {
                    System.out.println("Your new estimate is " + userEvent.nonProfit());
                } else if (userInput.equals("student")) {
                    System.out.println("Your new estimate is " + userEvent.student());
                } else
                    programRunning = false;
            }
//        }
//        catch (IOException e) {
//            e.printStackTrace();
//        }

    }
}
