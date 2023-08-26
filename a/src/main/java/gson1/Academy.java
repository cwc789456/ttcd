package gson1;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

/**
 * <pre>
 * kr.co.swh.lecture.opensource.gson
 * Academy.java
 *
 * 설명 :GSON 예제
 * </pre>
 * 
 * @since : 2018. 1. 29.
 * @author : tobby48
 * @version : v1.0
 */
@Data
public class Academy {
	private String name;
	private List<Student> students;
	
	public static Academy getDummy() {
		Academy academy = new Academy();
		academy.setName("SWH Academy");

		List<Student> studentList = new ArrayList<Student>();
		Student s = new Student();
		s.setName("이름1");
		s.setAge(17);
		s.setSchool("학교1");
		studentList.add(s);

		s = new Student();
		s.setName("이름2");
		s.setSchool("학교2");
		studentList.add(s);

		s = new Student();
		s.setName("이름3");
		s.setAge(19);
		studentList.add(s);

		s = new Student();
		studentList.add(s);

		academy.setStudents(studentList);
		return academy;
	}
}
