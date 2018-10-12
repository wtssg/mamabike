package com.coder520.mamabike;

import com.coder520.mamabike.user.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MamabikeApplication.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MamabikeApplicationTests {

	@Autowired
	private TestRestTemplate restTemplate;
	@LocalServerPort
	private int port;
	@Test
	public void contextLoads() {
		String result = restTemplate.getForObject("/user/test", String.class);
		System.out.println(result);
	}

}
