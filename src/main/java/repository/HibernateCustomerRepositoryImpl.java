package repository;

import model.Customer;
import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.List;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {


    @Override
    public List<Customer> findAll() {

        List<Customer> customers = new ArrayList();
        Customer customer = new Customer();
        customer.setFirstname("gio");
        customer.setLastname("Petrone");
        customers.add(customer);
        return customers;
    }
}
