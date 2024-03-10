package org.design_patterns;

import org.design_patterns.adapter.EUAdapter;
import org.design_patterns.adapter.USCharger;
import org.design_patterns.builder.Car;
import org.design_patterns.builder.CarBuilder;
import org.design_patterns.factory.Shape;
import org.design_patterns.factory.ShapeFactory;
import org.design_patterns.observer.Product;
import org.design_patterns.observer.User;
import org.design_patterns.proxy.DataServiceProxy;
import org.design_patterns.singleton.Admin;
import org.design_patterns.strategy.Card;
import org.design_patterns.strategy.Cash;
import org.design_patterns.strategy.PayPal;
import org.design_patterns.strategy.PaymentStrategy;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class DesignPatterns {
    public static void main(String[] args) {

        //##########################################################
        //PROXY

        System.out.println("\n---------------------------------\nPROXY\n");

        DataServiceProxy proxy_admin = new DataServiceProxy(true);
        System.out.println(proxy_admin.getData());

        DataServiceProxy proxy_user = new DataServiceProxy(false);
        System.out.println(proxy_user.getData());


        //##########################################################
        //ADAPTER
        System.out.println("\n---------------------------------\nADAPTER\n");

        USCharger usCharger = new USCharger();
        EUAdapter euAdapter = new EUAdapter(usCharger);

        euAdapter.chargeEU();


        //##########################################################
        // Singleton
        System.out.println("\n---------------------------------\nSINGLETON\n");

        Admin admin = Admin.getInstance();

        Admin admin2 = Admin.getInstance();

        if (admin == admin2) {
            System.out.println("They are the same admin");
        } else {
            System.out.println("They are not the same admin");
        }


        //##########################################################
        // Observer

        System.out.println("\n---------------------------------\nOBSERVER\n");

        Product product = new Product("Phone", 0);
        User user = new User("Janos",product);
        product.addObserber(user);
        product.setQuantity(5);


        //##########################################################
        // Strategy

        System.out.println("\n---------------------------------\nSTRATEGY\n");


        PaymentStrategy card = new Card();
        PaymentStrategy cash = new Cash();
        PaymentStrategy paypal = new PayPal();

        List<PaymentStrategy> paymentStrategies = List.of(card, cash, paypal);

        for (PaymentStrategy paymentType: paymentStrategies) {
            paymentType.pay();
        }


        //##########################################################
        // Factory

        System.out.println("\n---------------------------------\nFACTORY\n");

        ShapeFactory factory = new ShapeFactory();

        Shape circle = factory.getShape("circle");
        Shape square = factory.getShape("square");

        circle.draw();
        square.draw();


        //##########################################################
        // Builder

        System.out.println("\n---------------------------------\nBUILDER\n");

        CarBuilder carBuilder = new CarBuilder();

        Car dacia = carBuilder.setBrand("Dacia").setModel("Logan").setColor("blue").build();
        Car passat = carBuilder.setBrand("VW").setModel("Passat").setColor("black").build();

        System.out.println(dacia);
        System.out.println(passat);

    }
}
