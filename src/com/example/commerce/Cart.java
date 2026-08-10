import com.example.commerce.CartItem;
import com.example.commerce.Product;

import java.util.List;

public class Cart {
    private List<CartItem> cartItems;
public void addProduct(Product product,Integer quantity) {
    for(CartItem cartItem: cartItems) {
        if (item.getProduct().getName().equals(product.getName())) {
            item.setQuantity(item.getQuantity() + quantity);
            return;
        }
    }
    cartItems.add(new CartItem(product, quantity));
}
public List<CartItem> getCartItems() {return cartItems;}
    public boolean isEmpty() {return cartItems.isEmpty();}
}