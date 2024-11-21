package comp.finalproject.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"comp.finalproject.admin"})
public class InsuranceDataAdmin {

    public static void main(String[] args) {
        SpringApplication.run(InsuranceDataAdmin.class, args);
    }

}
