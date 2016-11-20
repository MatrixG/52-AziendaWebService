package it.alfasoft.view;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import it.alfasoft.alex.bean.Fattura;

@ManagedBean(name = "cercaFatturaView")
@RequestScoped
public class CercaFatturaView {

	private List<String> mesi;
	private String anno;
	private String mese;
	private List<Fattura> fatture;

	public CercaFatturaView() {

	}

	@PostConstruct
	public void init() {

		mesi = new ArrayList<String>();
		mesi.add("Seleziona Mese");
		mesi.add("Gennaio");
		mesi.add("Febbraio");
		mesi.add("Marzo");
		mesi.add("Aprile");
		mesi.add("Maggio");
		mesi.add("Giugno");
		mesi.add("Luglio");
		mesi.add("Agosto");
		mesi.add("Settembre");
		mesi.add("Ottobre");
		mesi.add("Novembre");
		mesi.add("Dicembre");

	}

	public String getAnno() {
		return anno;
	}

	public void setAnno(String anno) {
		this.anno = anno;
	}

	public String getMese() {
		return mese;
	}

	public void setMese(String mese) {
		
		switch (mese) {
		case "Gennaio":
			this.mese = "1";
			break;
		case "Febbraio":
			this.mese = "2";
			break;
		case "Marzo":
			this.mese = "3";
			break;
		case "Aprile":
			this.mese = "4";
			break;
		case "Maggio":
			this.mese = "5";
			break;
		case "Giugno":
			this.mese = "6";
			break;
		case "Luglio":
			this.mese = "7";
			break;
		case "Agosto":
			this.mese = "8";
			break;
		case "Settembre":
			this.mese = "9";
			break;
		case "Ottobre":
			this.mese = "10";
			break;
		case "Novembre":
			this.mese = "11";
			break;
		case "Dicembre":
			this.mese = "12";
			break;

		default:
			this.mese = "-1";
			break;
		}
	}

	public List<String> getMesi() {
		return mesi;
	}

	public void setMesi(List<String> mesi) {
		this.mesi = mesi;
	}

	public List<Fattura> getFatture() {
		return fatture;
	}

	public void setFatture(List<Fattura> fatture) {
		this.fatture = fatture;
	}

}
