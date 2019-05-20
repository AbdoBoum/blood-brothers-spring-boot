package com.bloodbrothers.acceuilservice;

import org.json.JSONException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MovieCatalogServiceApplicationTests {

	@LocalServerPort
	private int port;

	TestRestTemplate restTemplate = new TestRestTemplate();

	HttpHeaders headers = new HttpHeaders();

	@Test
	public void testRetrieveStudentCourse() throws JSONException {

		HttpEntity<String> entity = new HttpEntity<String>(null, headers);

		ResponseEntity<String> response = restTemplate.exchange(
				createURLWithPort("/groupSangs/2/demandes"),
				HttpMethod.GET, entity, String.class);

		String expected = "{idDemande:2,titleDemande:Another Blood Request,descriptionDemande:Blood Needed ASAP,dateDemande:2019-05-20T07:36:50.129+0000,pathImgDemande:C://user/Abderrahim/desktop/img.png,idCentre:2,idGroupSang:2,active:true,urgent:true}";
		System.out.println(response.getBody());
		JSONAssert.assertEquals(expected, response.getBody(), false);
	}

	private String createURLWithPort(String uri) {
		return "http://localhost:" + port + uri;
	}


	@Test
	public void contextLoads() {
	}

}
