package com.nichoudhary.learning.jpa.jpain10steps;

import com.nichoudhary.learning.jpa.jpain10steps.entity.User;
import com.nichoudhary.learning.jpa.jpain10steps.service.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);

    @Autowired
    UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User("Jill", "Admin");
        userRepository.save(user);
        log.info("New User is Created : " + user); //New User is Created : User{id=1, name='Jill', role='Admin'}

        Optional<User> withUserIdOne = userRepository.findById(1L);
        log.info("User is retrieved: " + withUserIdOne);

        List<User> users = userRepository.findAll();
        log.info("All users retrieved: " + users);

    }
}
