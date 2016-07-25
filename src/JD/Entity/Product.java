package JD.Entity;

import java.math.BigInteger;

/**
 * Created by SCIP on 24.07.2016.
 */
public class Product {
    private int id;
    private int idCategory;
    private BigInteger price;
    private String name;
    private String partNumber;
    private int idBrand;

    public Product(int idCategory, BigInteger price, String name, String partNumber, int idBrand) {
        this.idCategory = idCategory;
        this.price = price;
        this.name = name;
        this.partNumber = partNumber;
        this.idBrand = idBrand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public BigInteger getPrice() {
        return price;
    }

    public void setPrice(BigInteger price) {
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

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", idCategory=" + idCategory +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", partNumber='" + partNumber + '\'' +
                ", idBrand=" + idBrand +
                '}';
    }
}
