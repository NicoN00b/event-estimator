package Models;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class EventTest {
    @Test
    public void newEventObjectCorrectlyCreated_true() throws Exception {
        Event testEvent = new Event(0, 0, 0, 0 );
        assertEquals(true, testEvent instanceof Event);
    }

    @Test
    public void newEventObjectCreatedCorrectGuests_true() throws Exception {
        Event newEvent = new Event(1, 0, 0, 0);
        assertEquals(1, newEvent.getGuests());
    }
//    @Test
//    public void newGuest_returnDinnerChoice() throws Exception {
//        int testGuests = 1;
//        List<String> testDinnerMenu = new ArrayList<>();
//        testDinnerMenu.add("mezza sampler");
//        List<String> testLibations = new ArrayList<>();
//        List<String> testEntertainment = new ArrayList<>();
//        Event testEvent = new Event(testGuests, testDinnerMenu, testLibations, testEntertainment);
//        assertEquals(testDinnerMenu, testEvent.getDinnerMenu());
//    }
//    @Test
//    public void newGuest_returnLibationChoice() throws Exception {
//        int testGuests = 1;
//        List<String> testDinnerMenu = new ArrayList<>();
//        testDinnerMenu.add("mezza sampler");
//        List<String> testLibations = new ArrayList<>();
//        testLibations.add("Spirits Bar");
//        List<String> testEntertainment = new ArrayList<>();
//        Event testEvent = new Event(testGuests, testDinnerMenu, testLibations, testEntertainment);
//        assertEquals(testLibations, testEvent.getLibations());
//    }
//    @Test
//    public void newGuest_returnEntertainmentChoice() throws Exception {
//        int testGuests = 1;
//        List<String> testDinnerMenu = new ArrayList<>();
//        testDinnerMenu.add("mezza sampler");
//        List<String> testLibations = new ArrayList<>();
//        testLibations.add("Spirits Bar");
//        List<String> testEntertainment = new ArrayList<>();
//        testEntertainment.add("String Quartet");
//        Event testEvent = new Event(testGuests, testDinnerMenu, testLibations, testEntertainment);
//        assertEquals(testEntertainment, testEvent.getEntertainment());
//    }
//    //This test or code preceeding it broke everything :(
//    @Test
//    public void newCost_giveEstimate() throws Exception {
//        int testGuests = 1;
//        List<String> testDinnerMenu = new ArrayList<>();
//        testDinnerMenu.add("mezza sampler");
//        List<String> testLibations = new ArrayList<>();
//        testLibations.add("Spirits Bar");
//        List<String> testEntertainment = new ArrayList<>();
//        testEntertainment.add("String Quartet");
//        Event testEvent = new Event(testGuests, testDinnerMenu, testLibations, testEntertainment);
//        double expected = 222.98;
//        assertEquals(228.98, testEvent.giveEstimate());
//    }
//
//
//
}