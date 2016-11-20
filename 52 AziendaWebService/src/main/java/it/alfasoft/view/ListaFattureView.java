package it.alfasoft.view;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import it.alfasoft.alex.bean.Fattura;
import it.alfasoft.controller.FatturaController;

@ManagedBean (name = "viewFatture")
@ViewScoped
public class ListaFattureView implements Serializable {

	private static final long serialVersionUID = 1L;
	private List<Fattura> fatture;

	public ListaFattureView() {
		
	}
	
	@PostConstruct
	public void init(){
		setFatture(new FatturaController().listaFatture());
		for (Fattura f : fatture){
			System.out.println(f.getCodice_fattura() + " " + f.getImporto());
		}
	}

	public List<Fattura> getFatture() {
		return fatture;
	}

	public void setFatture(List<Fattura> fatture) {
		System.out.println("Sono entrato berta");
		this.fatture = fatture;
	}
	

}
