/**
 * 
 */
package co.com.personal.project.domain;

import javax.persistence.Entity;

/**
 * @author Santiago Rodríguez Gutiérrez
 *
 */
@Entity
public class usertype {
	private Long id;
	private String type;
	/**
	 * @param id
	 * @param type
	 */
	public usertype(Long id, String type) {
		super();
		this.id = id;
		this.type = type;
	}
	/**
	 * 
	 */
	public usertype() {
		super();
	}
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	
}
