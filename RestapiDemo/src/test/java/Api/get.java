package Api;

import java.io.IOException;
import java.net.http.HttpClient;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;

public class get {

	
	public void getTest1(String getrequset) throws ClientProtocolException, IOException {

		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpGet httpget = new HttpGet(getrequset);
		
		CloseableHttpResponse closehttpresponse = httpclient.execute(httpget);
		
		
		
		
		int statuscode=closehttpresponse.getStatusLine().getStatusCode();
		System.out.println(statuscode);
		
		Assert.assertEquals(statuscode, 200 ,"Verification Passeed");
		
		System.out.println(closehttpresponse.getEntity());
		String ResponseString=EntityUtils.toString(closehttpresponse.getEntity(),"UTF-8");
		
		
		
		Header[] headersArray =  closehttpresponse.getAllHeaders();
		HashMap<String, String> allHeaders = new HashMap<String, String>();	
		for(Header header : headersArray){
			allHeaders.put(header.getName(), header.getValue());
			System.out.println("Headers Key-->"+allHeaders.keySet());
			System.out.println("Headers value-->"+allHeaders.values());
			
			
		}	
		System.out.println("Headers Array-->"+allHeaders);
		
		
		
		
		
		System.out.println(allHeaders);
		
		String Name =allHeaders.get("name");
		
		
		Assert.assertEquals(Name, "Leanne Graham" ,"Verification Passeed");
		
		boolean Name1=Name.equalsIgnoreCase("Leanne Graham11");
		
		Assert.assertTrue(Name1);
		
		
		
		
	}
}


