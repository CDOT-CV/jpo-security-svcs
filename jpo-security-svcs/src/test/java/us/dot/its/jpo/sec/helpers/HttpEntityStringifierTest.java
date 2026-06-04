package us.dot.its.jpo.sec.helpers;

import java.io.IOException;

import org.apache.hc.core5.http.ParseException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import org.mockito.InjectMocks;

@ExtendWith(MockitoExtension.class)
public class HttpEntityStringifierTest {
    
    @InjectMocks
    HttpEntityStringifier httpEntityStringifier = new HttpEntityStringifier();

    @Test
    public void testStringifyHttpEntity() throws ParseException, IOException {
        // prepare
        org.apache.hc.core5.http.HttpEntity apache_entity = new org.apache.hc.core5.http.io.entity.StringEntity("test");
        
        // execute
        String stringified = httpEntityStringifier.stringifyHttpEntity(apache_entity);

        // verify
        assert(stringified.equals("test"));
    }
}
