package it.alfasoft.alex.bean;

import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.xml.bind.annotation.XmlRootElement;

@ManagedBean(name = "fattura", eager = true)
@XmlRootElement
public class Fattura {

	private Date dataEmissione;
	private double importo;
	private String codFattura;

	public Fattura() {

	}

	public Date getDataEmissione() {
		return dataEmissione;
	}

	public void setDataEmissione(Date dataEmissione) {
		this.dataEmissione = dataEmissione;
	}

	public double getImporto() {
		return importo;
	}

	public void setImporto(double importo) {
		this.importo = importo;
	}

	public String getCodFattura() {
		return codFattura;
	}

	public void setCodFattura(String codFattura) {
		this.codFattura = codFattura;
	}

}
