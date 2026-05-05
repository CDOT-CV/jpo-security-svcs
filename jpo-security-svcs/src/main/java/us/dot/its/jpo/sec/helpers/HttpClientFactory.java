package us.dot.its.jpo.sec.helpers;

import javax.net.ssl.SSLContext;

import org.apache.hc.client5.http.classic.HttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClientBuilder;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.client5.http.impl.io.PoolingHttpClientConnectionManagerBuilder;
import org.apache.hc.client5.http.io.HttpClientConnectionManager;
import org.apache.hc.client5.http.ssl.DefaultClientTlsStrategy;
import org.apache.hc.client5.http.ssl.TlsSocketStrategy;
import org.springframework.stereotype.Component;

@Component
public class HttpClientFactory {
        
        public HttpClient getHttpClient(SSLContext sslContext) {
            HttpClientBuilder httpClientBuilder = HttpClients.custom();
            if (sslContext == null) {
                return null;
            }
            TlsSocketStrategy tlsStrategy = new DefaultClientTlsStrategy(sslContext);

            HttpClientConnectionManager connectionManager = PoolingHttpClientConnectionManagerBuilder.create()
                    .setTlsSocketStrategy(tlsStrategy)
                    .build();

            return httpClientBuilder.setConnectionManager(connectionManager).build();
        }
}
