package it.alfasoft.clientWebService;

import java.util.List;

import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;

import it.alfasoft.alex.bean.Fattura;

public class InvocazioneFattura extends Invocazione {

	private WebTarget resourceFatturaTarget;
	
	public InvocazioneFattura() {
		super();
		resourceFatturaTarget = appTarget.path("/risorsa");
		
	}
	
	public Invocation inviaFattura(Fattura f) {

		return resourceFatturaTarget.request().buildPost(Entity.json(f));
	}

	
	public List<Fattura> listaFatture() {
		
		return resourceFatturaTarget.path("/listaFatture")
									.request().get()
									.readEntity(new GenericType<List<Fattura>>(){});
	}

	public List<Fattura> cercaFatture(String anno) {
		return resourceFatturaTarget.path("cerca").path(anno).request()
									.get().readEntity(new GenericType<List<Fattura>>(){});
	}

	public List<Fattura> cercaFatture(String anno, String mese) {
		return resourceFatturaTarget.path("cerca").path(anno).path(mese).request()
									.get().readEntity(new GenericType<List<Fattura>>(){});
	}
}
