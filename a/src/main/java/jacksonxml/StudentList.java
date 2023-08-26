package jacksonxml;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.Data;

/**
 * <pre>
 * kr.co.swh.lecture.opensource.jackson.xml
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
@JacksonXmlRootElement(localName = "students")	//	루트 엘리먼트 이름
public class StudentList {
	@JacksonXmlProperty		//	xml의 엘리먼트임을 명시, 엘리먼트 이름을 지정하지 않으면 멤버변수인 'student'로 지정
    @JacksonXmlElementWrapper(useWrapping = false)	//	컬렉션에 요소가 없을 때 에러방지, 빈 엘리먼트 생성
	private List<Student> student;
}