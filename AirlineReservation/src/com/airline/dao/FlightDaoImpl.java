package com.airline.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import com.airline.bean.FlightDetails;

@Repository
public class FlightDaoImpl implements IFlightDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<FlightDetails> viewAllFlights() {
		String qry = "SELECT f FROM FlightDetails f";
		TypedQuery<FlightDetails> query = entityManager.createQuery(qry,
				FlightDetails.class);
		return query.getResultList();
	}

}
