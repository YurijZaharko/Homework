package JD.Entity;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by SCIP on 24.07.2016.
 */
public class Product {
    private int idCategory;
    private BigDecimal price;
    private String name;
    private String partNumber;
    private int idBrand;
    private int idCountry;

    public Product(int idCategory, BigDecimal price, String name, String partNumber, int idBrand, int idCountry) {
        this.idCategory = idCategory;
        this.price = price;
        this.name = name;
        this.partNumber = partNumber;
        this.idBrand = idBrand;
        this.idCountry = idCountry;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public int getIdBrand() {
        return idBrand;
    }

    public void setIdBrand(int idBrand) {
        this.idBrand = idBrand;
    }

    public int getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(int idCountry) {
        this.idCountry = idCountry;
    }

    @Override
    public String toString() {
        return "Product{" +
                ", idCategory=" + idCategory +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", partNumber='" + partNumber + '\'' +
                ", idBrand=" + idBrand +
                ", idCountry=" + idCountry +
                '}';
    }
}
