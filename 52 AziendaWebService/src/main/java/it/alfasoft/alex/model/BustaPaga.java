package it.alfasoft.alex.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class BustaPaga {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idBusta;
	private double importo;
	private String codice_busta;
	private Date data_emissione;
	
	public BustaPaga(){
		
	}

	public BustaPaga(float importo, String codice_busta, Date data_emissione) {
		
		this.importo = importo;
		this.codice_busta = codice_busta;
		this.data_emissione = data_emissione;
	}

	public long getIdBusta() {
		return idBusta;
	}

	public void setIdBusta(long idBusta) {
		this.idBusta = idBusta;
	}

	public double getImporto() {
		return importo;
	}

	public void setImporto(double importo) {
		this.importo = importo;
	}

	public String getCodice_busta() {
		return codice_busta;
	}

	public void setCodice_busta(String codice_busta) {
		this.codice_busta = codice_busta;
	}

	public Date getData_emissione() {
		return data_emissione;
	}

	public void setData_emissione(Date date) {
		this.data_emissione = date;
	}
	
	

}
