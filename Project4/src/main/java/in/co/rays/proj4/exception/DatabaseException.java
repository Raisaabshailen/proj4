package in.co.rays.proj4.exception;

/**
 * DatabaseException is propogated by DAO classes when an unhandled Database
 * exception occurred
 *
 * @author Shailendra Rai
 *
 */
public class DatabaseException extends Exception{

	 /**
     * @param msg
     *            : Error message
     */
	public DatabaseException(String msg){
		
		super(msg);
	}
}
