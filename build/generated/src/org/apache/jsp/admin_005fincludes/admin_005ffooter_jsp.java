package org.apache.jsp.admin_005fincludes;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_005ffooter_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<div id=\"footer\">\n");
      out.write("\t\t<div class=\"foot_ke\"></div>\n");
      out.write("\t\t<div class=\"foot_left\">\n");
      out.write("\t\t\t<strong style=\"margin-left:20px; text-transform:uppercase; font-weight:bold\">Copyright 2014 © THỜI TRANG Dodep.vn</strong><br>\n");
      out.write("\n");
      out.write("\t\t\t<span class=\"chu_tieude\">Địa chỉ : 15 Nguyễn Khuyến – phường Văn Quán – Quận Hà Đông – Tp.Hà Nội </span><br>\n");
      out.write("\n");
      out.write("\t\t\t<span class=\"chu_tieude\">Điện thoại : 04.626766181 -  04.39787238 - 04.39787239 - 04.39735247 </span><br>\n");
      out.write("\n");
      out.write("\t\t\t<span class=\"chu_tieude\">Hotline : 0913806277 - 0907284209</span><br>\n");
      out.write("\n");
      out.write("\t\t\t<span class=\"chu_tieude\">Email : dodep@yahoo.com.vn</span>\n");
      out.write("\t\t\t<span class=\"chu_tieude\">Fax : 04 973 5247</span><br>\n");
      out.write("                           \n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div class=\"foot_right\">\n");
      out.write("\n");
      out.write("\t\t\t<strong>Thiết kế xây dựng : </strong> \n");
      out.write("\t\t\t<span class=\"tencty_lm\">Trần Thanh Lam</span><br>\n");
      out.write("\t\t\t<strong>Điện thoại : 0982.77.99.70 - 0986.517.936.</strong><br>\n");
      out.write("\t\t\t<strong>Email : thanhlam2502@yahoo.com - babyrabbits_1992@yahoo.com</strong><br>\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div class=\"foot_ke\"></div>\n");
      out.write("\t</div>\n");
      out.write("    </div>\n");
      out.write("                <script type=\"text/javascript\">\n");
      out.write(" \n");
      out.write("$(\"tr.tr_hover\").hover(\n");
      out.write("  function () {\n");
      out.write("    $(this).css({\"background\":\"rgba(251,222,196,0.8)\"});\n");
      out.write("  }, \n");
      out.write("  function () {\n");
      out.write("    $(this).css(\"background\",\"\");\n");
      out.write("  }\n");
      out.write(");\n");
      out.write(" \n");
      out.write("</script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
