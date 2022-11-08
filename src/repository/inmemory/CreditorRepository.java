package repository;
import domain.*;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.List;

public class CreditorRepository implements CRUDRepository<Integer,Customer>{
    private List<Customer> listOfCostumers;


    @Override
    public void add(Customer entity) {
        CreditCustomer creditCustomer = new CreditCustomer("John","Klaus","Type 0",1);
        listOfCostumers.add(creditCustomer);
    }

    @Override
    public void remove(Integer integer) {

    }

    @Override
    public void update(Integer integer, Customer newEntity) {

    }

    @Override
    public Customer findByID(Integer integer) {
        return null;
    }
}
