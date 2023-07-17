package CustomersOrderManagementSoftwareSystem;

import java.time.LocalDate;
import java.util.ArrayList;

public class RegularOrder extends Order{
    public RegularOrder(Integer id, String name, String deliveryAddress, ArrayList<Item> listOfItemsInTheOrder, Customer orderCustomer, PaymentType paymentType, LocalDate orderDate) {
        super(id, name, deliveryAddress, listOfItemsInTheOrder, orderCustomer, paymentType);
        super.setOrderTotalPrice(calculateOrderTotalPrice(listOfItemsInTheOrder));
        super.updateCustomerFavorite(listOfItemsInTheOrder);
    }
    public Integer calculateOrderTotalPrice(ArrayList<Item> list) {
        Integer totalPrice = 0;
            if (list.size()>0) {
                for (int i = 0; i < list.size(); i++) {
                    totalPrice += list.get(i).getItemPrice();
                }
            }
        return totalPrice;
    }
}
