package cucumber.rest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import springcucumbertemplate.Application;

public class StepDefs extends CucumberRestIntegrationTest {

    @Value("${server.url}")
    private String serverUrl;

    @Value("${server.port}")
    private String serverPort;

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    RestTemplate restTemplate = new RestTemplate();
    String result;

    @When("^il client chiama /version$")
    public void the_client_issues_GET_version() throws Throwable {
        log.info(("do a get"));
        final String baseUrl = "http://localhost:8081/version";
        result = restTemplate.getForObject(baseUrl, String.class);
    }

    @Then("^il client riceve la versione (.+)$")
    public void the_client_receives_server_version_body(String version) throws Throwable {
        Assert.assertEquals(result, version);

    }
}
