package CustomersOrderManagementSoftwareSystem;

import java.util.ArrayList;

import static CustomersOrderManagementSoftwareSystem.CustomerType.REGULAR;
import static CustomersOrderManagementSoftwareSystem.CustomerType.VIP;
import static CustomersOrderManagementSoftwareSystem.PaymentType.CASH;

public class Main {
    public static void main(String[] args) throws Exception {
        Item item1 = new Item(1,"Computer",1500);
        Item item2 = new Item(2,"mouse",150);
        Item item3 = new Item(3,"screen",300);
        Item item4 = new Item(4,"laptop",15000);
        Item item5 = new Item(5,"camera",30);
        Item item6 = new Item(6,"keyboard",100);
        Item item7 = new Item(7,"light",10);
        Item item8 = new Item(8,"table",2000);
        Item item9 = new Item(9,"chair",180);
        Item item10 = new Item(10,"speakers",360);
        ArrayList<Item> defaultArray = new ArrayList<Item>();

        ArrayList<Item> firstOrderList = new ArrayList<Item>();
            firstOrderList.add(item2);
            firstOrderList.add(item5);

        Customer cus1 = new Customer(100,"jamel", "yone" , "j.yon@hotmail.com", "haifa",VIP,"0.1",defaultArray);
        Customer cus2 = new Customer(200,"yose", "kohen" , "yos@gmail.com", "tel aviv",REGULAR,null,defaultArray);
        Customer cus3 = new Customer(300,"jon", "doe" , "jond@gamil.com", "haifa",VIP,"0.3",defaultArray);
        System.out.println(cus1.getListOfFavoriteItems());

        VipOrder order1 = new VipOrder(1,"first order","ako",firstOrderList,cus1,CASH);
        System.out.println(cus1.getListOfFavoriteItems());
        System.out.println(order1.getOrderTotalPrice());
        GiveGift<Item> gift = new GiveGift<>(item10);
        cus1.takeGift(gift);
        cus1.openGift();
    }

}
