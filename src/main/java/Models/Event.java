package Models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Event {

    private int mGuests;
    private Integer mDinnerMenu;
    private Integer mLibations;
    private Integer mEntertainment;
    private Integer mDiscount;


    Map<Integer, Integer> dinnerCost = new HashMap();
    Map<Integer, Integer> drinkCost = new HashMap();
    Map<Integer, Integer> entertainmentCost = new HashMap();
    Map<Integer, Integer> discountCode = new HashMap<>();



    public Event(Integer mGuests, Integer mDinnerMenu, Integer mLibations, Integer mEntertainment){
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

    public int getDinnerCost(Integer mDinnerMenu) {
        return this.mGuests*dinnerCost.get(mDinnerMenu);
    }

    public int getDrinkCost(Integer mLibations) {
        return this.mGuests*drinkCost.get(mLibations);
    }

    public int getEntertainmentCost(Integer mEntertainment) {
        return entertainmentCost.get(mEntertainment);
    }

    public int giveEstimate() {
        return (this.getDinnerCost(mDinnerMenu) + this.getDrinkCost(mLibations) + this.getEntertainmentCost(mEntertainment) - this.getDiscountCode(mDiscount));
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
