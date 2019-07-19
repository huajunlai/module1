package com.tradevan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tradevan.common.CommonTool;

/**
 *
 * Module1
 *
 */
@SpringBootApplication
public class Module1App  implements CommandLineRunner
{
    @Autowired
    private CommonTool tool;
    
    
    public void init() {
        System.out.println(tool.getText());
    }
    
    public static void main( String[] args )
    {
        SpringApplication.run(Module1App.class, args).close();
        
    }
    
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Run Module1!");
        init();
    }
}
