<%@ page import="java.sql.*" %>

<html>
<body>

<%
       String uid=request.getParameter("login");
       String pass=request.getParameter("pass");

     Connection con=null;

     try
       {
         Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
         con=DriverManager.getConnection("jdbc:odbc:ajinkx", "system", "ajinkya");

         String query="select * from login where login='" + uid  + "' and pass='" + pass + "'";

         Statement stmt=con.createStatement();
         ResultSet rs=stmt.executeQuery(query);          
        if(!rs.next())
{
 %>
<script language="javascript">
  alert("Invalid login")
  document.location.href="login.jsp";
</script>
<%
}
else
response.sendRedirect("front.jsp");
         stmt.close();
         con.close();
       }
    catch(Exception e)
       {
         System.out.println(e);
       }

%>

<script language="javascript">
  alert("Record updated succ")
  document.location.href="front.jsp";
</script>

</body>
</html>