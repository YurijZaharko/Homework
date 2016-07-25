package JD.Entity;

/**
 * Created by SCIP on 24.07.2016.
 */
public class Barnd {
    private int id;
    private String name;
    private int idCountry;

    public Barnd(String name, int idCountry) {
        this.name = name;
        this.idCountry = idCountry;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(int idCountry) {
        this.idCountry = idCountry;
    }

    @Override
    public String toString() {
        return "Barnd{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", idCountry=" + idCountry +
                '}';
    }
}
