package us.dot.its.jpo.sec.helpers;

import javax.net.ssl.SSLContext;

import org.apache.hc.client5.http.classic.HttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClientBuilder;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.springframework.stereotype.Component;

@Component
public class HttpClientFactory {
        
        public HttpClient getHttpClient(SSLContext sslContext) {
            HttpClientBuilder httpClientBuilder = HttpClients.custom();
            if (sslContext == null) {
                return null;
            }
            httpClientBuilder.setSSLContext(sslContext);
            return httpClientBuilder.build();
        }
}
