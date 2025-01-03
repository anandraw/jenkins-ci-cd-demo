package com.anand;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest
class CiCddemoApplicationTests {
	

	@Autowired
	private MockMvc mockMvc;

	@Test
	void contextLoads() {
	}
	
	@Test
	public void testGreetinfenpoint() throws Exception{
		String name = "Anand Rawool";
		
		mockMvc.perform(MockMvcRequestBuilders.get("/greeting/{name}", name))
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andExpect(MockMvcResultMatchers.content().string("Hello" + name + "Congratulation you are completed cicd"));
		
	}

}
