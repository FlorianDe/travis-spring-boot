package de.ezcoding.travisspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class TravisSpringBootApplication {

    @GetMapping("/{test}")
    public String test(@PathVariable String test){
        return test + " was called";
    }

    public static void main(String[] args) {
        SpringApplication.run(TravisSpringBootApplication.class, args);
    }
}
