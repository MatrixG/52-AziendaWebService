package it.alfasoft.view;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import it.alfasoft.alex.bean.Fattura;
import it.alfasoft.controller.FatturaController;

@ManagedBean(name = "viewFatture")
@ViewScoped
public class ListaFattureView implements Serializable {

	private static final long serialVersionUID = 1L;
	private List<Fattura> fatture;

	public ListaFattureView() {

	}

	@PostConstruct
	public void init() {

		fatture = new FatturaController().listaFatture();

	}

	public List<Fattura> getFatture() {
		
		return fatture;
	}

	public void setFatture(List<Fattura> fatture) {

		this.fatture = fatture;
	}

}
