//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
///**
// * Servlet implementation class Chat
// */
//@WebServlet("/ChatServlet")
//public class ChatServlet extends HttpServlet {
//
//	private static final long serialVersionUID = 1L;
//	
//	Map<String , List<UserMessage>> usersByRoom = new HashMap<String , List<UserMessage>>();
//	@Override
//	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//		
//		String roomID = request.getParameter("roomID"); 		
//		List<UserMessage> usersMessagesList = usersByRoom.get(roomID);
//		
//		for(UserMessage user : usersMessagesList)
//		{
//			response.getWriter().println(user.userID + " : " + user.message + "<br>");
//		}	
//	}
//
//	@Override
//	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
//		
//		String roomID = request.getParameter("roomID"); 
//		String userID = request.getParameter("userID");		
//		String message = request.getParameter("message");
//	    
//		UserMessage user = new UserMessage(userID, message);
//		List<UserMessage> userMessagesList = usersByRoom.get(roomID);
//		
//		if(userMessagesList == null) {
//			List<UserMessage> userList = new ArrayList<>();
//			userList.add(user);
//			usersByRoom.put(roomID, userList);
//		}else {
//			userMessagesList.add(user);
//			usersByRoom.replace(roomID, userMessagesList);
//		}
//
//	}
//
//}