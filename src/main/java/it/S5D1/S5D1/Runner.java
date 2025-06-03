package it.S5D1.S5D1;


import it.S5D1.S5D1.beans.Drink;
import it.S5D1.S5D1.beans.Pizza;
import it.S5D1.S5D1.beans.Topping;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component

@Order(1)
public class Runner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {

        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(S5D1Application.class);

        Drink water = ctx.getBean(Drink.class);

        System.out.println(water);

        Topping t1 = ctx.getBean("mozzarella", Topping.class);

        System.out.println(t1);

        Topping t2 = ctx.getBean("tomato",Topping.class);

        System.out.println(t2);

        Pizza p = ctx.getBean(Pizza.class);

        System.out.println(p);
    }
}
