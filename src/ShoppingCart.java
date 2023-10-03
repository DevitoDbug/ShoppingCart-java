import java.util.List;

public class ShoppingCart implements ShoppingCartInterface{
    private int NumberOfItems ;
    private List<Item> cartItems;

    ShoppingCart(List<Item> cartItems){
        this.cartItems = cartItems;
    }

    @Override
    public void AddItem(Item item) {

    }

    @Override
    public void RemoveItem(int itemId) {

    }

    @Override
    public void RestoreItem() {

    }

    @Override
    public double TotalPrice() {
        int totalPrice = 0;
        for(int i = 0 ; i < cartItems.size() ; i++){
            totalPrice += cartItems.get(i).getPrice();
        }
        return totalPrice;
    }

    @Override
    public int Quantity() {
        return 0;
    }
}
