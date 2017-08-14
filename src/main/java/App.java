import Models.Event;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class App {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        boolean programRunning = true;


        while (programRunning) {
            System.out.println("Welcome to Entertainment Excellence Event Estimator, we look forward to providing you with the most memorable evening.");
            System.out.println("This program will guide you through our options");
            System.out.println("Please tell us how many people will be attending your event (numerals only)");
            int guests = Integer.parseInt(bufferedReader.readLine());
            if (guests < 1 || guests >= 1001) {
                System.out.println("We are sorry, you entered an invalid number, we can only accommodate events up 1000 attendees");
                System.out.println("Please keep us in mind for future events. Goodbye.");
                programRunning = false;
            } else {
                System.out.println("Please choose from one of our fabulous meal options");
                System.out.println("1) A Mediterranean feast including a complete mezza selection, delectable shawarma and kebabs, and finished off with homemade Lebanese baklava, halva, and marzipan");
                System.out.println("2) An endless array of freshly prepared Cantonese Dim Sum, Roasted Duck and Wild Mushroom Entrees, and traditional custards for Dessert");
                System.out.println("3) New American Comfort and Class delivered roasted and mashed roots with wild mushroom gravy, spring green salad, and a succulent rib-eye with a delectable balsamic reduction, finished off with our famous selection of pies.");
                System.out.println("Please enter the number that corresponds to your choice.");
                int dinner = Integer.parseInt(bufferedReader.readLine());
                System.out.println("Your event will include an award winning beverage program. Here are your options (please enter the corresponding number).");
                System.out.println("1) Our Non-Alcoholic bar includes organic coffees and teas, soft drinks, home-brewed kombucha and kefir water, and espresso service");
                System.out.println("2) In addition, you can add a selection of local and internationally renowned craft beers  and fine wines");
                System.out.println("3) And finally, you may add vintage and original cocktails prepared by master mixologists.");
                int drinks = Integer.parseInt(bufferedReader.readLine());
                System.out.println("We work with some of the most talented entertainers in the industry and provide remarkable value due the volume of business we bring to our talent (Again, please enter the corresponding number to your selection or 0 if you do not require entertainment).");
                System.out.println("1) Our portfolio of Djs can match your tastes perfectly.");
                System.out.println("2) For truly classy affair, book one of our brilliant pianists.");
                System.out.println("3) Or for a party that won't stop, pick from one of our lively bands.");
                int entertainment = Integer.parseInt(bufferedReader.readLine());
                System.out.println("We offer discounts to make our services more accessible.  If you are a student, please enter 1.  If this event is for a non-profit, please enter 2.  Otherwise, enter 0.");
                int discount = Integer.parseInt(bufferedReader.readLine());

                Event userEvent = new Event(guests, dinner, drinks, entertainment, discount);


                System.out.println("Your estimated cost is $" + userEvent.giveEstimate());
                break;
            }
        }
    }
}
