package comp.finalproject.user.repository;

import comp.finalproject.user.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> findAll();

    Customer findById(long id);

    /*void deleteById(long id);


    void update(Customer item);

    int deleteById(int id);

    void save(Customer item);

    */

}
