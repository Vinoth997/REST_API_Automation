package ApiTestingUsing_JavaLibrary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class put_req_HttpURLConnectionExample {

	public void putRequestExample() throws IOException {

		URL url = new URL("https://reqres.in/api/users/2");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();

		connection.setRequestMethod("PUT");

		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);

		String jsonBody = "{\"name\": \"morpheus\",\"job\": \"president\"}";

		byte[] inputJson = jsonBody.getBytes();

		OutputStream outputStream = connection.getOutputStream();
		outputStream.write(inputJson);

		InputStream inputStream = connection.getInputStream();
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);

		BufferedReader bufferReader = new BufferedReader(inputStreamReader);

		String line;
		StringBuffer buffer = new StringBuffer();
		while((line = bufferReader.readLine())!=null) {
			buffer = buffer.append(line);
		}

		System.out.println(buffer);

	}

	public static void main(String[] args) throws IOException {
		put_req_HttpURLConnectionExample putReqExample = new put_req_HttpURLConnectionExample();
		putReqExample.putRequestExample();
	}

}
