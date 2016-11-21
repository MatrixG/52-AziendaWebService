package it.alfasoft.alex.dao;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import it.alfasoft.alex.model.BustaPaga;
import it.alfasoft.utils.HibernateUtil;

public class BustaPagaDAO {
	
	public BustaPagaDAO(){
		
	}
	
	public boolean aggiungiBustaPaga(BustaPaga b) {

		Session session = HibernateUtil.openSession();

		Transaction tx = null;
		boolean result = false;
		try {

			tx = session.getTransaction();
			tx.begin();
			session.persist(b);
			tx.commit();
			result = true;

		} catch (Exception e) {
			tx.rollback();
		} finally {
			session.close();
		}

		return result;
	}

	// Resituisce la lista dei Dipendenti
	@SuppressWarnings("unchecked")
	public List<BustaPaga> getTutteBustePaga() {

		Session session = HibernateUtil.openSession();

		String hql = "FROM BustaPaga";

		Transaction tx = null;
		List<BustaPaga> result = null;

		try {

			tx = session.getTransaction();
			tx.begin();
			Query query = session.createQuery(hql);
			result = (List<BustaPaga>) query.list();
			tx.commit();

		} catch (Exception e) {
			tx.rollback();
		} finally {
			session.close();
		}
		return result;
	}
	

}
