package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.my.bean.*;
import com.my.dao.*;
import java.util.Enumeration;
import java.util.Hashtable;
import com.my.bean.Category;
import com.my.dao.CategoryDAO;

public final class productdetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/includes/sidebar_left.jsp");
    _jspx_dependants.add("/includes/menu_today.jsp");
    _jspx_dependants.add("/includes/search_box.jsp");
    _jspx_dependants.add("/includes/footer.jsp");
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
    if(message==null)   message = "";
    String productID = (String)request.getParameter("productid");
    OrderCart cart = (OrderCart)session.getAttribute("ordercart");
    
    ProductDAO productDAO = new ProductDAO();                
    CategoryDAO catDAO = new CategoryDAO();
        
    Product productview = productDAO.selectByID(productID);
    session.setAttribute("product", productview);
    Category catview = catDAO.selectCategoryByID(productview.getCatID());

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <!-- Include jQuery. -->\n");
      out.write("        <script type=\"text/javascript\" src=\"http://itstudent.net/images/html/js/jquery-1.8.2.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Include Cloud Zoom CSS. -->\n");
      out.write("       <link rel=\"stylesheet\" type=\"text/css\" href=\"http://itstudent.net/images/html/css/cloudzoom.css\" />\n");
      out.write("\n");
      out.write("        <!-- Include Cloud Zoom script. -->\n");
      out.write("       <script type=\"text/javascript\" src=\"http://itstudent.net/images/html/js/cloudzoom.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Call quick start function. -->\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery-1.10.2.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery-ui.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/jquery-ui.css\" type=\"text/css\"/>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            CloudZoom.quickStart();\n");
      out.write("        </script> \n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery-1.10.2.min.js\"></script>\n");
      out.write("        <style >\n");
      out.write("#top{\n");
      out.write("\t\twidth:50px;\n");
      out.write("\t\theight:50px;\n");
      out.write("\t\tposition:fixed;/*giu co dinh*/\n");
      out.write("\t\ttext-indent:-9999px;\n");
      out.write("\t\tcursor:pointer;/*tao bieu tuong cho biet co the tac dong*/\n");
      out.write("\t\tbackground: url(images/icon/top.png) no-repeat 0 0;\n");
      out.write("\t\tbottom:10px; right:10px;\n");
      out.write("\t}\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("\t$(document).ready(function(){\n");
      out.write("\t\t$('#main').append('<div id=\"top\" title=\"Trở về đầu trang\">back to top</div>');\n");
      out.write("\t\t$(window).scroll(function(){\n");
      out.write("\t\t\tif($(window).scrollTop() !==0){\n");
      out.write("\t\t\t\t$('#top').fadeIn();\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\telse $('#top').fadeOut();\n");
      out.write("\t\t});\n");
      out.write("\t\t$('#top').click(function(){\n");
      out.write("\t\t\t$('html, body').animate({scrollTop:0},500);\n");
      out.write("\t\t});\n");
      out.write("\t});\n");
      out.write("</script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"fb-root\"></div>\n");
      out.write("<script>(function(d, s, id) {\n");
      out.write("  var js, fjs = d.getElementsByTagName(s)[0];\n");
      out.write("  if (d.getElementById(id)) return;\n");
      out.write("  js = d.createElement(s); js.id = id;\n");
      out.write("  js.src = \"//connect.facebook.net/vi_VN/sdk.js#xfbml=1&appId=266459763505486&version=v2.0\";\n");
      out.write("  fjs.parentNode.insertBefore(js, fjs);\n");
      out.write("}(document, 'script', 'facebook-jssdk'));</script>\n");
      out.write("        \n");
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
      out.write("                         <li><a href=\"login.jsp?log=out\">Đăng xuất</a></li>\n");
      out.write("                ");
 } 
      out.write("\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\t<div id=\"wrapper\">\n");
      out.write("\t\t<div class=\"left-content\">\n");
      out.write("                    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"left-content-box\">\n");
      out.write("\t\t\t\t<div class=\"top-left-content-box\">Danh mục</div>\n");
      out.write("\t\t\t\t<div class=\"menu-middle-left-content-box\">\n");
      out.write("                                    <table>\n");
      out.write("           ");

                    
                    Hashtable cats = catDAO.selectAll();
                    Enumeration enumcats = cats.elements();
                    while(enumcats.hasMoreElements()){
                         Category cat = (Category)enumcats.nextElement();

      out.write("\n");
      out.write("                            <tr><td><a href=\"categoryproduct.jsp?catID=");
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
      out.write("\n");
      out.write("                    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"css/tinycarousel.css\" type=\"text/css\">\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.tinycarousel.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    $(document).ready(function ()\n");
      out.write("    {\n");
      out.write("        $('#slider1').tinycarousel({interval: true});\n");
      out.write("        var slider1 = $(\"#slider1\").data(\"plugin_tinycarousel\");\n");
      out.write("        slider1.start();\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <!--<a class=\"buttons next\" href=\"#\">&#62;</a>-->\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<div class=\"bottom-left-content-box\"></div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("        \n");
      out.write("\t\t<div align=\"center\" class=\"content\">\n");
      out.write("                    <div class=\"message\">\n");
      out.write("                        <p>");
      out.print(message );
      out.write("</p>\n");
      out.write("                    </div>\n");
      out.write("\t\t\t<div class=\"content-box\">\n");
      out.write("\t\t\t\t<div class=\"top-content-box\"><div class=\"top-content-box-icon\"></div>Chi tiết sản phẩm</div>\n");
      out.write("\t\t\t\t<div class=\"middle-content-box\">\n");
      out.write("                    \n");
      out.write("            <div id=\"show_image\">  \n");
      out.write("                                    <!-- class cloud-zoom phải có , các tùy chỉnh đều nằm trong thẻ rel -->\n");
      out.write("                                    <img style=\"border:2px solid #999;\" class = \"cloudzoom\" src = \"images_data/thoitrangbegai_thumb/");
      out.print(productview.getImage());
      out.write("\"\n");
      out.write("                                         data-cloudzoom = \"zoomImage: 'images_data/thoitrangbegai_full/");
      out.print(productview.getImage());
      out.write("'\" width=\"200\" height=\"230\" />\n");
      out.write("                   \n");
      out.write("                                   \n");
      out.write("                                                            \n");
      out.write("                                    \n");
      out.write("                                    <div id=\"form\">  \n");
      out.write("                                        \n");
      out.write("            <form name=\"orderform\" action=\"AddOrderCartServlet\" method=\"post\">\n");
      out.write("                <table cellspacing=\"2\" class=\"productdetail\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Số lượng còn: &nbsp;</td>\n");
      out.write("                        <td><input style=\"border:none\" type=\"text\" size=\"5\" readonly=\"true\" name=\"hangcon\" value=\"");
      out.print(productview.getQuantity());
      out.write("\">SP</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Mã sản phẩm: &nbsp;</td>\n");
      out.write("                        <td><b>");
      out.print(productview.getId());
      out.write("</b></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Tên: &nbsp;</td>\n");
      out.write("                        <td><b>");
      out.print(productview.getName());
      out.write("</b></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Phân loại: &nbsp;</td>\n");
      out.write("                        <td><b>");
      out.print(catview.getName());
      out.write("</b></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Mô tả: &nbsp;</td>\n");
      out.write("                        <td><b>");
      out.print(productview.getDescribes());
      out.write("</b></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Đơn giá: &nbsp;</td>\n");
      out.write("                        <td><b>");
      out.print(productview.getPriceToString()+" VNĐ/cái");
      out.write("</b></td>\n");
      out.write("                    </tr><br><br>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><b>Đặt hàng</b></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Số lượng: &nbsp;</td>\n");
      out.write("                        <td><input type=\"number\" name=\"quantity\" size=\"2\" style=\"width:30px;\" value=\"1\"/>&nbsp; cái</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><input class=\"btn_active\" type=\"submit\" name=\"submitorder\" value=\"Thêm vào giỏ hàng\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                            \n");
      out.write("                     \n");
      out.write("                </table>\n");
      out.write("            </form>\n");
      out.write("                                   \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("\t\t\t\t<div class=\"bottom-content-box\">\n");
      out.write("                                    \n");
      out.write("                                </div>\n");
      out.write("                               \n");
      out.write("\t\t\t</div>\n");
      out.write("                    \n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"right-content\">\n");
      out.write("\t\t\t<div class=\"right-content-box\">\n");
      out.write("                            ");
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
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("                                    <table>\n");
      out.write("           ");

                    
                    Hashtable newproducts = productDAO.selectNewFood();
                    Enumeration enumnewproducts = newproducts.elements();
                    while(enumnewproducts.hasMoreElements()){
                         Product product = (Product)enumnewproducts.nextElement();

      out.write("\n");
      out.write("                        <tr><td><a href=\"productdetail.jsp?productid=");
      out.print(product.getId());
      out.write("\">\n");
      out.write("                                    <img src=\"images_data/thoitrangbegai_thumb/");
      out.print(product.getImage() );
      out.write("\" width=\"150\" height=\"100\"/>\n");
      out.write("                        </a></td></tr>\n");
      out.write("                    ");
 } 
      out.write("\n");
      out.write("                                    </table>\n");
      out.write("                                </div>\n");
      out.write("                                    \n");
      out.write("\t\t\t\t<div class=\"bottom-right-content-box\"></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("        </div>\n");
      out.write("                                   \n");
      out.write("\t</div>\n");
      out.write("                                    \n");
      out.write("                    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"footer\">\n");
      out.write("\t\t<div class=\"foot_ke\"></div>\n");
      out.write("\t\t<div class=\"foot_left\">\n");
      out.write("\t\t\t<strong style=\"margin-left:20px; font-weight:bold\">Copyright 2017 ©  </strong><br>\n");
      out.write("\n");
      out.write("\t\t\t<span class=\"chu_tieude\">Địa chỉ :  30 Hưng lợi – Ninh Kiều – tp.Cần Thơ </span><br>\n");
      out.write("\n");
      out.write("\t\t\t<span class=\"chu_tieude\">Điện thoại : 0123456789 </span><br>\n");
      out.write("                           \n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\n");
      out.write("\n");
      out.write("\t\t<div class=\"foot_ke\"></div>\n");
      out.write("\t</div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    </body>\n");
      out.write("    \n");
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
