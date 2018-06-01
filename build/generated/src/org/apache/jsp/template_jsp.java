package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.my.bean.*;
import com.my.dao.*;

public final class template_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    String message = (String)request.getAttribute("message");
    if(message==null)   message="";
        
    FoodDAO foodDAO = new FoodDAO();
    CategoryDAO catDAO = new CategoryDAO();

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div align=\"center\" id=\"main\">\n");
      out.write("            <div align=\"center\" id=\"container\">\n");
      out.write("\t<div id=\"header\">\n");
      out.write("    \t<div class=\"top-header\"></div>\n");
      out.write("        <div align=\"center\" class=\"menu\">\n");
      out.write("            <ul style=\"margin-left: 150px;\">\n");
      out.write("                ");
 if(cart==null) { 
      out.write("\n");
      out.write("            \t<li><a href=\"index.jsp\" class=\"current\">Trang chủ</a></li>\n");
      out.write("                <li><a href=\"intro.jsp\">Giới thiệu</a></li>\n");
      out.write("                <li><a href=\"login.jsp\">Đăng nhập</a></li>\n");
      out.write("                <li><a href=\"register.jsp\">Đăng ký</a></li>\n");
      out.write("                ");
 } else { 
      out.write("\n");
      out.write("                         <li><a href=\"index.jsp\" class=\"current\">Trang chủ</a></li>\n");
      out.write("                         <li><a href=\"customerinfo.jsp\">Khách hàng</a></li>\n");
      out.write("                         <li><a href=\"buybalance.jsp\">Nạp tiền</a></li>\n");
      out.write("                         <li><a href=\"ordercart.jsp\">Giỏ hàng</a></li>\n");
      out.write("                         <li><a href=\"logout.jsp\">Đăng xuất</a></li>\n");
      out.write("                ");
 } 
      out.write("\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\t<div id=\"wrapper\">\n");
      out.write("\t\t<div class=\"left-content\">\n");
      out.write("\t\t\t<div class=\"left-content-box\">\n");
      out.write("\t\t\t\t<div class=\"top-left-content-box\">Category</div>\n");
      out.write("\t\t\t\t<div class=\"menu-middle-left-content-box\">\n");
      out.write("                                    <table>\n");
      out.write("           ");

                    
                    Hashtable cats = catDAO.selectAll();
                    Enumeration enumcats = cats.elements();
                    while(enumcats.hasMoreElements()){
                         Category cat = (Category)enumcats.nextElement();

      out.write("\n");
      out.write("                            <tr><td><a href=\"categoryfood.jsp?catID=");
      out.print(cat.getId());
      out.write('"');
      out.write('>');
      out.print(cat.getName());
      out.write("</a></td></tr>\n");
      out.write("                    ");
 } 
      out.write("\n");
      out.write("                                    </table>\n");
      out.write("                                </div>\n");
      out.write("\t\t\t\t<div class=\"bottom-left-content-box\"></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"left-content-box\">\n");
      out.write("\t\t\t\t<div class=\"top-left-content-box\">Hôm nay</div>\n");
      out.write("\t\t\t\t<div class=\"middle-left-content-box\">\n");
      out.write("                                    <table>\n");
      out.write("           ");

                    
                    Hashtable todayfoods = foodDAO.selectTodayFood();
                    Enumeration enumtodayfoods = todayfoods.elements();
                    while(enumtodayfoods.hasMoreElements()){
                         Food food = (Food)enumtodayfoods.nextElement();

      out.write("\n");
      out.write("                        <tr><td><a href=\"fooddetail.jsp?foodid=");
      out.print(food.getId());
      out.write("\">\n");
      out.write("                                <img src=\"images_data/");
      out.print(food.getImage() );
      out.write("\" width=\"150\" height=\"100\"/>\n");
      out.write("                        </a></td></tr>\n");
      out.write("                    ");
 } 
      out.write("\n");
      out.write("                                    </table>\n");
      out.write("                                </div>\n");
      out.write("\t\t\t\t<div class=\"bottom-left-content-box\"></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("        </div>\n");
      out.write("\t\t<div align=\"center\" class=\"content\">\n");
      out.write("                    <div class=\"message\">\n");
      out.write("                        <p>");
      out.print(message );
      out.write("</p>\n");
      out.write("                    </div>\n");
      out.write("\t\t\t<div class=\"content-box\">\n");
      out.write("\t\t\t\t<div class=\"top-content-box\"><div class=\"top-content-box-icon\"></div>Chi tiết món ăn</div>\n");
      out.write("\t\t\t\t<div class=\"middle-content-box\">\n");
      out.write("                    \n");
      out.write("             <form name=\"registerform\" action=\"CustomerRegisterServlet\" method=\"post\">\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Username: &nbsp;</td>\n");
      out.write("                        <td><input type=\"text\" name=\"username\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Password: &nbsp;</td>\n");
      out.write("                        <td><input type=\"password\" name=\"pword\" id=\"pword1\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Confirm Password: &nbsp;</td>\n");
      out.write("                        <td><input type=\"password\"  id=\"pword2\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Fullname: &nbsp;</td>\n");
      out.write("                        <td><input type=\"text\" name=\"fullname\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Birthday: &nbsp;</td>\n");
      out.write("                        <td><input type=\"text\" name=\"birthday\">&nbsp;yyyy/mm/dd</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Email: &nbsp;</td>\n");
      out.write("                        <td><input type=\"email\" name=\"email\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Address: &nbsp;</td>\n");
      out.write("                        <td><input type=\"textarea\" name=\"address\" rows=\"5\" cols=\"20\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Phone Number: &nbsp;</td>\n");
      out.write("                        <td><input type=\"text\" name=\"phonenumber\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type=\"submit\" name=\"register\" value=\"Đăng ký\"/></td>\n");
      out.write("                        <td><input type=\"reset\" name=\"reset\" value=\"Xóa\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("            </form>\n");
      out.write("                                    \n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"bottom-content-box\"></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"right-content\">\n");
      out.write("\t\t\t<div class=\"right-content-box\">\n");
      out.write("\t\t\t\t<div class=\"top-right-content-box\">Tìm kiếm</div>\n");
      out.write("\t\t\t\t<div class=\"middle-right-content-box\">\n");
      out.write("                                    <form name=\"searchfood\" action=\"SearchFoodServlet\" method=\"post\">\n");
      out.write("                                        <table>\n");
      out.write("                                            <tr><td><input type=\"text\" name=\"searchkey\" value=\"Tìm tên món ăn\"></td></tr>\n");
      out.write("                                            <tr><td><input type=\"submit\" name=\"btnsearch\" value=\"Tìm kiếm\"></td></tr>\n");
      out.write("                                        </table>\n");
      out.write("                                    </form>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"bottom-right-content-box\"></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"right-content-box\">\n");
      out.write("\t\t\t\t<div class=\"top-right-content-box\">Món ăn mới</div>\n");
      out.write("\t\t\t\t<div class=\"middle-right-content-box\">\n");
      out.write("                                    <table>\n");
      out.write("           ");

                    
                    Hashtable newfoods = foodDAO.selectNewFood();
                    Enumeration enumnewfoods = newfoods.elements();
                    while(enumnewfoods.hasMoreElements()){
                         Food food = (Food)enumnewfoods.nextElement();

      out.write("\n");
      out.write("                        <tr><td><a href=\"fooddetail.jsp?foodid=");
      out.print(food.getId());
      out.write("\">\n");
      out.write("                                <img src=\"images_data/");
      out.print(food.getImage() );
      out.write("\" width=\"150\" height=\"100\"/>\n");
      out.write("                        </a></td></tr>\n");
      out.write("                    ");
 } 
      out.write("\n");
      out.write("                                    </table>\n");
      out.write("                                </div>\n");
      out.write("\t\t\t\t<div class=\"bottom-right-content-box\"></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("        </div>\n");
      out.write("\t</div>\n");
      out.write("                       \n");
      out.write("\t\n");
      out.write("\t\t<div class=\"foot_ke\"></div>\n");
      out.write("\t</div>\n");
      out.write("    </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
