public interface ShoppingCartInterface {
    void AddItemToCart(Item item);
    void RemoveItem(int itemId);
    void RestoreItem(int itemId);
    void ForgetItem(int itemId);
    double TotalPrice();
    int NumberOfItems();
}
