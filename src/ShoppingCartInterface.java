import java.util.List;

public interface ShoppingCartInterface {
    List<Item> GetAllItems();
    void AddItemToCart(Item item);
    void RemoveItem(int itemId);
    void RestoreItem(int itemId);
    void ForgetItem(int itemId);
    double TotalPrice();
    int NumberOfItems();
}
