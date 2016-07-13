package Com;

import java.util.Objects;


/**
 * Created by SCIP on 13.07.2016.
 */
public class Commodity implements Comparable<Commodity>{
    final private String name;
    final private int price;
    final private int weight;
    final private double volume;

    public Commodity(String name, int price, int weight, double volume) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.volume = volume;
    }

    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Commodity)) return false;
        Commodity commodity = (Commodity) o;
        return price == commodity.price &&
                weight == commodity.weight &&
                Double.compare(commodity.volume, volume) == 0 &&
                Objects.equals(name, commodity.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, weight, name, volume);
    }



    @Override
    public String toString() {
        return "Commodity{" +
                "price=" + price +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }

    @Override
    public int compareTo(Commodity o) {
        int result = name.compareTo(o.getName());
        if(result != 0){
            return result;
        }

        result = price - o.getPrice();
        if(result != 0){
            return result;
        }

        result = weight - o.getWeight();
        if(result != 0){
            return result;
        }

        result = Double.compare(volume, o.getVolume());
        if(result != 0){
            return result;
        }
        return 0;
    }
}
