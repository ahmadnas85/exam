package CustomersOrderManagementSoftwareSystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class VipOrder extends Order{
    public VipOrder(Integer id, String name, String deliveryAddress, ArrayList<Item> listOfItemsInTheOrder, Customer orderCustomer, PaymentType paymentType) throws Exception {
        super(id, name, deliveryAddress, listOfItemsInTheOrder, orderCustomer, paymentType);
        super.setOrderTotalPrice(calculateOrderTotalPrice(listOfItemsInTheOrder));
        super.updateCustomerFavorite(listOfItemsInTheOrder);
    }
    public Integer calculateOrderTotalPrice(ArrayList<Item> list) throws Exception {
        Integer totalPrice = 0;
        if (super.getOrderCustomer().getCustomerType() == CustomerType.VIP) {
            if (list.size()>0) {
                for (int i = 0; i < list.size(); i++) {
                    totalPrice += list.get(i).getItemPrice();
                }
            }
            if (super.getOrderCustomer().getCustomerDiscount() != null) {
                System.out.println(totalPrice);
                System.out.println(1 - Double.parseDouble(super.getOrderCustomer().getCustomerDiscount()));
                totalPrice = (int) (totalPrice * (1 - Double.parseDouble(super.getOrderCustomer().getCustomerDiscount())));
            }
        } else {
            throw new Exception("this customer is no a VIP customer, please create a regular order.");
        }
        return totalPrice;
    }
}

