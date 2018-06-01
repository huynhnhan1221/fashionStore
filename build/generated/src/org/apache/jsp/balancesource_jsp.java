package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.my.bean.*;
import com.my.dao.*;

public final class balancesource_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/admin_includes/admin_footer.jsp");
  }

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

    String message = (String)request.getAttribute("message");
    String bSource = (String)request.getParameter("bsource");
        
    if(message==null)   message="";
    if(bSource!=null)     session.setAttribute("bSource", bSource);
    
    BalanceSourceDAO bsDAO = new BalanceSourceDAO();
     
      out.write("\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("    function confirm_decision(bsource_id){\n");
      out.write("    if(confirm(\"you want to delete the balance source?\")) // this will pop up confirmation box and if yes is clicked it call servlet else return to page\n");
      out.write("     {\n");
      out.write("       window.location=\"balancesource.jsp?delbsource=\"+bsource_id;\n");
      out.write("     }else{\n");
      out.write("       return false;\n");
      out.write("    }\n");
      out.write(" }\n");
      out.write("    \n");
      out.write("</script>\n");
      out.write("        ");

    String delbSource = request.getParameter("delbsource");
    if(delbSource!=null&&bsDAO.deleteBalanceSource(delbSource))
        message = "Delete completed!";
    else  if(delbSource!=null)  message = "Failed ! Try again";
       
    Hashtable balances = bsDAO.selectAll();
    Enumeration enumbalances = balances.elements();
        
    BalanceSource editbalance = null;
    if(bSource!=null) 
        editbalance = (BalanceSource)balances.get(bSource);
            
    

      out.write("\n");
      out.write("\n");
      out.write("\t");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<div id=\"footer\">\n");
      out.write("\t\t<div class=\"foot_ke\"></div>\n");
      out.write("\t\t<div class=\"foot_left\">\n");
      out.write("\t\t\t<strong style=\"margin-left:20px; text-transform:uppercase; font-weight:bold\">Copyright 2017 © </strong><br>\n");
      out.write("\n");
      out.write("\t\t\t<span class=\"chu_tieude\">Địa chỉ : 30 Hưng lợi - Ninh Kiều - Tp.Cần Thơ </span><br>\n");
      out.write("\n");
      out.write("\t\t\t<span class=\"chu_tieude\">Điện thoại : 0123456789 </span><br>\n");
      out.write("\n");
      out.write("                           \n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\n");
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
