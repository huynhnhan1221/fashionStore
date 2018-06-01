package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.my.bean.*;
import com.my.dao.*;

public final class intropage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/admin_includes/admin_header.jsp");
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
      out.write("\n");
      out.write("\n");
      out.write("<script src=\"tinymce/tinymce.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\ttinymce.init({\n");
      out.write("    selector: \"textarea\",\n");
      out.write("    theme: \"modern\",\n");
      out.write("    width: 350,\n");
      out.write("    height: 150,\n");
      out.write("    plugins: [\n");
      out.write("         \"advlist autolink link image lists charmap print preview hr anchor pagebreak spellchecker\",\n");
      out.write("         \"searchreplace wordcount visualblocks visualchars code fullscreen insertdatetime media nonbreaking\",\n");
      out.write("         \"save table contextmenu directionality emoticons template paste textcolor\"\n");
      out.write("   ],\n");
      out.write("   content_css: \"css/content.css\",\n");
      out.write("   toolbar: \"insertfile undo redo | styleselect | bold italic | alignleft aligncenter alignright alignjustify | bullist numlist outdent indent | l      ink image | print preview media fullpage | forecolor backcolor emoticons\", \n");
      out.write("   style_formats: [\n");
      out.write("        {title: 'Bold text', inline: 'b'},\n");
      out.write("        {title: 'Red text', inline: 'span', styles: {color: '#ff0000'}},\n");
      out.write("        {title: 'Red header', block: 'h1', styles: {color: '#ff0000'}},\n");
      out.write("        {title: 'Example 1', inline: 'span', classes: 'example1'},\n");
      out.write("        {title: 'Example 2', inline: 'span', classes: 'example2'},\n");
      out.write("        {title: 'Table styles'},\n");
      out.write("        {title: 'Table row 1', selector: 'tr', classes: 'tablerow1'}\n");
      out.write("    ]\n");
      out.write(" }); \n");
      out.write("</script>\n");

    String message = (String)request.getAttribute("message");
    String newID = (String)request.getParameter("newsid");
        
    if(message==null)   message="";
    if(newID!=null)     session.setAttribute("newsid", newID);
    
    NewsDAO newDAO = new NewsDAO();
        
    String delnewID = request.getParameter("delnewsid");
    if(delnewID!=null){
        if(newDAO.deleteNews(delnewID))
            message = "Delete completed!";
        else message = "Failed ! Try again";
    }
        
    Hashtable news =newDAO.selectAll();
    Enumeration enumcats = news.elements();
        
    News editnew = null;
    if(newID!=null) 
        editnew = (News)news.get(newID);

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery-1.10.2.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            function extractFilename(path) { \n");
      out.write("                var name;\n");
      out.write("                var x;\n");
      out.write("                x = path.lastIndexOf('\\\\');\n");
      out.write("                if (x >= 0) // Windows-based path\n");
      out.write("                    return path.substr(x+1);\n");
      out.write("                x = path.lastIndexOf('/');\n");
      out.write("                if (x >= 0) // Unix-based path\n");
      out.write("                    return path.substr(x+1);\n");
      out.write("                return path; // just the filename\n");
      out.write("            }\n");
      out.write("            function updateFilename(path) {\n");
      out.write("                var name = extractFilename(path);\n");
      out.write("                document.getElementById('filename').value = name;\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery.carouFredSel-6.2.1-packed.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t$(document).ready(function(){\n");
      out.write("\t\t$('#foo1').carouFredSel({\n");
      out.write("\t\t\t\t\tauto: {\n");
      out.write("\t\t\t\t\t\tpauseOnHover: 'resume',\n");
      out.write("\t\t\t\t\t\tprogress: '#timer1'\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t}, {\n");
      out.write("\t\t\t\t\ttransition: true\n");
      out.write("\t\t\t\t});\n");
      out.write("\t});\n");
      out.write("\t\t\n");
      out.write("\t</script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function(){\n");
      out.write("                checkAndUncheck();\n");
      out.write("            });\n");
      out.write("            function checkAndUncheck(){\n");
      out.write("                var checked=$(this).attr(\"checked\");\n");
      out.write("                if(!checked) checked=\"\";\n");
      out.write("                $(\".admin_table.tr_hover td input:checkbox\").attr(\"checked\",checked);\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div align=\"center\" id=\"main\">\n");
      out.write("            <div align=\"center\" id=\"container\">\n");
      out.write("\t<div id=\"header\">\n");
      out.write("    \t<div class=\"top-header\"></div>\n");
      out.write("        <div align=\"center\" class=\"menu\">\n");
      out.write("            <ul style=\"margin-left: 0px;\">\n");
      out.write("                <li><a href=\"category.jsp\">Category</a></li>\n");
      out.write("                <li><a href=\"product.jsp\">Product</a></li>\n");
      out.write("                <li><a href=\"customer.jsp\">Customer</a></li>\n");
      out.write("                \n");
      out.write("                <li><a href=\"balancesource.jsp\">Balance Source</a></li>\n");
      out.write("                <li><a href=\"order.jsp\">Order</a></li>\n");
      out.write("                <li><a href=\"login.jsp?log=out\">Logout</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </div>");
      out.write("\n");
      out.write("<script src=\"js/jquery-ui.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"css/jquery-ui.css\">\n");
      out.write("\n");
      out.write(" <script>\n");
      out.write("$(function() {\n");
      out.write("$( \"#datepicker\" ).datepicker();\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("\t\n");
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
