import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {

    @Test
    void getAllItems() {
        var item = new Item("Milk", 6700 , 10);
        var cart = new ShoppingCart();
        cart.AddItemToCart(item);
        var list = cart.GetAllItems();

        assertFalse(list.isEmpty());
    }

    @Test
    void addItemToCart() {
    }

    @Test
    void removeItem() {
    }

    @Test
    void restoreItem() {
    }

    @Test
    void forgetItem() {
    }

    @Test
    void totalPrice() {
    }

    @Test
    void numberOfItems() {
    }
}