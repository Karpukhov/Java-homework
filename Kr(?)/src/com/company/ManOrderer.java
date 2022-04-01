
package com.company;
import java.util.*;
public abstract class ManOrderer extends Orderers {
    protected ArrayList<Double> OrderPrice = new ArrayList<>();

    public ManOrderer(ArrayList<Double> price) {
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
