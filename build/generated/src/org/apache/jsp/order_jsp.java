package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.my.bean.*;
import com.my.dao.*;

public final class order_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/admin_includes/admin_header.jsp");
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
    if(message==null)   message="";
    OrderDAO orderDAO = new OrderDAO();
    Hashtable orders = orderDAO.selectAllOrder();
    Enumeration enumorders = orders.elements();
    Hashtable productOrders = new Hashtable();
    Enumeration enumfos = productOrders.elements();
        
    String delorderID = (String)request.getParameter("delorderid");
    String orderID = (String)request.getParameter("orderid");
    if(delorderID!=null){
       if( orderDAO.deleteOrder(delorderID)) message = "Delete completed!";
        else message = "Failed ! Try again";
    }
    if(orderID!=null){
        productOrders = orderDAO.selectOrderDetailByOrderID(orderID);
        enumfos = productOrders.elements();
    }

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
      out.write("\t<div id=\"wrapper\">\n");
      out.write("\t\t<div class=\"admin-left-content\">\n");
      out.write("\t\t\t<div class=\"admin-left-content-box\">\n");
      out.write("\t\t\t\t<div class=\"admin-top-left-content-box\">Thông tin đơn hàng</div>\n");
      out.write("\t\t\t\t<div class=\"admin-middle-left-content-box\">\n");
      out.write("                      ");
 if(orderID!=null) {  
      out.write("\n");
      out.write("               <table width=\"380\">\n");
      out.write("                   <tr class=\"admin_table_header\">\n");
      out.write("                        <td>ID</td>\n");
      out.write("                        <td>Mã sản phẩm</td>\n");
      out.write("                        <td>Số lượng</td>\n");
      out.write("                        <td>Đơn giá (VNĐ)</td>\n");
      out.write("                        <td>Tổng tiền (VNĐ)</td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");

                        while(enumfos.hasMoreElements()) {
                            ProductOrder fo = (ProductOrder)enumfos.nextElement();
                    
      out.write("\n");
      out.write("                    <tr class=\"tr_hover\">\n");
      out.write("                        <td> ");
      out.print(fo.getFoID() );
      out.write(" </td>\n");
      out.write("                        <td> ");
      out.print(fo.getId() );
      out.write(" </td>\n");
      out.write("                        <td> ");
      out.print(fo.getQuantity() );
      out.write(" </td>\n");
      out.write("                        <td> ");
      out.print(fo.getPriceToString() );
      out.write(" </td>\n");
      out.write("                        <td> ");
      out.print(fo.getTotalPriceToString() );
      out.write(" </td>\n");
      out.write("                    </tr>\n");
      out.write("      ");

    }

      out.write("\n");
      out.write("                </table>\n");
      out.write("                      ");
 } 
      out.write("\n");
      out.write("                                </div>\n");
      out.write("\t\t\t\t<div class=\"admin-bottom-left-content-box\"></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("                </div>\n");
      out.write("\t\t<div align=\"center\" class=\"content\">\n");
      out.write("                    \n");
      out.write("\t\t\t<div class=\"content-box\">\n");
      out.write("\t\t\t\t<div class=\"top-content-box\"><div class=\"top-content-box-icon\"></div>Danh sách Đơn hàng</div>\n");
      out.write("\t\t\t\t<div class=\"middle-content-box\">\n");
      out.write("                <table class=\"admin_table\" border=\"1\" cellspacing=\"2\">\n");
      out.write("                    <tr class=\"admin_table_header\">\n");
      out.write("                        <td>ID</td>\n");
      out.write("                        <td>Mã khách hàng</td>\n");
      out.write("                        <td>Ngày đặt hàng</td>\n");
      out.write("                        <td>Tổng tiền (VNĐ)</td>\n");
      out.write("                        <td>Chi tiết</td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");

                        while(enumorders.hasMoreElements()) {
                            OrderCart cart = (OrderCart)enumorders.nextElement();
                    
      out.write("\n");
      out.write("                    <tr class=\"tr_hover\">\n");
      out.write("                        <td> ");
      out.print(cart.getId() );
      out.write(" </td>\n");
      out.write("                        <td> ");
      out.print(cart.getCustomer().getId() );
      out.write(" </td>\n");
      out.write("                        <td> ");
      out.print(cart.getShiptimeString() );
      out.write(" </td>\n");
      out.write("                        <td> ");
      out.print(cart.getTotalpriceToString() );
      out.write(" </td>\n");
      out.write("                        <td>\n");
      out.write("                            <a title=\"Xem chi tiết\" href=\"order.jsp?orderid=");
      out.print(cart.getId() );
      out.write("\"><img src=\"images/icon/Actions-view-pim-tasks-icon.png\"/></a>\n");
      out.write("                            <a title=\"Xóa bản ghi\" href=\"order.jsp?delorderid=");
      out.print(cart.getId());
      out.write("\"><img src=\"images/icon/Delete.png\" alt=\"Delete\"/></a>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("      ");

    }

      out.write("\n");
      out.write("                </table>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"bottom-content-box\"></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t</div>\n");
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
      out.write('\n');
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
