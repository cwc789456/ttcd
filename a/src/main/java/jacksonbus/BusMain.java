package jacksonbus;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

/**
 * <pre>
 * kr.co.swh.lecture.opensource.jackson
 * JacksonJsonMain.java
 *
 * 설명 :Jackson Json 예제
 * </pre>
 * 
 * @since : 2018. 1. 29.
 * @author : tobby48
 * @version : v1.0
 */
public class BusMain {
	private static ObjectMapper mapper = new XmlMapper();
	public static void main(String[] args) throws Exception  {
		HttpClient client = HttpClients.createDefault();
		HttpGet request = new HttpGet("http://openapi.gbis.go.kr/ws/rest/busrouteservice?serviceKey=1234567890&keyword=11");
		try {
			//	필요에 따라서는 헤더 추가
			//		request.addHeader("Content-type", "application/json");

			//	요청
			HttpResponse response = client.execute(request);

			//	응답
			Bus value = mapper.readValue(response.getEntity().getContent(), Bus.class);
			System.out.println(value);
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
	}
}