package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Team;

public class TeamHelper {
EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("BowlingLeagueHansen");
	
	public void insertItem(Team toAdd) {
		// TODO Auto-generated method stub

		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(toAdd);
		em.getTransaction().commit();
		em.close();
	}

	public List<Team> showAllItems() {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		TypedQuery<Team> allResults = em.createQuery("select li from Team li", Team.class);
		List<Team> allItems = allResults.getResultList();
		em.close();
		return allItems;
	}

	//public void deleteItem(Team toDelete) {
		// TODO Auto-generated method stub
	//	EntityManager em = emfactory.createEntityManager();
	//	em.getTransaction().begin();
	//	TypedQuery<Team> typedQuery = em.createQuery(
	//			"select li from Team li where li.id = :selectedId",
	//			Team.class);
	//	typedQuery.setParameter("selectedId", toDelete.getId());
	//	typedQuery.setMaxResults(1);
	//	Team result = typedQuery.getSingleResult(); 
	//	em.remove(result);
	//	em.getTransaction().commit();
	//	em.close();
	//}
	

	//public Team searchForItemById(int idToEdit) {
		// TODO Auto-generated method stub
	//	EntityManager em = emfactory.createEntityManager();
	//	em.getTransaction().begin();
	//	Team foundItem =  em.find(Team.class, idToEdit);
	//	em.close();
	//	return foundItem; 
	//}

	//public void updateItem(Team toEdit) {
		// TODO Auto-generated method stub
	//	EntityManager em = emfactory.createEntityManager();
	//	em.getTransaction().begin(); 
	//	em.merge(toEdit);
	//	em.getTransaction().commit();
	//	em.close();
	// 
	//}

}
