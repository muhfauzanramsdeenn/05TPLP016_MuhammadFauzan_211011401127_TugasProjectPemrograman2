<%-- 
    Document   : index
    Created on : 15-Nov-2023, 12:35:30
    Author     : user12
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href='style.css' rel='stylesheet' type='text/css' />
        <title>JSP Page</title>
    </head>
    <body bgcolor="#808080">
       <%
        String menu="<br><b>Master Data</b><br>"
                    + "<a href=.>Stok</a><br>"
                    + "<a href=.>Jumlah Stok</a><br><br>"
                    + "<b>Transaksi</b><br>"
                    + "<a href=.>Penjualan</a><br><br>"
                    + "<b>Laporan</b><br>"
                    + "<a href=.>Jual</a><br><br>"
                    + "<a href=LoginController>Login</a><br><br>";
               String topMenu="<nav><ul>"
                    +"<li><a href=.>Home</a></li>"
                    +"<li><a href=#>Master Data</a>"
                    +"<ul>"
                    +"<li><a href=.>Jumlah Stok</a></li>"
                    +"<li><a href=.>Penjualan</a></li>"
                    +"</ul>"
                    +"</li>"
                    +"<li><a href=.>harga barang</a>"
                    +"<ul>"
                    +"<li><a href=.>harga</a></li>"
                    +"</ul>"
                    +"</li>"
                    +"<li><a href=.>promo</a>"
                    +"<ul>"
                    +"<li><a href=.>Notifikasi</a></li>"
                    +"</ul>"
                    +"</li>"
                    +"<li><a href=LoginController>check Out</a></li>"
                    +"</ul>"
                    +"</nav>";
                    String konten="<br><h1>Cuman Sampai Tanggal 1 Desember 2023 Buruan</h1>";
                    String userName="";
                    
                    if(!session.isNew()){
                        try {
                            userName = session.getAttribute("userName").toString();
                        } catch (Exception ex){}
                        if(!((userName == null) || userName.equals(""))){
                            konten += "<h2>"+userName+"</h2>";
                            try {
                                menu = session.getAttribute("menu").toString();
                            } catch (Exception ex) {}
                            try {
                                topMenu = session.getAttribute("topMenu").toString();
                            } catch (Exception ex) {}
                        }
                    }
                    %>
    <center>
        <table width="80%" bgcolor="#eeeeee">
            <tr>
                <td colspan="2" align="center">
                    <br> 
                    <h2 style="margin-bottom:0px; margin-top:0px">
                        PENJUALAN TOKO RAMSDENN
                    </h2>
                    <h1 style="margin-bottom: 0px; margin-top: 0px">
                        
                    </h1>
                    <h4 style="margin-bottom: 0px; margin-top: 0px">
                        Jl. K.H Mas Mansyur No 27 No. 1 Jakarta Pusat
                    </h4>
                    <br>
                </td>
            </tr>
            <tr height="200">
                <td width="200" align="center" valign="top" bgcolor="#dda15e">
                   <br>
                   <div id='menu'>
                       <%=menu %>
                   </div>
                </td>
                
                <td align="center" valgin="top" bgcolor="#dda15e">
                    <%=topMenu%>
                    <br>
                    <%=konten %>
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center" bgcolor="#dda15e">
                    <small>
                        Copyright &copy; 2016 Universitas Pamulang<br>
                        Jl. Kh Mas Mansyur No 27<br>
                    </small>
                </td>
            </tr>
        </table>
    </center>
    </body>
</html>