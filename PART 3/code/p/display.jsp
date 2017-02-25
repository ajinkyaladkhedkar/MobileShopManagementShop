<%@ page import="java.sql.*" %>

<html>
<head><center><br><br>
<b><u>******DISPLAYING MOBILE DATABASE*******</u></b><br><br><br>
</center></head>
<body bgcolor="lightblue">

<%

     Connection con=null;

     try
       {
         Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
         con=DriverManager.getConnection("jdbc:odbc:ajinkx", "system", "ajinkya");

         String query="Select imei,bname,mno,camera from mobile order by imei"; 

         Statement stmt=con.createStatement();
         ResultSet rs=stmt.executeQuery(query);          
%>

         <center>             

         <table border="1" >
	<font face="Times New Roman" >

         <tr>             
         <th>IMEI</th>
         <th>MOBILE NAME</th>
         <th>MODEL NO.</th>
         <th>CAMERA (MP)</th>
         </tr>             

<%
         int imei=0,mno,camera;
      

         while(rs.next())
           {
             imei=rs.getInt("imei");
             mno=rs.getInt("mno");
             camera=rs.getInt("camera");
%>
          <tr>             
          <td> <%=imei %> </td>
          <td> <%=rs.getString("bname") %> </td>
          <td> <%=mno %> </td>
          <td> <%=camera %> </td>
          </tr>

<%
           }
%>

         </table>
         </center>             

<%
         rs.close();
         stmt.close();
         con.close();
       }
    catch(Exception e)
       {
         System.out.println(e);
       }

%>


<center><form action="front.jsp">
<br><br><a href="front.jsp">BACK</a>
</center>
</font>
</body>
</html>