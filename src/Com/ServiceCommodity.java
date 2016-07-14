package Com;

import Com.Comporators.*;

import java.util.Iterator;
import java.util.List;

/**
 * Created by SCIP on 13.07.2016.
 */
public class ServiceCommodity {

    void addToList(List<Commodity> commodityList, Commodity commodity){
        commodityList.add(commodity);
    }

    void removeFromList(List<Commodity> commodityList, Commodity difference){
        Iterator<Commodity> iterator = commodityList.listIterator();
        Commodity temp = null;
        while (iterator.hasNext()){
            temp = iterator.next();
        }
        if (temp != null && temp.equals(difference)){
            iterator.remove();
        }

    }

    void removeFromListIfName(List<Commodity> commodityList, String name){
        Iterator<Commodity> iterator = commodityList.listIterator();
        Commodity temp = null;
        while (iterator.hasNext()){
            temp = iterator.next();
        }
        if (temp != null && temp.getName().equals(name)){
            iterator.remove();
        }
    }

    void removeFromListIfPrice(List<Commodity> commodityList, int price){
        Iterator<Commodity> iterator = commodityList.listIterator();
        Commodity temp = null;
        while (iterator.hasNext()){
            temp = iterator.next();
        }
        if (temp != null && temp.getPrice() == price){
            iterator.remove();
        }
    }

    void removeFromListIfWeight(List<Commodity> commodityList, int weight){
        Iterator<Commodity> iterator = commodityList.listIterator();
        Commodity temp = null;
        while (iterator.hasNext()){
            temp = iterator.next();
        }
        if (temp != null && temp.getWeight() == weight){
            iterator.remove();
        }
    }

    void removeFromListIfVolume(List<Commodity> commodityList, double volume){
        Iterator<Commodity> iterator = commodityList.listIterator();
        Commodity temp = null;
        while (iterator.hasNext()){
            temp = iterator.next();
        }
        if (temp != null && temp.getVolume() == volume){
            iterator.remove();
        }
    }

    void findRemoveAndSet(List<Commodity> commodityList, Commodity find, Commodity set){
        int i = commodityList.indexOf(find);
        commodityList.set(i, set);

    }

    public void sortByNameAsc(List<Commodity> commodityList){
        commodityList.sort(new CommodityComparatorByNameAsc());
    }

    public void sortByNameDesc(List<Commodity> commodityList){
        commodityList.sort(new CommodityComparatorByNameDesc());
    }

    public void sortByPriceAsc(List<Commodity> commodityList){
        commodityList.sort(new CommodityComparatorByPriceAsc());
    }

    public void sortByPriceDesc(List<Commodity> commodityList){
        commodityList.sort(new CommodityComparatorByPriceDesc());
    }

    public void sortByVolumeAsc(List<Commodity> commodityList){
        commodityList.sort(new CommodityComparatorByVolumeAsc());
    }
    public void sortByVolumeDesc(List<Commodity> commodityList){
        commodityList.sort(new CommodityComparatorByVolumeDesc());
    }

    public void sortByWeightAsc(List<Commodity> commodityList){
        commodityList.sort(new CommodityComparatorByWeightAsc());
    }

    public void sortByWeightDesc(List<Commodity> commodityList){
        commodityList.sort(new CommodityComparatorByWeightDesc());
    }

}
