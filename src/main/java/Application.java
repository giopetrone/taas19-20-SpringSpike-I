import model.Customer;
import service.CustomerService;
import service.CustomerServiceImpl;

public class Application {
    public static void main(String[] args) {
        CustomerService service = new CustomerServiceImpl();
        Customer customer = service.findAll().get(0);
        System.out.println(customer.getFirstname());
        System.out.println(customer.getLastname());
    }
}
