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
    void removeItemShouldNotBeInCart() {
        var item1 = new Item("Milk", 6700 , 10);
        var item2 = new Item("Clothes", 80 , 10);

        var cart = new ShoppingCart();
        cart.AddItemToCart(item1);
        cart.AddItemToCart(item2);
        cart.RemoveItem(item1.getItemId());
        var list = cart.GetAllItems();

        assertFalse(list.contains(item1));
    }


    @Test
    void restoreItemShouldBeInTheCartList() {
        var item1 = new Item("Milk", 6700 , 10);
        var item2 = new Item("Clothes", 80 , 10);

        var cart = new ShoppingCart();
        cart.AddItemToCart(item1);
        cart.AddItemToCart(item2);
        cart.RemoveItem(item1.getItemId());
        cart.RestoreItem(item1.getItemId());
        var list = cart.GetAllItems();

        assertTrue(list.contains(item1));
    }

    @Test
    void forgetItemShouldRemoveItemFromList() {
        var item1 = new Item("Milk", 6700 , 10);
        var item2 = new Item("Clothes", 80 , 10);

        var cart = new ShoppingCart();
        cart.AddItemToCart(item1);
        cart.AddItemToCart(item2);
        cart.ForgetItem(item1.getItemId());
        var list = cart.GetAllItems();

        assertFalse(list.contains(item1));
    }

    @Test
    void forgetItemShouldNotBeRestorable() {
        var item1 = new Item("Milk", 6700 , 10);
        var item2 = new Item("Clothes", 80 , 10);

        var cart = new ShoppingCart();
        cart.AddItemToCart(item1);
        cart.AddItemToCart(item2);
        cart.ForgetItem(item1.getItemId());
        cart.RestoreItem(item1.getItemId());
        var list = cart.GetAllItems();

        assertFalse(list.contains(item1));
    }

    @Test
    void totalPriceForTenItemsEachSixtyShouldBeSixHundred() {
        var item = new Item("Milk", 60 , 10);
        var cart = new ShoppingCart();
        cart.AddItemToCart(item);
        var total = cart.TotalPrice();

        assertEquals(600, total);
    }

    @Test
    void totalPriceForTwoItemsEachSixtyAndQuantityEachOneShouldBeOneTwenty() {
        var item1 = new Item("Milk", 60 , 1);
        var item2 = new Item("Clothes", 60 , 1);

        var cart = new ShoppingCart();
        cart.AddItemToCart(item1);
        cart.AddItemToCart(item2);
        var total = cart.TotalPrice();

        assertEquals(120, total);
    }
    @Test
    void totalPriceForTwoItemsTenAndSixtyAndTwoAndOneQuantityShouldBeEighty() {
        var item1 = new Item("Milk", 10 , 2);
        var item2 = new Item("Clothes", 60 , 1);

        var cart = new ShoppingCart();
        cart.AddItemToCart(item1);
        cart.AddItemToCart(item2);
        var total = cart.TotalPrice();

        assertEquals(80, total);
    }

    @Test
    void totalPriceForNoItemsShouldBeZero() {
        var cart = new ShoppingCart();
        var total = cart.TotalPrice();

        assertEquals(0, total);
    }

    @Test
    void numberOfItemsForZeroItemsShouldBeZero() {
        var cart = new ShoppingCart();
        var numberOfItems = cart.NumberOfItems();

        assertEquals(0, numberOfItems);
    }
    @Test
    void numberOfItemsForTwoItemsShouldBeTwo() {
        var item1 = new Item("Milk", 10 , 1);
        var item2 = new Item("Clothes", 60 , 1);

        var cart = new ShoppingCart();
        cart.AddItemToCart(item1);
        cart.AddItemToCart(item2);
        var numberOfItems = cart.NumberOfItems();

        assertEquals(2, numberOfItems);
    }

    @Test
    void numberOfItemsForTwoItemsEachQuantityTwoShouldBeFour() {
        var item1 = new Item("Milk", 10 , 2);
        var item2 = new Item("Clothes", 60 , 2);

        var cart = new ShoppingCart();
        cart.AddItemToCart(item1);
        cart.AddItemToCart(item2);
        var numberOfItems = cart.NumberOfItems();

        assertEquals(4, numberOfItems);
    }
    @Test
    void numberOfItemsForTwoItemsQuantityTwoAndFourShouldBeSix() {
        var item1 = new Item("Milk", 10 , 2);
        var item2 = new Item("Clothes", 60 , 4);

        var cart = new ShoppingCart();
        cart.AddItemToCart(item1);
        cart.AddItemToCart(item2);
        var numberOfItems = cart.NumberOfItems();

        assertEquals(6, numberOfItems);
    }
}