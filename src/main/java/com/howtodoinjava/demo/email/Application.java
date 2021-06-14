package com.howtodoinjava.demo.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner 
{
	@Autowired
    private EmailService emailService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
    @Override
    public void run(String... args) 
    {
    	emailService.sendMail("meeturfrndashok8@gmail.com", "Hi", "Hi hi hi");
    	
    	emailService.sendPreConfiguredMail("Hi hi hi");
    }
}
