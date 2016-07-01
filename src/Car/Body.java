package Car;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

/**
 * Created by SCIP on 16.06.2016.
 */
public class Body {
    private boolean openTrunk = false;
    private TypeOfBody typeOfBody;
    private int numberOfWheel;
    private ArrayList<Wheels> wheelsList = new ArrayList<>();


    public Body(int numberOfWheel, Wheels wheel,TypeOfBody typeOfBody) {
        this.typeOfBody = typeOfBody;
        this.numberOfWheel = numberOfWheel;
        wheelsList.add(wheel);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Body)) return false;
        Body body = (Body) o;
        return openTrunk == body.openTrunk &&
                numberOfWheel == body.numberOfWheel &&
                typeOfBody == body.typeOfBody &&
                Objects.equals(wheelsList, body.wheelsList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(openTrunk, typeOfBody, numberOfWheel, wheelsList);
    }

    @Override
    public String toString() {
        return "Body{" +
                "openTrunk=" + openTrunk +
                ", typeOfBody='" + typeOfBody + '\'' +
                ", numberOfWheel=" + numberOfWheel +
                ", wheelsList=" + wheelsList +
                '}';
    }

    public void setOpenTrunk() {
        if(openTrunk) {
            this.openTrunk = true;
            System.out.println("Trunk is open");
        } else {
            System.out.println("Trunk is already open");
        }
    }

    public void closeTrunk(){
        if(openTrunk){
            this.openTrunk = false;
            System.out.println("Trunk is closed");
        } else {
            System.out.println("Trunk is already closed");
        }
    }

    public int size() {
        return wheelsList.size();
    }

    public void removeAll() {
        this.wheelsList.clear();
    }

    public void add(Wheels element) {
        for (int i = 0; i < numberOfWheel; i++) {
            wheelsList.add(i, element);
        }
    }

    public Wheels getWheel() {
        if (!wheelsList.isEmpty()) {
            return wheelsList.get(0);
        }
        return null;
    }



    public TypeOfBody getTypeOfBody() {
        return typeOfBody;
    }
}
