package com.limpid.springboot;

import com.limpid.springboot.config.CustomerApplicationEventPublisher;
import com.limpid.springboot.event.UserRegisterEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private CustomerApplicationEventPublisher customerApplicationEventPublisher;

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Application.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.run(args);
    }

    /**
     * @see org.springframework.boot.CommandLineRunner#run(java.lang.String...)
     */
    @Override
    public void run(String... args) throws Exception {
        customerApplicationEventPublisher.publishEvent(new UserRegisterEvent("userRegister", "7023112023", "limpid"));
    }

}
