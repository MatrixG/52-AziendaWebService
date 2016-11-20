package it.alfasoft.controller;

import java.io.IOException;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import it.alfasoft.alex.bean.Fattura;
import it.alfasoft.clientWebServer.InvocazioneFattura;
import it.alfasoft.view.CercaFatturaView;

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
	
	public String cercaFatture(CercaFatturaView data) throws IOException{
		
		
		if (data.getMese() != null){
			data.setFatture(invocazione.cercaFatture(data.getAnno(), data.getMese()));
		}else{
			data.setFatture(invocazione.cercaFatture(data.getAnno()));
		}
		List<Fattura> temp = data.getFatture();
		for (Fattura f : temp){
			System.out.println(f.getCodice_fattura());
		}
		
		return "risultatiCerca";
	}

}
