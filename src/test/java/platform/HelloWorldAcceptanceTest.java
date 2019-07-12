package platform;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class HelloWorldAcceptanceTest {

    @Test
    void shouldSayHelloWorld() throws Exception {
        final String environment = System.getProperty("environment");
        final String url = String.format("https://api-%s.microservicesolution.com/hello-world/message", environment);
        final HttpResponse<String> response = Unirest.get(url).asString();
        assertEquals(200, response.getStatus());
        assertEquals("{\"text\":\"Hello, World!!!\"}", response.getBody());
    }

}