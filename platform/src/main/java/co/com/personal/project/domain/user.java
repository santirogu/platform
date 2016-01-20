/**
 * 
 */
package co.com.personal.project.domain;

import java.sql.Date;

import javax.persistence.Entity;

/**
 * @author Santiago Rodríguez Gutiérrez
 *
 */
@Entity
public class user {
	private String username;
	private String password;
	private Date lastconnection;
	private String name;
	private String lastname;
	private Date birthdate;
	private String cellphone;
	private String email;
	private int usertype;
	private float latitude;
	private float longitude;
	private String iplastconnection;
	private boolean available;
	/**
	 * @param username
	 * @param password
	 * @param lastconnection
	 * @param name
	 * @param lastname
	 * @param birthdate
	 * @param cellphone
	 * @param email
	 * @param usertype
	 * @param latitude
	 * @param longitude
	 * @param iplastconnection
	 * @param available
	 */
	public user(String username, String password, Date lastconnection, String name, String lastname, Date birthdate,
			String cellphone, String email, int usertype, float latitude, float longitude, String iplastconnection,
			boolean available) {
		super();
		this.username = username;
		this.password = password;
		this.lastconnection = lastconnection;
		this.name = name;
		this.lastname = lastname;
		this.birthdate = birthdate;
		this.cellphone = cellphone;
		this.email = email;
		this.usertype = usertype;
		this.latitude = latitude;
		this.longitude = longitude;
		this.iplastconnection = iplastconnection;
		this.available = available;
	}
	/**
	 * 
	 */
	public user() {
		super();
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the lastconnection
	 */
	public Date getLastconnection() {
		return lastconnection;
	}
	/**
	 * @param lastconnection the lastconnection to set
	 */
	public void setLastconnection(Date lastconnection) {
		this.lastconnection = lastconnection;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}
	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	/**
	 * @return the birthdate
	 */
	public Date getBirthdate() {
		return birthdate;
	}
	/**
	 * @param birthdate the birthdate to set
	 */
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	/**
	 * @return the cellphone
	 */
	public String getCellphone() {
		return cellphone;
	}
	/**
	 * @param cellphone the cellphone to set
	 */
	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the usertype
	 */
	public int getUsertype() {
		return usertype;
	}
	/**
	 * @param usertype the usertype to set
	 */
	public void setUsertype(int usertype) {
		this.usertype = usertype;
	}
	/**
	 * @return the latitude
	 */
	public float getLatitude() {
		return latitude;
	}
	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}
	/**
	 * @return the longitude
	 */
	public float getLongitude() {
		return longitude;
	}
	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}
	/**
	 * @return the iplastconnection
	 */
	public String getIplastconnection() {
		return iplastconnection;
	}
	/**
	 * @param iplastconnection the iplastconnection to set
	 */
	public void setIplastconnection(String iplastconnection) {
		this.iplastconnection = iplastconnection;
	}
	/**
	 * @return the available
	 */
	public boolean isAvailable() {
		return available;
	}
	/**
	 * @param available the available to set
	 */
	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	
}
