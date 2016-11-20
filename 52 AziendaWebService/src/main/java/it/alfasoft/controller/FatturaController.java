package it.alfasoft.controller;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import it.alfasoft.alex.bean.Fattura;
import it.alfasoft.clientWebServer.InvocazioneFattura;

@ManagedBean(name = "cntrFatture", eager = true)
@ViewScoped
public class FatturaController {

	private InvocazioneFattura invocazione;

	public FatturaController() {

		invocazione = new InvocazioneFattura();
	}

	public String registraFattura(Fattura f) {

		invocazione.inviaFattura(f).invoke();
		return "fatturaRegistrata?faces-reidrect-true";
	}

	public List<Fattura> listaFatture() {

		return invocazione.listaFatture();
	}

}
