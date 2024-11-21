package comp.finalproject.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import java.lang.String;

@SpringBootApplication
@ComponentScan(basePackages = {"comp.finalproject.user"})
public class InsuranceDataUser {

    public static void main(String[] args) {
        SpringApplication.run(InsuranceDataUser.class, args);
    }

}
