package jacksonannotaion;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * <pre>
 * kr.co.swh.lecture.opensource.jackson.annotaion
 * StudentList.java
 *
 * 설명 :StudentList 예제
 * </pre>
 * 
 * @since : 2018. 1. 29.
 * @author : tobby48
 * @version : v1.0
 */
@Data
@JsonIgnoreProperties({ "academyName", "location" })	//	Serialize 시에 제외, Deserialize 시에 초기값
public class StudentList {
	@JsonProperty("students")
	private List<Student> student;
	private String academyName;
	private String location;
}