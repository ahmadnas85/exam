package CustomersOrderManagementSoftwareSystem;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Order {
    private Integer id;
    private String name;
    private String deliveryAddress;
    private ArrayList<Item> ListOfItemsInTheOrder;
    private Customer orderCustomer;
    private Integer orderTotalPrice;
    private PaymentType paymentType;
    private LocalDate orderDate;

    public Order(Integer id, String name, String deliveryAddress, ArrayList<Item> listOfItemsInTheOrder, Customer orderCustomer, PaymentType paymentType) {
        this.id = id;
        this.name = name;
        this.deliveryAddress = deliveryAddress;
        this.ListOfItemsInTheOrder = listOfItemsInTheOrder;
        this.orderCustomer = orderCustomer;
        this.paymentType = paymentType;
        this.orderDate = LocalDate.now();
        this.orderCustomer.setListOfFavoriteItems(updateCustomerFavorite(listOfItemsInTheOrder));

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public ArrayList<Item> getListOfItemsInTheOrder() {
        return ListOfItemsInTheOrder;
    }

    public void setListOfItemsInTheOrder(ArrayList<Item> listOfItemsInTheOrder) {
        ListOfItemsInTheOrder = listOfItemsInTheOrder;
    }

    public Customer getOrderCustomer() {
        return orderCustomer;
    }

    public void setOrderCustomer(Customer orderCustomer) {
        this.orderCustomer = orderCustomer;
    }

    public Integer getOrderTotalPrice() {
        return orderTotalPrice;
    }

    public void setOrderTotalPrice(Integer orderTotalPrice) {
        this.orderTotalPrice = orderTotalPrice;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }
    public ArrayList<Item> updateCustomerFavorite(ArrayList<Item> newList) {
        boolean notThere = true;
        for (int i = 0; i < newList.size(); i++) {
            notThere = true;
            for (int j = 0; j < this.orderCustomer.getListOfFavoriteItems().size(); j++) {
                if ((newList.get(i).getItemName() == this.orderCustomer.getListOfFavoriteItems().get(j).getItemName()) & notThere) {
                    notThere = false;
                    break;
                }
            }
            if (notThere) {
                this.orderCustomer.addToFavorite(newList.get(i));
            }
        }
        return this.orderCustomer.getListOfFavoriteItems();
    }
}
