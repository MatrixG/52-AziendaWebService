package it.alfasoft.alex.bean;

import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.xml.bind.annotation.XmlRootElement;

@ManagedBean(name = "fattura", eager = true)
@XmlRootElement
public class Fattura {

	private Date data_emissione;
	private double importo;
	private String codice_fattura;

	public Fattura() {

	}

	public Date getData_emissione() {
		return data_emissione;
	}

	public void setData_emissione(Date data_emissione) {
		this.data_emissione = data_emissione;
	}

	public double getImporto() {
		return importo;
	}

	public void setImporto(double importo) {
		this.importo = importo;
	}

	public String getCodice_fattura() {
		return codice_fattura;
	}

	public void setCodice_fattura(String codice_fattura) {
		this.codice_fattura = codice_fattura;
	}

}
