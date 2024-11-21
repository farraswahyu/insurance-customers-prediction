package comp.finalproject.admin.repository;

import comp.finalproject.admin.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> findAll();

    Customer findById(long id);

    /*void deleteById(long id);


    void update(Item item);

    int deleteById(int id);

    void save(Item item);

    */

}
