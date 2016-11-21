package it.alfasoft.service;

import java.util.Date;
import java.util.List;
import it.alfasoft.alex.dao.BustaPagaDAO;
import it.alfasoft.alex.model.BustaPaga;

public class BustaPagaService {
	
	private BustaPagaDAO bDAO = new BustaPagaDAO();
	
	public BustaPagaService (){
		init();
	}

	

	public boolean aggiungiBustaPaga(BustaPaga b) {
		return bDAO.aggiungiBustaPaga(b);
	}

	public List<BustaPaga> getBustePaga() {
		return bDAO.getTutteBustePaga();
	}
	
	public void init(){
		
		BustaPaga temp;
		
		temp = new BustaPaga(1234, "cod01", new Date());
		bDAO.aggiungiBustaPaga(temp);

		temp = new BustaPaga(999, "cod02", new Date());
		bDAO.aggiungiBustaPaga(temp);

		temp = new BustaPaga(543, "cod03", new Date());
		bDAO.aggiungiBustaPaga(temp);
	}

}
