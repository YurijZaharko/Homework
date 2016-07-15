package Mapa;

import java.util.Objects;

/**
 * Created by SCIP on 14.07.2016.
 */
public class Pet {
    private final String petName;
    private final Animals type;

    public Pet(String petName, Animals type) {
        this.petName = petName;
        this.type = type;
    }

    public String getPetName() {
        return petName;
    }

    public Animals getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pet)) return false;
        Pet pet = (Pet) o;
        return Objects.equals(petName, pet.petName) &&
                type == pet.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(petName, type);
    }

    @Override
    public String toString() {
        return "Pet{" +
                "petName='" + petName + '\'' +
                ", type=" + type +
                '}';
    }
}
