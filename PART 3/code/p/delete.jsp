<%@ page import="java.sql.*" %>

<html>
<body>

<%
       String imei=request.getParameter("imei");

     Connection con=null;

     try
       {
         Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
         con=DriverManager.getConnection("jdbc:odbc:ajinkx", "system", "ajinkya");

         String query="Delete from mobile where imei=" + imei; 

         Statement stmt=con.createStatement();
         stmt.executeUpdate(query);          

         stmt.close();
         con.close();
       }
    catch(Exception e)
       {
         System.out.println(e);
       }

%>

<script language="javascript">
  alert("Record deleted succ")
  document.location.href="front.jsp";
</script>

</body>
</html>