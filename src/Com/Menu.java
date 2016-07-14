package Com;

/**
 * Created by SCIP on 13.07.2016.
 */
public class Menu {
    private Scan scan = new Scan();
    ServiceCommodity serviceCommodity = new ServiceCommodity();
    public void print(String massage){
        System.out.println(massage);
    }

    int mainMenu(){
        print("Main menu");
        print("1. Add commodity to list");
        print("2. Remove from list");
        print("3. Replace commodity");
        print("4. Sort list");
        print("0. exit");
        return scan.readInt("Choose number");
    }

    Commodity createCommodity(){
        Commodity commodity = new Commodity(scan.readString("Enter name"), scan.readInt("Enter price"), scan.readInt("Enter weight"), scan.readInt("Enter volume"));
        return commodity;
    }

    int removeMenu(){
        print("Remove menu");
        print("1. Remove comparing commodity");
        print("2. Remove by name");
        print("3. Remove by price");
        print("4. Remove by weight");
        print("5. Remove by volume");
        return scan.readInt("Choose number");
    }

    Commodity findMenu(){
        print("Enter commodity to remove");
        return createCommodity();
    }

    Commodity setMenu(){
        print("Enter commodity to set");
        return createCommodity();
    }

    int field(){
        print("Sort by:");
        print("1. Name");
        print("2. Price");
        print("3. Weight");
        print("4. Volume");
        return scan.readInt("Choose number");
    }

    int order(){
        print("Order:");
        print("1. ASC");
        print("2. DESC");
        return scan.readInt("Choose number");
    }
}
