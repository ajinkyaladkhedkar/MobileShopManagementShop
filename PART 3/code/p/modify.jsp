<%@ page import="java.sql.*" %>

<html>
<body>

<%
       String imei=request.getParameter("imei1");
       String brand=request.getParameter("brand");
       String mno=request.getParameter("mno");
       String camera=request.getParameter("camera");
     Connection con=null;

     try
       {
         Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
         con=DriverManager.getConnection("jdbc:odbc:ajinkx", "system", "ajinkya");

         String query="Update mobile set  bname='" + brand + "',mno=" + mno + ",camera='" + camera +"' where imei='" + imei + "'";

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
  alert("Record updated succ")
  document.location.href="front.jsp";
</script>

</body>
</html>