package org.example;

import java.util.List;

/**
 * Hello world!
 *
 */

record Customer(int id, String firstName, String lastName, String phoneNumber, String email, String city, String zipCode,
                List<Order> orders){}
record Order(int product_id,String productName,int quantity,double price,String factoryName,String expire,String type){}
public class App 
{
    public static void main( String[] args )
    {
      Order order1 = new Order(1,"laptop",43,243.4,"dell factory","2045/May/03","on table");
      Order order2 = new Order(2,"mouse",423,2.4,"iran factory","2035/May/09","hand");
      Order order3 = new Order(3,"wirless cable ",1258,1.5,"iran factory","2045/May/09","wiring");

      List<Order> orders = List.of(order1,order2,order3);
      Customer customer = new Customer(1,"milad","rostami","09175029826","miladrostami24@gamil.com","tehran/shiraz","715456753",orders);

        System.out.println("Description of Customer are :");
        System.out.println("customer id is :" + customer.id() );
        System.out.println("customer firstName is :" +customer.firstName() );
        System.out.println("customer lastName is :" + customer.lastName());
        System.out.println("customer phoneNumber is :" + customer.phoneNumber());
        System.out.println("customer email is :" + customer.email());
        System.out.println("customer city is :" + customer.city() );
        System.out.println("customer zip code is :" + customer.zipCode());
        System.out.println("Customers Orders are :");
        for (Order order: customer.orders()) {
            System.out.println("\t Id  :" + order.product_id());
            System.out.println("\t product name   :" +order.productName() );
            System.out.println("\t quantity  :" + order.quantity() );
            System.out.println("\t price  :" + order.price() );
            System.out.println("\t factory name  :" + order.factoryName());
            System.out.println("\t expire  :" + order.expire());
            System.out.println("\t type  :" + order.type());
        }




    }
}
