package restFullServices;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import java.io.IOException;

public class RestClient {

    public void getMethod(String url) throws IOException {

        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet= new HttpGet(url);
        CloseableHttpResponse closableHttpResponse = httpClient.execute(httpGet);

        int statusCode = closableHttpResponse.getStatusLine().getStatusCode();
        System.out.println("status code returned is -->> " + statusCode);


        String resposneString = EntityUtils.toString(closableHttpResponse.getEntity(), "UTF-8");
        JSONObject jsonResponse = new JSONObject(resposneString);
        System.out.println(jsonResponse);

    }


}
