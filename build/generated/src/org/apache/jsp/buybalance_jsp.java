package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.my.bean.*;
import com.my.dao.*;

public final class buybalance_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");

    Customer cus = (Customer)session.getAttribute("customer");
    String message = (String)request.getAttribute("message");
    if(message==null)   message="";
    ProductDAO productDAO = new ProductDAO();                
    CategoryDAO catDAO = new CategoryDAO();

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery-1.10.2.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div align=\"center\" id=\"main\">\n");
      out.write("            <div align=\"center\" id=\"container\">\n");
      out.write("\t<div id=\"header\">\n");
      out.write("    \t<div class=\"top-header\"></div>\n");
      out.write("        <div align=\"center\" class=\"menu\">\n");
      out.write("            <ul style=\"margin-left: 80px;\">\n");
      out.write("                         <li><a href=\"index.jsp\">Trang chủ</a></li>\n");
      out.write("                         <li><a href=\"customerinfo.jsp\">Khách hàng</a></li>\n");
      out.write("                         <li><a href=\"buybalance.jsp\" class=\"current\">Nạp tiền</a></li>\n");
      out.write("                         <li><a href=\"ordercart.jsp\">Giỏ hàng</a></li>\n");
      out.write("                         <li><a href=\"login.jsp?log=out\">Đăng xuất</a></li>\n");
      out.write("                \n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\t<div id=\"wrapper\">\n");
      out.write("\t\t<div class=\"left-content\">\n");
      out.write("\t\t\t<div class=\"left-content-box\">\n");
      out.write("\t\t\t\t<div class=\"top-left-content-box\">Danh mục</div>\n");
      out.write("\t\t\t\t<div class=\"menu-middle-left-content-box\">\n");
      out.write("                                    <table>\n");
      out.write("         \n");
      out.write("                           \n");
      out.write("                                </div>\n");
      out.write("\t\t\t\t<div class=\"bottom-right-content-box\"></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("        </div>\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"footer\">\n");
      out.write("\t\t<div class=\"foot_ke\"></div>\n");
      out.write("\t\t<div class=\"foot_left\">\n");
      out.write("\t\t\t<strong style=\"margin-left:20px; font-weight:bold\">Copyright 2017 ©  </strong><br>\n");
      out.write("\n");
      out.write("\t\t\t<span class=\"chu_tieude\">Địa chỉ :  30 Hưng Lợi – Ninh Kiều – Tp.Cần Thơ </span><br>\n");
      out.write("\n");
      out.write("\t\t\t<span class=\"chu_tieude\">Điện thoại : 0123456789 </span><br>\n");
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("                           \n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"foot_ke\"></div>\n");
      out.write("\t</div>\n");
      out.write("    </div>\n");
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
