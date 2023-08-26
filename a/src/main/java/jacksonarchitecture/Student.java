package jacksonarchitecture;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.Data;

/**
 * <pre>
 * kr.co.swh.lecture.opensource.jackson.architecture 
 * Student.java
 *
 * 설명 :Jackson 예제
 * </pre>
 * 
 * @since : 2018. 1. 29.
 * @author : tobby48
 * @version : v1.0
 */
@Data
@JacksonXmlRootElement(localName = "student")	//	루트 엘리먼트 이름
public class Student {
	//	Serialize 에는 멤버변수 'n'이 JSON과 XML의 'name'으로 설정
	//	Deserialize 에는 JSON과 XML의 'name'에 대한 값이 멤버변수 'n'으로 설정
	@JsonProperty("name")
	@JacksonXmlProperty(localName = "name")
	private String n;
	
	@JsonIgnore		//	Serialize 시에 무시, Deserialize 시에 초기값
	private int age;
	
	@JsonProperty("addresses")
	@JsonInclude(JsonInclude.Include.NON_NULL)	//	Null이면 무시
	private List<String> addresses;
}