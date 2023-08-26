package kr.co.swh.lecture.opensource.hibernate.annotation;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="asd")
public class Boom {	
	@Id
	@Column(name = "city")
	private String city;
	
	@Column(name = "tmEf")
	private String tmEf;
	
	@Column(name = "wf")
	private String wf;
	
	@Column(name = "tmn")
	private String tmn;
	
	@Column(name = "tmx")
	private String tmx;
	
	public Boom(){}
	

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getTmEf() {
		return tmEf;
	}

	public void setTmEf(String tmEf) {
		this.tmEf = tmEf;
	}

	public String getWf() {
		return wf;
	}

	public void setWf(String wf) {
		this.wf = wf;
	}

	public String getTmn() {
		return tmn;
	}

	public void setTmn(String tmn) {
		this.tmn = tmn;
	}

	public String getTmx() {
		return tmx;
	}

	public void setTmx(String tmx) {
		this.tmx = tmx;
	}	 
	 
}
