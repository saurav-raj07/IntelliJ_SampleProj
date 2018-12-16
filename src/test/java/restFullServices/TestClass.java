package restFullServices;

import java.io.IOException;

public class TestClass {

   public void executeTest() throws IOException {

       PropertyUtil pu= new PropertyUtil();
       final String BASEURI=pu.readProperty("baseUrl");
       final String ENDPOINT= pu.readProperty("endpoint");

       RestClient restClient = new RestClient();
       restClient.getMethod(BASEURI+ENDPOINT);


   }
}

