package spark;

import static spark.Spark.*;

public class HelloWorld {
	public static void main(String[] arg) {
		get("/users/:name", (request, response) -> "Selected user: " + request.params(":name"));
	}
}