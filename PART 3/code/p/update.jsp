<%@ page import="java.sql.*" %>
<html>
<head >
<center> <b><font face="Times New Roman" size="6">
 ----<u>UPDATE MOBILE PHONE</u>----</font> </center>
</head>
<body bgcolor="LIGHTBLUE"><font face="Times New Roman" size="4"> 
<br> <br> <br> 

<%
String imei=request.getParameter("imei");
String mno="",brand="",camera="";

Connection con=null;
try{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con=DriverManager.getConnection("jdbc:odbc:ajinkx","system","ajinkya");

String query="Select * from mobile where imei='" + imei + "'";

Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery(query);

if(rs.next())
{
 mno=rs.getString("mno");
 brand=rs.getString("bname");
 camera=rs.getString("camera");
 
}

rs.close();
stmt.close();
con.close();
}
catch(Exception e)
  {
    System.out.println(e); 
  }
%>
<center>
<form action="modify.jsp">
IMEI:<input type="text" name="imei" value="<%=imei %>" disabled> <br><br>
BRAND:<input type="text" name="brand" value="<%=brand %>" > <br><br>
MODEL NO:<input type="text" name="mno" value="<%=mno %>"> <br><br>
CAMERA(MP) :<input type="text" name="camera" value="<%=camera %>"> <br><br>
<input  type="submit" value="UPDATE">
<input type="text" name="imei1" value="<%=imei %>" hidden> <br><br>
<br><br><a href="front.jsp">BACK</a>

</center>
</form>
</body>
</html>