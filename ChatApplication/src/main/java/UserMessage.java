
public class UserMessage {
	
	String userID;
	String message;
	
	public UserMessage() {
		userID = "";
		message = "";
	}
	public UserMessage(String userID, String message)
	{
		this.userID = userID;
		this.message = message;
	}
	
	public String getUserID()
	{
		return userID;
	}
	public void setUserID()
	{
		this.userID = userID;
	}
	
	public String getMessage()
	{
		return message;
	}
	public void setMessage() {
		this.message = message;
	}
	
}
