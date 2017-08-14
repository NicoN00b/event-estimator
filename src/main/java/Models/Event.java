package Models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Event {

    private int mGuests;
    private int mDinnerMenu;
    private int mLibations;
    private int mEntertainment;
    private int mDiscount;


    Map<Integer, Integer> dinnerCost = new HashMap();
    Map<Integer, Integer> drinkCost = new HashMap();
    Map<Integer, Integer> entertainmentCost = new HashMap();
    Map<Integer, Integer> discountCode = new HashMap<>();



    public Event(int mGuests, int mDinnerMenu, int mLibations, int mEntertainment, int mDiscount){
        this.mGuests = mGuests;
        this.mDinnerMenu = mDinnerMenu;
        this.mLibations = mLibations;
        this.mEntertainment = mEntertainment;
        this.mDiscount = mDiscount;

        dinnerCost.put(1, 12);
        dinnerCost.put(2, 15);
        dinnerCost.put(3, 18);
        drinkCost.put(1, 5);
        drinkCost.put(2, 9);
        drinkCost.put(3, 14);
        entertainmentCost.put(1, 50);
        entertainmentCost.put(2, 200);
        entertainmentCost.put(3, 1000);
        discountCode.put(1, 50);
        discountCode.put(2, 100);

    }



    public Integer getDiscountCode(Integer mDiscount) {

        return mDiscount;
    }

    public int getDinnerCost() {

        return this.mGuests*dinnerCost.get(mDinnerMenu);
    }

    public int getDrinkCost() {

        return this.mGuests*drinkCost.get(mLibations);
    }

    public int getEntertainmentCost() {

        return entertainmentCost.get(mEntertainment);
    }

    public int giveEstimate() {
        return (this.getDinnerCost() + this.getDrinkCost() + this.getEntertainmentCost() - this.getDiscountCode(mDiscount));
    }

    public int getGuests() {
        return this.mGuests;
    }

    public Integer getmDinnerMenu() {
        return mDinnerMenu;
    }

    public Integer getmLibations() {
        return mLibations;
    }

    public Integer getmEntertainment() {
        return mEntertainment;
    }

}
