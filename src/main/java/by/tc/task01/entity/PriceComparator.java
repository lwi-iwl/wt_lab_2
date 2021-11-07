package by.tc.task01.entity;

import by.tc.task01.entity.Appliance;

import java.util.Comparator;
/**
 * The type of price comparator.
 */
public class PriceComparator implements Comparator<Appliance> {
    /**
     * Compare 2 objects.
     * @param obj1 first object ot compare.
     * @param obj2 second object to compare.
     * @return compare output.
     */
    @Override
    public int compare(Appliance obj1, Appliance obj2) {
        return Math.round(obj1.getPrice()-obj2.getPrice());
    }
}
