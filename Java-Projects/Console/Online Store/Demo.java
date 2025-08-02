

import Section12.Cart.Discount;
import Section12.Cart.Tax;

import java.math.BigDecimal;

public class Demo {
    public static void main(String[] args) {
        Cart cart = new Cart();
        System.out.println(cart);

        System.out.println();
        Cart cart2 = new Cart(2, 2);
        System.out.println(cart2);

        System.out.println();
        cart.addProduct(new Product("L shaped Showerbath", BigDecimal.valueOf(300)));
        cart.addProduct(new Product("P shaped Right Hand Bath", BigDecimal.valueOf(200)));
        System.out.println(cart);


    }
}
