package jacksonarchitecture;

public class JacksonMain {
	
	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		IService service = new Jackson("json.json");
		
		service = new Jackson("xml.xml");
		service.deserialize();
		service.serialize();
	}

}
