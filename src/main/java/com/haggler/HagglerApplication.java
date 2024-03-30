package com.haggler;

@SpringBootApplication
public class HagglerApplication {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(HagglerApplication.class);
        app.run(args);
    }

}
