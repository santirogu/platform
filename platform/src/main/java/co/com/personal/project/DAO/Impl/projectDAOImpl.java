/**
 * 
 */
package co.com.personal.project.DAO.Impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.com.personal.project.DAO.ProjectDAO;
import co.com.personal.project.DTO.State;
import co.com.personal.project.domain.user;

/**
 * @author Santiago Rodríguez Gutiérrez
 *
 */
@Repository
public class projectDAOImpl implements ProjectDAO {

	@Autowired
	private SessionFactory sessionfactory;
	
	public List<user> getUsers() {
		Session session = sessionfactory.getCurrentSession();
		Query query = session.createQuery("FROM users");
		@SuppressWarnings("unchecked")
		List<user> usersList = (List<user>)query.list();
		return usersList;
	}

	public State getUser(String user, String password) {
		Session session = sessionfactory.getCurrentSession();
		session.clear();
		State state;
		try {
			Query query = session.createQuery("FROM user WHERE user = :user AND password = :password");
			query.setParameter("user", user);
			query.setParameter("password", password);
			state = new State("success");
		} catch (Exception e) {
			state = new State(e.getMessage().toString());
		}
		return state;
	}

}
