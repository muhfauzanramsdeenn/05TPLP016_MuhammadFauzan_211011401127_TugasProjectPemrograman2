package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href='style.css' rel='stylesheet' type='text/css' />\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"#808080\">\n");
      out.write("       ");

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
                    
      out.write("\n");
      out.write("    <center>\n");
      out.write("        <table width=\"80%\" bgcolor=\"#eeeeee\">\n");
      out.write("            <tr>\n");
      out.write("                <td colspan=\"2\" align=\"center\">\n");
      out.write("                    <br> \n");
      out.write("                    <h2 style=\"margin-bottom:0px; margin-top:0px\">\n");
      out.write("                        PENJUALAN TOKO RAMSDENN\n");
      out.write("                    </h2>\n");
      out.write("                    <h1 style=\"margin-bottom: 0px; margin-top: 0px\">\n");
      out.write("                        \n");
      out.write("                    </h1>\n");
      out.write("                    <h4 style=\"margin-bottom: 0px; margin-top: 0px\">\n");
      out.write("                        Jl. K.H Mas Mansyur No 27 No. 1 Jakarta Pusat\n");
      out.write("                    </h4>\n");
      out.write("                    <br>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr height=\"200\">\n");
      out.write("                <td width=\"200\" align=\"center\" valign=\"top\" bgcolor=\"#dda15e\">\n");
      out.write("                   <br>\n");
      out.write("                   <div id='menu'>\n");
      out.write("                       ");
      out.print(menu );
      out.write("\n");
      out.write("                   </div>\n");
      out.write("                </td>\n");
      out.write("                \n");
      out.write("                <td align=\"center\" valgin=\"top\" bgcolor=\"#dda15e\">\n");
      out.write("                    ");
      out.print(topMenu);
      out.write("\n");
      out.write("                    <br>\n");
      out.write("                    ");
      out.print(konten );
      out.write("\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td colspan=\"2\" align=\"center\" bgcolor=\"#dda15e\">\n");
      out.write("                    <small>\n");
      out.write("                        Copyright &copy; 2016 Universitas Pamulang<br>\n");
      out.write("                        Jl. Kh Mas Mansyur No 27<br>\n");
      out.write("                    </small>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("    </center>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
