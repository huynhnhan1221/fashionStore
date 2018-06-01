package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.my.bean.*;
import com.my.dao.*;

public final class category_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");

    String message = (String)request.getAttribute("message");
    String catID = (String)request.getParameter("catid");
        
    if(message==null)   message="";
    if(catID!=null)     session.setAttribute("catid", catID);
    
    CategoryDAO catDAO = new CategoryDAO();
     
      out.write("\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("    function confirm_decision(cat_id){\n");
      out.write("    if(confirm(\"you want to delete the category?\")) // this will pop up confirmation box and if yes is clicked it call servlet else return to page\n");
      out.write("     {\n");
      out.write("       window.location=\"category.jsp?delcatid=\"+cat_id;\n");
      out.write("     }else{\n");
      out.write("       return false;\n");
      out.write("    }\n");
      out.write(" }\n");
      out.write("    \n");
      out.write("</script>\n");
      out.write("        ");

    String delcatID = request.getParameter("delcatid");
    if(delcatID!=null){
        if(catDAO.deleteCategory(delcatID))
            message = "Delete completed!";
        else message = "Failed ! Try again";
    }
        
    Hashtable cats = catDAO.selectAll();
    Enumeration enumcats = cats.elements();
        
    Category editcat = null;
    if(catID!=null) 
        editcat = (Category)cats.get(catID);

      out.write('\n');
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
      out.write("\n");
      out.write("\t<div id=\"wrapper\">\n");
      out.write("\t\t<div class=\"admin-left-content\">\n");
      out.write("\t\t\t<div class=\"admin-left-content-box\">\n");
      out.write("\t\t\t\t<div class=\"admin-top-left-content-box\">Thêm Category</div>\n");
      out.write("\t\t\t\t<div class=\"admin-middle-left-content-box\">\n");
      out.write("                  <form action=\"UpdateCategoryServlet\" name=\"addcat\" method=\"post\">\n");
      out.write("                    <table>\n");
      out.write("                        ");
 if(catID!=null) { 
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Category ID: &nbsp;</td>\n");
      out.write("                            <td><b>");
      out.print(catID );
      out.write("</b></td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");
 } 
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Category: &nbsp;</td>\n");
      out.write("                            <td><input class=\"textfield\" type=\"text\" name=\"catname\" value=\"");
 if(catID!=null) out.print(editcat.getName()); 
      out.write("\"/></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Mô tả: &nbsp;</td>\n");
      out.write("                            <td><input class=\"textfield\" type=\"textarea\" name=\"catdescribes\" rows=\"5\" cols=\"20\" value=\"");
 if(catID!=null) out.print(editcat.getDescribes()); 
      out.write("\"/></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("           ");
 
                                if(catID!=null) {
                                    out.print("<td><input class='btn_active' type='submit' name='btnedit' value='Cập nhật'/></td>");
                                    out.print("<td><input class='btn_active' type='submit' name='btncancel' value='Hủy'/></td>");
                                }
                                else {
                                    out.print("<td><input class='btn_active' type='submit' name='btnadd' value='Thêm'/></td>");
                                    out.print("<td><input class='btn_active' type='reset' name='btnreset' value='Reset'/></td>");
                                }
         
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                </form>\n");
      out.write("                                </div>\n");
      out.write("\t\t\t\t<div class=\"admin-bottom-left-content-box\"></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"message\">\n");
      out.write("                            <p style=\"color: #04cf61;font-size: 16px;\">");
      out.print(message );
      out.write("</p>\n");
      out.write("                        </div>\n");
      out.write("                </div>\n");
      out.write("\t\t<div align=\"center\" class=\"content\">\n");
      out.write("                    \n");
      out.write("\t\t\t<div class=\"content-box\">\n");
      out.write("\t\t\t\t<div class=\"top-content-box\"><div class=\"top-content-box-icon\"></div>Danh sách Category</div>\n");
      out.write("\t\t\t\t<div class=\"middle-content-box\">\n");
      out.write("                <table class=\"admin_table\" border=\"1\" cellspacing=\"2\">\n");
      out.write("                    <tr class=\"admin_table_header\">\n");
      out.write("                        <td>id</td>\n");
      out.write("                        <td>Tên</td>\n");
      out.write("                        <td>Mô tả</td>\n");
      out.write("                        <td>Chức năng</td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");

                        while(enumcats.hasMoreElements()) {
                            Category cat = (Category)enumcats.nextElement();
                    
      out.write("\n");
      out.write("                    <tr class=\"tr_hover\">\n");
      out.write("                        <td> ");
      out.print(cat.getId() );
      out.write(" </td>\n");
      out.write("                        <td> ");
      out.print(cat.getName() );
      out.write(" </td>\n");
      out.write("                        <td> ");
      out.print(cat.getDescribes() );
      out.write(" </td>\n");
      out.write("                        <td>\n");
      out.write("                            <a href=\"category.jsp?catid=");
      out.print(cat.getId() );
      out.write("\" title=\"chỉnh sửa\"><img src=\"images/icon/Modify.png\" alt=\"Edit\"/></a>&nbsp;&nbsp;&nbsp;\n");
      out.write("                            <a onclick=\"confirm_decision('");
      out.print(cat.getId() );
      out.write("');\" title=\"xóa bản ghi\"><img src=\"images/icon/Delete.png\" alt=\"Delete\"/></a>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("      ");

    }

      out.write("\n");
      out.write("                </table>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("\t\t\t\t<div class=\"bottom-content-box\"></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t</div>\n");
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
