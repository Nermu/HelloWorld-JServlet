<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <title>Chat Room</title>
  </head>
  <body>
    
    <form action="/ChatApplication/Chat" method="POST">
       <input type="" name="userID" placeholder="Enter your name" >
      <br><br>
      <br><br>
      <input type="text" name="roomID" placeholder="your roomID: " maxlength="500" autocomplete="off">
      <input type="text" name="message" placeholder="Enter a message..." maxlength="500" autocomplete="off">
      <br><br>
      <button type="submit" >Send</button>
    </form>

    <hr>
  </body>
</html>