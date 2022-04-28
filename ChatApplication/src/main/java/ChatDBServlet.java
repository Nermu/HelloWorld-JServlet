import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class ChatDBServlet
 */
@WebServlet("/ChatDBServlet")
public class ChatDBServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public ChatDBServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection con;
		String roomID = request.getParameter("roomID"); 		
        String sql = "SELECT * FROM users_messages WHERE roomID = ?";         
        PreparedStatement statement;
        
		try {
			con = DatabaseConnection.initializeDatabase();
			statement = con.prepareStatement(sql);
			statement.setString(1, roomID);
	         
	        ResultSet resultSet = statement.executeQuery();
	        while (resultSet.next()) {
	        	roomID = resultSet.getString("roomID");
	            String userID = resultSet.getString("userID");
	            String message = resultSet.getString("message");         
	            UserMessage userMessages = new UserMessage(userID, message);
	            
	            response.getWriter().println(userMessages.userID + " : " + userMessages.message + "<br>");	
	        }
	         
	        resultSet.close();
	        statement.close();
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
                 
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		Connection con;
		try {
			String roomID = request.getParameter("roomID");
			String userID = request.getParameter("userID");
			String message = request.getParameter("message");
			
			UserMessage userMessages = new UserMessage(userID, message);
			
			con = DatabaseConnection.initializeDatabase();
			
				PreparedStatement st = con.prepareStatement("INSERT INTO chatMessages.users_messages (roomID, userID, message) VALUES (?, ?, ?)");
				  
	            st.setString(1, request.getParameter("roomID"));
	            st.setString(2, userMessages.userID);
	            st.setString(3, userMessages.message);
	            st.execute();
	          
		        st.close();
		        con.close();	
	            
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			System.out.println("Invalid user...");
		}
	}

}
