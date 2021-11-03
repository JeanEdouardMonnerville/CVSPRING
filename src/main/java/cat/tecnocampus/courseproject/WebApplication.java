package cat.tecnocampus.courseproject;

import cat.tecnocampus.courseproject.application.Controller;
import cat.tecnocampus.courseproject.domain.Customer;
import cat.tecnocampus.courseproject.domain.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

import cat.tecnocampus.courseproject.domain.Subscription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebApplication implements CommandLineRunner {
    private Controller controller;

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }

    @Autowired
    public void setController(Controller controller) {
        this.controller = controller;
    }
    
    @Override
    public void run(String... strings) throws Exception {
        HashMap<String, Product> products = new HashMap<>();
        ArrayList<Subscription> subscriptions = new ArrayList<>();
        
        
        Product product = new Product("peer", "fruit", 2, "kilo", "Juan", "0,42", "https://images.hermie.com/images/articles/large/plantenfiche-pyrus-communis-conference-conference-peer-15515.jpg");
        Product product1 = new Product("tomato", "legume", 1, "kilo", "Juan", "0,21", "https://www.sementesfeltrin.com.br/_uploads/produtofoto/produtofoto_561_3673_orig.jpg");
        product.setId_product("101");
        product1.setId_product("102");

        Subscription subscription = new Subscription(5, LocalDate.now(), product, controller.customerDTOToCustomer(controller.getCustomer("1")));
        
        products.put(product.getId_product(), product);
        products.put(product1.getId_product(), product1);
        

        subscriptions.add(subscription);

        controller.setProducts(products);
        controller.setSubscriptions(subscriptions);
    }

}
