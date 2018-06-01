package org.apache.jsp.includes;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sidebar_005fleft_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t\t\t<div class=\"left-content-box\">\n");
      out.write("\t\t\t\t<div class=\"top-left-content-box\">Danh mục</div>\n");
      out.write("\t\t\t\t<div class=\"menu-middle-left-content-box\">\n");
      out.write("                                    <table>\n");
      out.write("  \n");
      out.write("\n");
      out.write("                                    </table>\n");
      out.write("                                </div>\n");
      out.write("\t\t\t\t<div class=\"bottom-left-content-box\"></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("                       \n");
      out.write("                  <div class=\"left-content-box\">\n");
      out.write("\t\t\t\t<div class=\"top-left-content-box\">Hỗ trợ</div>\n");
      out.write("\t\t<div class=\"menu-middle-left-content-box\">\n");
      out.write("                    <img src=\"images/icon/support.jpg\" alt=\"hotline\" width=\"50\" height=\"50\"/> \n");
      out.write("                </div>\n");
      out.write("                                \n");
      out.write("\t\t\t\t<div class=\"bottom-left-content-box\">SDT: <b style=\"color: red\">0916 090 900</b></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("                                    \n");
      out.write("\t\t\t<div class=\"left-content-box\">");
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
