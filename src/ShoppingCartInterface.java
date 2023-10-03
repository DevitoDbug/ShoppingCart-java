public interface ShoppingCartInterface {
    void AddItem(Item item);
    void RemoveItem(int itemId);
    void RestoreItem();
    double TotalPrice();
    int Quantity();
}
