package it.alfasoft.clientWebServer;

import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;

import it.alfasoft.alex.bean.Fattura;

public class InvocazioneFattura extends Invocazione {

	private WebTarget resourceFatturaTarget;
	
	public InvocazioneFattura() {
		super();
		System.out.println("costruttore invocazione fattura");
		resourceFatturaTarget = appTarget.path("/risorsa");
		System.out.println(resourceFatturaTarget.getUri().toString());
		
	}
	
	public Invocation inviaFattura(Fattura f) {
		System.out.println("invia fattura");
		Invocation prova = resourceFatturaTarget.request().buildPost(Entity.json(f));
//		return resourceFatturaTarget.request().buildPost(Entity.json(f));
		System.out.println("dopo build post");
		return prova;
	}
}
