package com.company;
import java.util.*;
public abstract class WomanOrderer extends Orderers {
    protected ArrayList<Double> OrderPrice = new ArrayList<>();

    public WomanOrderer(ArrayList<Double> price) {
        OrderPrice = price;
        this.OrderNumb = OrderNumb;
    }

    public int GetFullPrice () {
        int SumOrd = 0;
        for (int i = 0; i < OrderPrice.size(); i++){
            SumOrd += OrderPrice.get(i);
        }
        return SumOrd;
    }
}
