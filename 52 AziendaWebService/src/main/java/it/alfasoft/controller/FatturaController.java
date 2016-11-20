package it.alfasoft.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
//import javax.ws.rs.core.Response;

import it.alfasoft.alex.bean.Fattura;
import it.alfasoft.clientWebServer.InvocazioneFattura;

@ManagedBean(name = "cntrFatture", eager = true)
@ViewScoped
public class FatturaController {

	private List<Fattura> fatture;
	private InvocazioneFattura invocazione;

	public FatturaController() {

		invocazione = new InvocazioneFattura();
	}

	public List<Fattura> getFatture() {
		return fatture;
	}

	public void setFatture(List<Fattura> fatture) {
		this.fatture = fatture;
	}
	
    public String registraFattura(Fattura f){
    	
    	invocazione.inviaFattura(f).invoke();
    	return "fatturaRegistrata?faces-reidrect-true";
    }

}
