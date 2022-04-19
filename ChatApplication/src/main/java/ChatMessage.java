
public class ChatMessage {
	
	String userID;
	String roomID;
	String message;
	
	public ChatMessage() {
		userID = "";
		roomID = "";
		message = "";
	}
	public ChatMessage(String userID, String roomID,String message)
	{
		this.userID = userID;
		this.roomID = roomID;
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
	
	public String getRoomID()
	{
		return roomID;
	}
	public void setRoomID() {
		this.roomID = roomID;
	}
	
	public String getMessage()
	{
		return message;
	}
	public void setMessage() {
		this.message = message;
	}
	
}
