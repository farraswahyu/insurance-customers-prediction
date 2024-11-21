package comp.finalproject.user.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="response")
public class Response implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    // Unidirectional
    //@OneToOne(cascade = CascadeType.ALL)
    //JoinColumn(name = "idcustomer", unique = false, referencedColumnName = "id")
    //@JoinColumn(name = "idcustomer", insertable = false, updatable = false)

    //private Customer customer;

    //public Customer getCustomer() {
      //  return customer;
   // }

    //public void setCustomer(Customer customer) {
    //    this.customer = customer;
   // }


    private long idcustomer;
    private int response;

    public Response() {
    }

    public Response( int response) {
        this.response = response;
    }

    public Response(long id, int response) {
        this.id = id;
        this.response = response;
    }

    // getters and setters go here...

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getResponse() {
        return response;
    }

    public void setResponse(int response) {
        this.response = response;
    }

}
