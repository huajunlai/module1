package com.tradevan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * Module1
 *
 */
@SpringBootApplication
public class Module1App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(Module1App.class, args).close();
        System.out.println("Module1");
    }
}
