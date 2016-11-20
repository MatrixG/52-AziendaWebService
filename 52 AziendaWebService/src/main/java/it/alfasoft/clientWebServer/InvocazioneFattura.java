package it.alfasoft.clientWebServer;

import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;

import it.alfasoft.alex.bean.Fattura;

public class InvocazioneFattura extends Invocazione {

	private WebTarget prova = cliente.target("http://localhost:8086/IbmWebService/webapi/risorsa");
	private WebTarget resourceFatturaTarget;
	
	public InvocazioneFattura() {
		super();
		resourceFatturaTarget = appTarget.path("/risorsa");
	}
	
	public Invocation inviaFattura(Fattura f) {
		
		return prova.request().buildPost(Entity.json(f));
	}
}
