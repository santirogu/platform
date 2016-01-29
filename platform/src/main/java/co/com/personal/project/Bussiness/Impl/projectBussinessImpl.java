/**
 * 
 */
package co.com.personal.project.Bussiness.Impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.personal.project.Bussiness.projectBussiness;
import co.com.personal.project.DAO.ProjectDAO;
import co.com.personal.project.DTO.State;
import co.com.personal.project.domain.user;

/**
 * @author Santiago Rodríguez Gutiérrez
 *
 */
@Service
public class projectBussinessImpl implements projectBussiness {

	@Autowired
	private ProjectDAO projectDAO;
	
	@Transactional
	public List<user> getUsers() {
		List<user> users = projectDAO.getUsers();
		return users;
	}

	@Transactional
	public State getUser(String user, String password) {
		return projectDAO.getUser(user, password);
	}

}
