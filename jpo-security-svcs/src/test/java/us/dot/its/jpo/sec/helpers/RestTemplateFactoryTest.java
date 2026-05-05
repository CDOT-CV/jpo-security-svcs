package us.dot.its.jpo.sec.helpers;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.web.client.RestTemplate;

import org.mockito.InjectMocks;

@ExtendWith(MockitoExtension.class)
public class RestTemplateFactoryTest {

    @InjectMocks
    RestTemplateFactory restTemplateFactory = new RestTemplateFactory();
    
    @Test
    public void testGetRestTemplate() {
        // execute
        RestTemplate restTemplate = restTemplateFactory.getRestTemplate();

        // verify
        assert(restTemplate != null);
    }
}
