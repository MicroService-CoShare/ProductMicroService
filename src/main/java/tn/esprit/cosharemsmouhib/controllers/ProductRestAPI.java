package tn.esprit.cosharemsmouhib.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.cosharemsmouhib.entities.Product;
import tn.esprit.cosharemsmouhib.services.ProductService;

import javax.annotation.security.RolesAllowed;

@RestController
public class ProductRestAPI {
    private String title="hello , im the updated product microservice";
    private String admin="hello , im admin";

    @RequestMapping("/hello")
    @RolesAllowed("user")
    public String sayHello(){
        System.out.println(title);
        return title;
    }
    @RequestMapping("/admin")
    @RolesAllowed("admin")
    public String sayAdmin(){
        System.out.println(admin);
        return admin;
    }
    @Autowired
    private ProductService productService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Product> createCandidat(@RequestBody Product produit) {
        return new ResponseEntity<>(productService.addProduct(produit), HttpStatus.OK);
    }

}
