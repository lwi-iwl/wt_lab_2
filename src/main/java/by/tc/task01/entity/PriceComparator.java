package by.tc.task01.entity;

import by.tc.task01.entity.Appliance;

import java.util.Comparator;

public class PriceComparator implements Comparator<Appliance> {
    @Override
    public int compare(Appliance obj1, Appliance obj2) {
        return Math.round(obj1.getPrice()-obj2.getPrice());
    }
}
