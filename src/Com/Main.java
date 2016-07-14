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
                    System.out.println(commodityList);
                    break;
                }
                case 2 : {
                    switch (menu.removeMenu()){
                        case 1:{
                            serviceCommodity.removeFromList(commodityList, menu.createCommodity());
                            break;
                        }case 2:{
                            serviceCommodity.removeFromListIfName(commodityList, scan.readString("Enter name"));
                            break;
                        }case 3:{
                            serviceCommodity.removeFromListIfPrice(commodityList, scan.readInt("Enter price"));
                            break;
                        }case 4:{
                            serviceCommodity.removeFromListIfWeight(commodityList, scan.readInt("Enter weight"));
                            break;
                        }case 5:{
                            serviceCommodity.removeFromListIfVolume(commodityList, scan.readInt("Enter volume"));
                            break;
                        }
                    }
                    System.out.println(commodityList);
                    break;
                }
                case 3:{
                    serviceCommodity.findRemoveAndSet(commodityList, menu.findMenu(), menu.setMenu());
                    System.out.println(commodityList);
                    break;
                }
                case 4:{
                    switch (menu.field()){
                        case 1:{
                            switch (menu.order()){
                                case 1:{
                                    serviceCommodity.sortByNameAsc(commodityList);
                                    System.out.println(commodityList);
                                    break;
                                }case 2:{
                                    serviceCommodity.sortByNameDesc(commodityList);
                                    System.out.println(commodityList);
                                    break;
                                }
                            }

                            break;
                        }
                        case 2:{
                            switch (menu.order()){
                                case 1:{
                                    serviceCommodity.sortByPriceAsc(commodityList);
                                    System.out.println(commodityList);
                                    break;
                                }case 2:{
                                    serviceCommodity.sortByPriceDesc(commodityList);
                                    System.out.println(commodityList);
                                    break;
                                }
                            }

                            break;
                        }
                        case 3:{
                            switch (menu.order()){
                                case 1:{
                                    serviceCommodity.sortByVolumeAsc(commodityList);
                                    System.out.println(commodityList);
                                    break;
                                }case 2:{
                                    serviceCommodity.sortByVolumeDesc(commodityList);
                                    System.out.println(commodityList);
                                    break;
                                }
                            }
                            break;
                        }
                        case 4:{
                            switch (menu.order()){
                                case 1:{
                                    serviceCommodity.sortByWeightAsc(commodityList);
                                    System.out.println(commodityList);
                                    break;
                                }case 2:{
                                    serviceCommodity.sortByWeightDesc(commodityList);
                                    System.out.println(commodityList);
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    break;
                }
                default: {
                    isRun =false;
                }

            }
        }
    }
}
