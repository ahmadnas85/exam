package CustomersOrderManagementSoftwareSystem;

public class GiveGift <T> implements Gift{
    private T item;
    public GiveGift(T item){
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    @Override
    public void openGift() {
        System.out.println("Congratulations! you got a new gift! Enjoy!");
    }

}
