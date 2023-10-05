import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {

    @Test
    void getAllItemsShouldNotReturnEmptyList() {
        var item = new Item("Milk", 6700 , 10);
        var cart = new ShoppingCart();
        cart.AddItemToCart(item);
        var list = cart.GetAllItems();

        assertFalse(list.isEmpty());
    }

    @Test
    void getAllItemsWithTwoItemsShouldReturnListWithTwoItems() {
        var item1 = new Item("Milk", 6700 , 10);
        var item2 = new Item("Clothes", 80 , 10);

        var cart = new ShoppingCart();
        cart.AddItemToCart(item1);
        cart.AddItemToCart(item2);
        var list = cart.GetAllItems();

        assertEquals(2 , list.size());
    }

    @Test
    void addItemToCartShouldResultInCartNotBeingEmpty() {
        var item1 = new Item("Milk", 6700 , 10);

        var cart = new ShoppingCart();
        cart.AddItemToCart(item1);
        var list = cart.GetAllItems();

        assertFalse(list.isEmpty());
    }

    @Test
    void removeItemShouldReduceCartListSizeByOne() {
        var item1 = new Item("Milk", 6700 , 10);
        var item2 = new Item("Clothes", 80 , 10);

        var cart = new ShoppingCart();
        cart.AddItemToCart(item1);
        cart.AddItemToCart(item2);
        cart.RemoveItem(item1.getItemId());
        var list = cart.GetAllItems();

        assertNotEquals(2, list.size());
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