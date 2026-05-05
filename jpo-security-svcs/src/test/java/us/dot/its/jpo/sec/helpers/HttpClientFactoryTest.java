package us.dot.its.jpo.sec.helpers;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.apache.hc.client5.http.classic.HttpClient;
import org.mockito.InjectMocks;

@ExtendWith(MockitoExtension.class)
public class HttpClientFactoryTest {

    @InjectMocks
    HttpClientFactory httpClientFactory = new HttpClientFactory();
    
    @Test
    public void testGetHttpClient_nullSslContext() {
        // execute
        HttpClient httpClient = httpClientFactory.getHttpClient(null);

        // verify
        assert(httpClient == null);
    }
}
