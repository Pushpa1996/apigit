package Api;

import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;




public class maintest extends configuration{
	
	String URL;
	
	get obj = new get();
	configuration cfg = new configuration();
@BeforeTest
public void beforetest() throws IOException {
	
	String ApiURL=cfg.base("apiURL");
	
System.out.println(ApiURL);

	String bASEURL=cfg.base("baseURL");
	
	 URL= ApiURL+bASEURL;
	
	
	
	
}

@Test

public void Test1() throws ClientProtocolException, IOException {
	obj.getTest1(URL);
}

}
