package Com.Comporators;

import Com.Commodity;

import java.util.Comparator;

/**
 * Created by SCIP on 13.07.2016.
 */
public class CommodityComparatorByWeightDesc implements Comparator<Commodity>{
    @Override
    public int compare(Commodity o1, Commodity o2) {
        return o2.getWeight() - o1.getWeight();
    }
}
