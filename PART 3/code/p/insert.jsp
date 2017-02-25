<%@ page import="java.sql.*" %>

<html>
<body>

<%
       String imei=request.getParameter("imei");
       String bname=request.getParameter("bname");
       String mno=request.getParameter("mno");
       String camera=request.getParameter("camera");
     Connection con=null;

     try
       {
         Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
         con=DriverManager.getConnection("jdbc:odbc:ajinkx", "system", "ajinkya");

         String query="Insert into mobile values(" + imei + ",'" + bname + "'," + mno + ","+camera+")"; 

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
  alert("Record added succ")
  document.location.href="front.jsp";
</script>

</body>
</html>