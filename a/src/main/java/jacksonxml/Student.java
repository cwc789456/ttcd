package jacksonxml;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.Data;

/**
 * <pre>
 * kr.co.swh.lecture.opensource.jackson.xml
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
	//	Serialize 에는 멤버변수 'n'이 XML의 'name'엘리먼트로 설정
	//	Deserialize 에는 'name'엘리먼트에 대한 값이 멤버변수 'n'으로 설정
	@JacksonXmlProperty(localName = "name")
	private String n;
	private int age;
	private List<String> addresses;
}