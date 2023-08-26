package jacksonbus;

import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * <pre>
 * kr.co.swh.lecture.opensource.jackson 
 * Bus.java
 *
 * 설명 :
 * </pre>
 * 
 * @since : 2020. 10. 4.
 * @author : tobby48
 * @version : v1.0
 */
@JacksonXmlRootElement(localName = "response")	//	루트 엘리먼트 이름
public class Bus {
	private String comMsgHeader;
	private MessageHeader msgHeader;
	private MessageBody msgBody;
	
	public Bus() {
		// TODO Auto-generated constructor stub
	}
	public String getComMsgHeader() {
		return comMsgHeader;
	}

	public void setComMsgHeader(String comMsgHeader) {
		this.comMsgHeader = comMsgHeader;
	}

	public MessageHeader getMsgHeader() {
		return msgHeader;
	}

	public void setMsgHeader(MessageHeader msgHeader) {
		this.msgHeader = msgHeader;
	}

	public MessageBody getMsgBody() {
		return msgBody;
	}

	public void setMsgBody(MessageBody msgBody) {
		this.msgBody = msgBody;
	}

}
