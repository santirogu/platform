/**
 * 
 */
package co.com.personal.project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import co.com.personal.project.Bussiness.projectBussiness;
import co.com.personal.project.domain.user;

/**
 * @author Santiago Rodríguez Gutiérrez
 *
 */
@Controller
@RequestMapping("/project")
public class projectController {
	
	@Autowired
	public projectBussiness projectBussiness;

	@RequestMapping("/listUsers")
	public @ResponseBody List<user> listUsers(@RequestParam(value = "name", required = false, defaultValue = "Santiago") String name){
		System.out.println(name);
		List<user> users = projectBussiness.getUsers();
		return users;
	}
}
