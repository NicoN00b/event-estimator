package Models;

import org.junit.Test;

import static org.junit.Assert.*;

public class EventTest {
    @Test
    public void newEventObjectCorrectlyCreated_true() throws Exception {
        Event testEvent = new Event(0, 0, 0, 0, 0);
        assertEquals(true, testEvent instanceof Event);
    }

    @Test
    public void newEventObjectCreatedCorrectGuests() throws Exception {
        Event newEvent = new Event(1, 0, 0, 0, 0);
        assertEquals(1, newEvent.getGuests());
    }

    @Test
    public void newEventObjectCreatedCorrectDinner() throws Exception {
        Event newEvent = new Event(1, 1, 0, 0, 0);
        assertEquals(12, newEvent.getDinnerCost());
    }

    @Test
    public void newEventObjectCreatedCorrectLibations() throws Exception {
        Event newEvent = new Event(1, 0, 1, 0, 0);
        assertEquals(5, newEvent.getDrinkCost());
    }

    @Test
    public void newEventObjectCreatedCorrectEntertainment() throws Exception {
        Event newEvent = new Event(1, 0, 0, 1, 0);
        assertEquals(50, newEvent.getEntertainmentCost());
    }

    @Test
    public void newEventObjectInstantiatesWithAllValues() throws Exception {
        Event newEvent = new Event(1, 1, 1, 1, 0);
        assertEquals(67, newEvent.giveEstimate());
    }

    @Test
    public void newEventObjectInstantiatesWithAllValues_Discount() throws Exception {
        Event newEvent = new Event(10, 1, 1, 1, 1);
        assertEquals(170, newEvent.giveEstimate());
    }

    @Test
    public void newEventDiscountNotApplicable() throws Exception {
        Event newEvent = new Event(1, 1, 1, 1, 1);
        assertEquals(67, newEvent.giveEstimate());
    }
}