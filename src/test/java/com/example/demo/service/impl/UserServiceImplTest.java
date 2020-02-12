package com.example.demo.service.impl;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
public class UserServiceImplTest {

    @TestConfiguration
    static class HomeServiceImplTestContextConfiguration {
        @Bean
        @Primary
        public UserService userServiceTest() {
            return new UserServiceImpl();
        }
    }

    @MockBean
    private UserRepository userRepository;

    @Autowired
    private UserService userServiceTest;

    @Test
    public void whenAskIsOlderInBrazilFor15Age_thenReturnFalse() {
        assertThat(userServiceTest.isOlderInBrazil(15)).isFalse();
    }

    @Test
    public void whenAskIsOlderInBrazilFor18Age_thenReturnTrue() {
        assertThat(userServiceTest.isOlderInBrazil(18)).isTrue();
    }

    @Test
    public void whenAskIsOlderInBrazilFor31Age_thenReturnTrue() {
        assertThat(userServiceTest.isOlderInBrazil(31)).isTrue();
    }

}
