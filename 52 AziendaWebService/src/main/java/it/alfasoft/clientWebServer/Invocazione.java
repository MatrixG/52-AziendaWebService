package it.alfasoft.clientWebServer;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

public class Invocazione {

	protected Client cliente = ClientBuilder.newClient();
	protected WebTarget addressTarget;
	protected WebTarget appTarget;

	protected Invocazione() {

		addressTarget = cliente.target("http://localhost:8086");
		appTarget = addressTarget.path("/IbmWebService/webapi");
	}
}
