package us.dot.its.jpo.sec.helpers;

import java.io.IOException;

import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.http.ParseException;
import org.springframework.stereotype.Component;

@Component
public class HttpEntityStringifier {
    
    public String stringifyHttpEntity(org.apache.hc.core5.http.HttpEntity apache_entity) throws ParseException, IOException {
        return EntityUtils.toString(apache_entity);
    }
}
