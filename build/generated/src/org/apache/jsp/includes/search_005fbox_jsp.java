package org.apache.jsp.includes;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Enumeration;
import java.util.Hashtable;
import com.my.bean.Category;
import com.my.dao.CategoryDAO;

public final class search_005fbox_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    $(document).ready(function(){\n");
      out.write("        $('#search_tenhang').autocomplete({\n");
      out.write("            source: function(require,response){\n");
      out.write("                $.ajax({\n");
      out.write("                    url:'search_ajax.jsp',\n");
      out.write("                    dataType:\"json\",\n");
      out.write("                    data:{\n");
      out.write("                        name_startsWith:request.term,\n");
      out.write("                        type:'name'\n");
      out.write("                    },\n");
      out.write("                    success:function(data){\n");
      out.write("                        response($.map(data,function(item){\n");
      out.write("                            return {\n");
      out.write("                                label:item,\n");
      out.write("                                value:item\n");
      out.write("                            };\n");
      out.write("                        }));\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            },\n");
      out.write("            autoFocus:true,\n");
      out.write("            minLength:0\n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("<div class=\"top-right-content-box\">Tìm kiếm</div>\n");
      out.write("                        <div class=\"middle-right-content-box\">\n");
      out.write("                            <form id=\"search_tenhang\" name=\"searchproduct\" action=\"SearchProductServlet\" method=\"post\">\n");
      out.write("                                <table>\n");
      out.write("                                    <tr><td colspan=\"2\"><input class=\"textfield_search\" type=\"text\" name=\"searchkey\" placeholder=\"Tìm tên sản phẩm\"></td></tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td colspan=\"2\">\n");
      out.write("                                            <select name=\"category_name\">\n");
      out.write("                                            ");

                                            CategoryDAO dao=new CategoryDAO();
                                           Hashtable list=dao.selectAll();
                                           Enumeration listcat=list.elements();
                                           while(listcat.hasMoreElements()){
                                               Category cat=(Category)listcat.nextElement();
                                           
                                            
      out.write("\n");
      out.write("                                            \n");
      out.write("                                            <option value=\"");
      out.print(cat.getId());
      out.write('"');
      out.write('>');
      out.print(cat.getName());
      out.write("</option>\n");
      out.write("                                                ");
}
      out.write("\n");
      out.write("                                            </select>\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr><td>\n");
      out.write("                                            <select name=\"price_from\">\n");
      out.write("                                                <option value=\"100\">100</option>\n");
      out.write("                                                <option value=\"300\">300</option>\n");
      out.write("                                                <option value=\"500\">500</option>\n");
      out.write("                                                <option value=\"700\">700</option>\n");
      out.write("                                                \n");
      out.write("                                                \n");
      out.write("                                            </select> &ShortRightArrow;\n");
      out.write("                                        </td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <select name=\"price_to\">\n");
      out.write("                                                <option value=\"300\">300</option>\n");
      out.write("                                                <option value=\"500\">500</option>\n");
      out.write("                                                <option value=\"700\">700</option>\n");
      out.write("                                                <option value=\"900\">900</option>\n");
      out.write("                                                \n");
      out.write("                                            </select>,000 VND\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr><td colspan=\"2\"><center><input class=\"btn_active_search\" type=\"submit\" name=\"btnsearch\" value=\"Tìm kiếm\"></center></td></tr>\n");
      out.write("                                </table>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"bottom-right-content-box\"></div>");
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
