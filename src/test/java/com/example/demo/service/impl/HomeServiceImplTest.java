package com.example.demo.service.impl;

import com.example.demo.service.HomeService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
public class HomeServiceImplTest {

    @TestConfiguration
    static class HomeServiceImplTestContextConfiguration {
        @Bean
        public HomeService homeService() {
            return new HomeServiceImpl();
        }
    }

    @Autowired
    private HomeService homeService;

    @Test
    public void whenAskIsOlderInBrazilFor15Age_thenReturnFalse() {
        assertThat(homeService.isOlderInBrazil(15)).isFalse();
    }

    @Test
    public void whenAskIsOlderInBrazilFor18Age_thenReturnTrue() {
        assertThat(homeService.isOlderInBrazil(18)).isTrue();
    }

    @Test
    public void whenAskIsOlderInBrazilFor31Age_thenReturnTrue() {
        assertThat(homeService.isOlderInBrazil(31)).isTrue();
    }

}
