package com.example.learnk8s.api;

import com.example.learnk8s.repository.BookmarkRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.testcontainers.shaded.org.hamcrest.CoreMatchers;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class BookmarkControllerTest {
    @Autowired
    private MockMvc mvc;
//    @Autowired
//    private BookmarkRepository bookmarkRepository;
//
//    @BeforeEach
//    void setUp() {
//        bookmarkRepository.deleteAllInBatch();
//    }

    @Test
    void shouldGetBookmark() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/bookmark"))
                .andExpect(status().isOk()
                 //.andExpect(jsonPath("$.totalElement"), CoreMatchers.equalTo(0)
                );


    }
}
