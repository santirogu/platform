/**
 * 
 */
package co.com.personal.project.DAO;

import java.util.List;

import co.com.personal.project.DTO.State;
import co.com.personal.project.domain.user;

/**
 * @author Santiago Rodríguez Gutiérrez
 *
 */
public interface ProjectDAO {
	/**
	 * @return Users list
	 */
	public List<user> getUsers();
	/**
	 * It is for control login of users
	 * @return Success if user exist and error if not exist
	 */
	public State getUser(String user, String password);
}
