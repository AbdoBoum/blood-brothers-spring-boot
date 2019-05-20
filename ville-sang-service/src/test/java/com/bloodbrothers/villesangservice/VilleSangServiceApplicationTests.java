package com.bloodbrothers.villesangservice;

import com.bloodbrothers.villesangservice.Repositories.VilleRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import javax.ws.rs.core.MediaType;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest
public class VilleSangServiceApplicationTests {

    //@Autowired
    //MockMvc mockMvc;

    //@Test
    /*public void contextLoads() throws Exception{
        mockMvc.perform( MockMvcRequestBuilders
                .get("/villes")
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.villes").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$.villes[*].idVille").isNotEmpty());
    }*/

}
