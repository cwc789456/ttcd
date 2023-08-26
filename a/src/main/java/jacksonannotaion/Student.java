package jacksonannotaion;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * <pre>
 * kr.co.swh.lecture.opensource.jackson.annotaion
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
public class Student {
	//	Serialize 에는 멤버변수 'n'이 JSON의 'name'키로 설정
	//	Deserialize 에는 'name'키에 대한 값이 멤버변수 'n'으로 설정
	@JsonProperty("name")
	private String n;
	
	@JsonIgnore		//	Serialize 시에 무시, Deserialize 시에 초기값
	private int age;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)	//	Null이면 무시
	@JsonProperty("addresses")	//	멤버변수와 같으면 생략가능
	private List<String> addresses;
}
