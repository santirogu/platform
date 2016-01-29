/**
 * 
 */
package co.com.personal.project.DTO;

/**
 * @author Santiago Rodríguez Gutiérrez
 *
 */
public class State {
	private String status;

	/**
	 * @param status
	 */
	public State(String status) {
		super();
		this.status = status;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
}
