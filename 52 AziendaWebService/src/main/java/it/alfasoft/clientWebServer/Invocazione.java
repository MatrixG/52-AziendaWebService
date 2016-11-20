package it.alfasoft.clientWebServer;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

public class Invocazione {

	protected Client cliente = ClientBuilder.newClient();

	protected WebTarget baseTarget;
	protected WebTarget addressTarget;
	protected WebTarget appTarget;
	
	
	protected Invocazione() {
		
		baseTarget = cliente.target("http://fatture");
		addressTarget = baseTarget.path("/localhost:8086");
		appTarget = addressTarget.path("/IbmWebService/webapi");
	}
}
