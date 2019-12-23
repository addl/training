package addl.lion.training.controllers;

import static org.assertj.core.api.Assertions.assertThat;

//import org.junit.Test;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.web.client.RestTemplate;

import addl.lion.training.domain.User;

@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
@ActiveProfiles("dev")
public class UserControllerTests {
	
	@Value("${local.server.port}")
    private int port;
	
	@Test
	public void shouldCreateAUser() {
		
		RestTemplate rt = new RestTemplate();
		User u = new User();
		u.setFirstName("Bry");
		u.setLastName("Chucha");
		u.setUsername("chichi");
		HttpHeaders httHeaders = new HttpHeaders();
		httHeaders.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<User> httpEntity = new HttpEntity<User>(u, httHeaders);
		
		//when
		ResponseEntity<User> response = rt.postForEntity(String.format("http://localhost:%d/users/all", port), httpEntity, User.class);
		
		//then
		assertThat(response.getStatusCode().value()).isEqualTo(200);
		assertThat(response.getBody()).isNotNull();
		
		System.out.println(response.getBody());
	}

}
