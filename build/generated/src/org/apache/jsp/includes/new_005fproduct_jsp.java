package org.apache.jsp.includes;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class new_005fproduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!--<link rel=\"stylesheet\" href=\"css/tinycarousel.css\" type=\"text/css\">\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.tinycarousel.js\"></script>-->\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t\t$(document).ready(function()\n");
      out.write("\t\t{\n");
      out.write("\t\t\t$('#slider2').tinycarousel({ interval: true });\n");
      out.write("                        var slider2 = $(\"#slider2\").data(\"plugin_tinycarousel\");\n");
      out.write("                         slider2.start();\n");
      out.write("\t\t});\n");
      out.write("\t</script>\n");
      out.write("        \n");
      out.write("<div class=\"right-content-box\">\n");
      out.write("   <div class=\"top-right-content-box\">Sản phẩm mới</div>\n");
      out.write("                        <div class=\"middle-right-content-box\">\n");
      out.write("                                               <div id=\"slider2\">\n");
      out.write("\t\t<!--<a class=\"buttons prev\" href=\"#\">&#60;</a>-->\n");
      out.write("\t\t<div class=\"viewport\">\n");
      out.write("\t\t\t<ul class=\"overview\">\n");
      out.write("    \n");
      out.write("                  </div>\n");
      out.write("\t\t<!--<a class=\"buttons next\" href=\"#\">&#62;</a>-->\n");
      out.write("\t</div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"bottom-right-content-box\"></div>\n");
      out.write("   </div>\n");
      out.write("       \n");
      out.write("    ");
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
