package ApiTestingUsing_JavaLibrary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class delete_req_HttpURLConnectionExample {
	
	public void deleteMethodExample() throws IOException {
		
		URL url = new URL("https://reqres.in/api/users/2");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		
		connection.setRequestMethod("DELETE");
		
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);
		
		System.out.println("Status code : "+connection.getResponseCode());
		System.out.println("Response Message : "+connection.getResponseMessage());
		
		InputStream inputStream = connection.getInputStream();
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferReader = new BufferedReader(inputStreamReader);
		
		String line;
		StringBuffer buffer = new StringBuffer();
		
		while((line = bufferReader.readLine())!=null){
			buffer = buffer.append(line);
		}
		
		System.out.println(buffer);
	}
	
	public static void main(String[] args) throws IOException {
		delete_req_HttpURLConnectionExample deleteReqExample = new delete_req_HttpURLConnectionExample();
		deleteReqExample.deleteMethodExample();
	}

}
