/**
 * 
 */
package co.com.personal.project.Bussiness;

import java.util.List;

import co.com.personal.project.DTO.State;
import co.com.personal.project.domain.user;

/**
 * @author Santiago Rodríguez Gutiérrez
 *
 */
public interface projectBussiness {
	
	public List<user> getUsers();
	public State getUser(String user, String password);
}
