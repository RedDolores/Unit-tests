package hw1.shop;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ShopTest {

    /*
   1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины).
   2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
   3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
   */
    public static void main(String[] args) {
        Product product1 = new Product(30, "Milk");
        Product product2 = new Product(20, "Bread");
        Product product3 = new Product(40, "Donut");
        Product product4 = new Product(10, "Bubblegum");

        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);

        Shop shop = new Shop();
        shop.setProducts(productList);

//        for (Product product : shop.getProducts()) {
//            System.out.println(product);
//        }
//        System.out.println(shop.sortProductsByPrice());
//        System.out.println(shop.getMostExpensiveProduct());

        List<Product> productListTest = new ArrayList<>();
        productListTest.add(product4);
        productListTest.add(product2);
        productListTest.add(product1);
        productListTest.add(product3);

        // begin test getProducts
        assertThat(shop.getProducts()).isEqualTo(productList);
        // end test getProducts


        // begin test sortProductsByPrice
        assertThat(shop.sortProductsByPrice()).isEqualTo(productListTest);
        // end test sortProductsByPrice

        //begin test getMostExpensiveProduct
        assertThat(shop.getMostExpensiveProduct()).isEqualTo(product3);
        // end test getMostExpensiveProduct
    }

}