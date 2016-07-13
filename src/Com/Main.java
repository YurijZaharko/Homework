package Com;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by SCIP on 13.07.2016.
 */
public class Main {
    public static void main(String[] args) {
        List<Commodity> commodityList = new LinkedList<>();
        Scan scan = new Scan();
        Menu menu = new Menu();
        ServiceCommodity serviceCommodity = new ServiceCommodity();

        boolean isRun = true;
        while (isRun){
            switch (menu.mainMenu()){
                case 1 :{
                    serviceCommodity.addToList(commodityList, menu.createCommodity());
                }
                case 2 : {
                    switch (menu.removeMenu()){
                        case 1:{
                            serviceCommodity.removeFromList(commodityList, menu.createCommodity());
                        }case 2:{
                            serviceCommodity.removeFromListIfName(commodityList, scan.readString("Enter name"));
                        }case 3:{
                            serviceCommodity.removeFromListIfPrice(commodityList, scan.readInt("Enter price"));
                        }case 4:{
                            serviceCommodity.removeFromListIfWeight(commodityList, scan.readInt("Enter weight"));
                        }case 5:{
                            serviceCommodity.removeFromListIfVolume(commodityList, scan.readInt("Enter volume"));
                        }
                    }
                }
                case 3:{
                    serviceCommodity.findRemoveAndSet(commodityList, menu.findMenu(), menu.setMenu());
                }
                case 4:{
                    switch (menu.field()){
                        case 1:{
                            switch (menu.order()){
                                case 1:{

                                }
                            }
                        }
                    }

                }

            }
        }
    }
}
