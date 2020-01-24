package com.example.demo.repository;

import com.example.demo.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UserRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private UserRepository userRepository;

    @Test
    public void whenFindByName_thenReturnEmployee() {

        User user = new User(1l, "Fulano");
        //entityManager.persist(user);
        //entityManager.flush();

        userRepository.save(user);

        // when
        User found = userRepository.getOne(1l);

        // then
        assertThat(found.getName()).isEqualTo(user.getName());

    }

}
