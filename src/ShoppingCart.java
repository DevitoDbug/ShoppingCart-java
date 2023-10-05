import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShoppingCart implements ShoppingCartInterface{
    private List<Item> cartItems;

    ShoppingCart(){
        this.cartItems = new ArrayList<>();
    }

    @Override
    public List<Item> GetAllItems() {
        List<Item> allItems = new ArrayList<>() ;
        cartItems.forEach(item -> {
            if (!item.getDeleted()){
                allItems.add(item);
            }
        });
        return allItems;
    }

    @Override
    public void AddItemToCart(Item item) {
        if (this.cartItems == null){
            item.setItemId(1);
        }else{
            item.setItemId(this.cartItems.size()+1);//Setting the item id
        }
        this.cartItems.add(item);
    }

    @Override
    public void RemoveItem(int itemId) {
        for (Iterator<Item> iterator = cartItems.iterator(); iterator.hasNext();) {
            Item item = iterator.next();
            if (item.getItemId() == itemId) {
                item.setDeleted(true);
            }
        }
    }

    @Override
    public void RestoreItem(int itemId) {
        for (Iterator<Item> iterator = cartItems.iterator(); iterator.hasNext();) {
            Item item = iterator.next();
            if (item.getItemId() == itemId) {
                item.setDeleted(false);
            }
        }
    }

    @Override
    public void ForgetItem(int itemId) {
        for (Iterator<Item> iterator = cartItems.iterator(); iterator.hasNext();) {
            Item item = iterator.next();
            if (item.getItemId() == itemId) {
                iterator.remove();
            }
        }
    }

    @Override
    public double TotalPrice() {
        int totalPrice = 0;
        if (this.cartItems != null)
        for(int i = 0 ; i < cartItems.size() ; i++){
            totalPrice += cartItems.get(i).getPrice()*cartItems.get(i).getQuantity();
        }
        return totalPrice;
    }

    @Override
    public int NumberOfItems() {
        var numberOfItems = 0;
        for (int i = 0 ; i < cartItems.size() ; i ++){
            numberOfItems += cartItems.get(i).getQuantity();
        }
        return numberOfItems;
    }
}
