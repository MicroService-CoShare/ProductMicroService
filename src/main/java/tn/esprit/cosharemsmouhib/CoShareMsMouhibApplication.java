package tn.esprit.cosharemsmouhib;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import tn.esprit.cosharemsmouhib.entities.Product;
import tn.esprit.cosharemsmouhib.repositories.ProductRepository;

@SpringBootApplication
@EnableEurekaClient
public class CoShareMsMouhibApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoShareMsMouhibApplication.class, args);
    }
@Autowired
private ProductRepository repository;
@Bean
    ApplicationRunner init(){
        return (args) -> {
            repository.save(new Product("tv"));
            repository.save(new Product("tv"));
            repository.save(new Product("tv"));
            repository.findAll().forEach(System.out::println);
        };
}

}
