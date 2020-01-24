package com.example.demo.controller;

import org.hamcrest.core.Is;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(HomeController.class)
public class HomeControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void whenAccessGetUser_thenReturnUserObj() throws Exception {

        mvc.perform(get("/user").contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("name", Is.is("John")));

    }

    @Test
    public void whenAccessIndex_thenReturnStringHelloWorld() throws Exception {

        mvc.perform(get("/").contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(content().string("Hello World"));

    }

    @Test
    public void whenAccessPostUser_thenReturnStringHelloWorld() throws Exception {

        mvc.perform(post("/user")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"name\":\"Teste\",\"id\":\"26\"}"))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("name", Is.is("Teste")));

    }

    @Test
    public void whenAccessPostUserWithoutUserObj_thenReturnBadRequest() throws Exception {

        mvc.perform(post("/user").contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isBadRequest());

    }

}
