import java.util.List;

public class ShoppingCart implements ShoppingCartInterface{
    private List<Item> cartItems;

    ShoppingCart(List<Item> cartItems){
        this.cartItems = cartItems;
    }

    @Override
    public void AddItemToCart(Item item) {
        cartItems.add(item);
    }

    @Override
    public void RemoveItem(int itemId) {
        cartItems.get(itemId).setDeleted(true);
    }

    @Override
    public void RestoreItem(int itemId) {
        cartItems.get(itemId).setDeleted(false);
    }

    @Override
    public void ForgetItem(int itemId) {
        cartItems.remove(itemId);
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
    public int NumberOfItems() {
        return cartItems.size();
    }
}
