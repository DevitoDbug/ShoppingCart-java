public class Main {
public static void main(String[] args){
    Item item1 = new Item("clothes", 789.5 , 1);
    Item item2 = new Item("shoes", 60 , 1);
    Item item3 = new Item("trousers", 300 , 1);

    ShoppingCart cart = new ShoppingCart();
    cart.AddItemToCart(item1);
    cart.AddItemToCart(item2);
    cart.AddItemToCart(item3);

    System.out.println(cart.GetAllItems());
    cart.ForgetItem(1);

    System.out.println(cart.GetAllItems());
}
}