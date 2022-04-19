
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Chat
 */
@WebServlet("/Chat")
public class Chat extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	
	List<ChatMessage> usersList = new ArrayList<>();
	
	ChatMessage room = new ChatMessage();
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		for(ChatMessage user : usersList)
		{
			//if(user.roomID == room.roomID) {
			response.getWriter().println(user.userID + " : " + user.message + "<br>");
			System.out.println(user.userID + " : " + user.message );
			//}
		}	  
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		String userID = request.getParameter("userID");
		System.out.println("UserName: " + userID);
		String roomID = request.getParameter("roomID");
		System.out.println("RoomID: " + roomID);
		String message = request.getParameter("message");
		System.out.println("Message: " + message);
		System.out.println("-------------");
		
		usersList.add(new ChatMessage(userID, roomID, message));
		
	
	}
	}
