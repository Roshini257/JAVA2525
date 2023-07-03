import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "src.main.java")

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Person.class);

        Person person = context.getBean(Person.class);
        Address address = context.getBean(Address.class);
        Account account = context.getBean(Account.class);

        // Set properties
////        person.setName("John Doe");
//        address.setCity("New York");
//        address.setStreet("USA");
//        account.setAccountNumber("1234567890");
//
//        // Access person, address, and account objects here
//        System.out.println("Person: " + person);
//        System.out.println("Address: " + address);
//        System.out.println("Account: " + account);
//    }
//}
    }
}
