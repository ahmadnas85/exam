package CustomersOrderManagementSoftwareSystem;

import java.util.ArrayList;

public class Customer {
    private Integer id;
    private String firstName;
    private String lastName;
    private String Email;
    private String deliveryAddress;
    private CustomerType customerType;
    private String customerDiscount;
    private ArrayList<Item> ListOfFavoriteItems;
    private Gift customerGift;

    public Customer(Integer id, String firstName, String lastName, String email, String deliveryAddress, CustomerType customerType, String customerDiscount, ArrayList<Item> listOfFavoriteItems) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.Email = email;
        this.deliveryAddress = deliveryAddress;
        this.customerType = customerType;
        this.customerDiscount = customerDiscount;
        this.ListOfFavoriteItems = listOfFavoriteItems;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public String getCustomerDiscount() {
        return customerDiscount;
    }

    public void setCustomerDiscount(String customerDiscount) {
        this.customerDiscount = customerDiscount;
    }

    public ArrayList<Item> getListOfFavoriteItems() {
        return ListOfFavoriteItems;
    }

    public void setListOfFavoriteItems(ArrayList<Item> listOfFavoriteItems) {
        ListOfFavoriteItems = listOfFavoriteItems;
    }

    public Gift getCustomerGift() {
        return customerGift;
    }

    public ArrayList<Item> addToFavorite(Item item){
        this.getListOfFavoriteItems().add(item);
        return this.ListOfFavoriteItems;
    }

    public ArrayList<Item> removeFromFavorite(Item item){
        if (this.ListOfFavoriteItems.contains(item)){
            this.getListOfFavoriteItems().remove(item);
        }
        return this.ListOfFavoriteItems;
    }
    public void openGift(){
        if (this.customerGift != null) {
            System.out.println("Congratulations! you got a new gift! Enjoy!");
        }
    }
    public void takeGift(Gift gift){
        this.customerGift = gift;
    }
}
