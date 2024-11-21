package comp.finalproject.user.repository;

import comp.finalproject.user.entity.Response;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ResponseRepository extends JpaRepository<Response, Long> {

    List<Response> findAll();

    Response findById(long id);

    /*int deleteById(int id);

    void save(Response sale);

    void update(Response sale);*/

}
