package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.my.bean.*;
import com.my.dao.*;

public final class product_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    String message = (String)request.getAttribute("message");
    String productID = (String)request.getParameter("productid");
    String npage = (String)request.getParameter("page");
    int pagenumb = 1;
    
    if(message==null)   message="";
    if(productID!=null)     session.setAttribute("productid", productID);
    if(npage!=null)     pagenumb = Integer.parseInt(npage);
    
    ProductDAO productDAO = new ProductDAO();
     
    String delproductID = request.getParameter("delproductid");
    if(delproductID!=null){
        if(productDAO.deleteFood(delproductID))
            message = "Delete completed!";
        else message = "Failed ! Try again";
    }
        
    Hashtable products = productDAO.selectAll();
    Enumeration enumproducts = products.elements();
    
    CategoryDAO catDAO = new CategoryDAO();
    Hashtable cats = catDAO.selectAll();
    Enumeration enumcats = cats.elements();
        
    Product editproduct = null;
    if(productID!=null) {
        editproduct = (Product)products.get(productID);
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
      out.write("<script src=\"tinymce/tinymce.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\ttinymce.init({\n");
      out.write("    fontsize_formats: \"8pt 9pt 10pt 11pt 12pt 26pt 36pt\",\n");
      out.write("         \n");
      out.write("    selector: \"textarea\",\n");
      out.write("    theme: \"modern\",\n");
      out.write("    width: 350,\n");
      out.write("    height: 300,\n");
      out.write("    plugins: [\n");
      out.write("         \"advlist autolink link image lists charmap print preview hr anchor pagebreak spellchecker\",\n");
      out.write("         \"searchreplace wordcount visualblocks visualchars code fullscreen insertdatetime media nonbreaking\",\n");
      out.write("         \"save table contextmenu directionality emoticons template paste textcolor\"\n");
      out.write("   ],\n");
      out.write("   content_css: \"css/content.css\",\n");
      out.write("   toolbar: \"insertfile undo redo | styleselect | bold italic | alignleft aligncenter alignright alignjustify | bullist numlist outdent indent | l      ink image | print preview media fullpage | forecolor backcolor emoticons| undo redo pastetext | styleselect | fontselect | fontsizeselect\", \n");
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
      out.write("    <script type=\"text/javascript\">\n");
      out.write("    function confirm_decision(prod_id){\n");
      out.write("    if(confirm(\"you want to delete the user?\")) // this will pop up confirmation box and if yes is clicked it call servlet else return to page\n");
      out.write("     {\n");
      out.write("       window.location=\"product.jsp?delproductid=\"+prod_id;\n");
      out.write("     }else{\n");
      out.write("       return false;\n");
      out.write("    }\n");
      out.write(" }\n");
      out.write("    \n");
      out.write("</script>\n");
      out.write("  \n");
      out.write(" <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function(){\n");
      out.write("                checkAndUncheck();\n");
      out.write("            });\n");
      out.write("            function checkAndUncheck(){\n");
      out.write("                var checked=$(this).attr(\"checked\");\n");
      out.write("                if(!checked) checked=\"\";\n");
      out.write("                $(\".admin_table.admin_table_header td input:checkbox\").attr(\"checked\",checked);\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("\t<div id=\"wrapper\">\n");
      out.write("\t\t<div class=\"admin-left-content\">\n");
      out.write("\t\t\t<div class=\"admin-left-content-box\">\n");
      out.write("\t\t\t\t<div class=\"admin-top-left-content-box\">Thông tin sản phẩm</div>\n");
      out.write("\t\t\t\t<div class=\"admin-middle-left-content-box\">\n");
      out.write("              <form action=\"UpdateProductServlet\" name=\"addproduct\" method=\"post\">\n");
      out.write("                  <table >\n");
      out.write("                        ");
 if(productID!=null) { 
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Product ID: &nbsp;</td>\n");
      out.write("                            <td><b>");
      out.print(productID );
      out.write("</b></td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");
 } 
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Category: &nbsp;</td>\n");
      out.write("                            <td>\n");
      out.write("                                <select name=\"catselect\" class=\"textfield\">\n");
      out.write("                ");

                                    while(enumcats.hasMoreElements()) {
                                        Category cat = (Category)enumcats.nextElement();
                                        out.print("<option value='" + cat.getId() + "'");
                                        if(productID!=null && editproduct.getCatID().equals(cat.getId())) out.print(" selected");
                                        out.println(">" + cat.getName() + "</option>");
                                    }
                
      out.write("\n");
      out.write("                                </select>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Tên: &nbsp;</td>\n");
      out.write("                            <td><input required=\"true\" class=\"textfield\" type=\"text\" name=\"productname\" value=\"");
 if(productID!=null) out.print(editproduct.getName()); 
      out.write("\"/></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Mô tả: &nbsp;</td>\n");
      out.write("                            <td><input class=\"textfield\" type=\"textarea\" name=\"productdes\" rows=\"3\" cols=\"40\" value=\"");
 if(productID!=null) out.print(editproduct.getDescribes()); 
      out.write("\"/></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Đơn giá: &nbsp;</td>\n");
      out.write("                            <td><input required=\"true\" class=\"textfield\" type=\"number\" name=\"productprice\" value=\"");
 if(productID!=null) out.print(editproduct.getPrice()); 
      out.write("\"/>,000 VNĐ</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Số lượng: &nbsp;</td>\n");
      out.write("                            <td><input required=\"true\" class=\"textfield\" type=\"number\" name=\"prodQuantity\" value=\"");
 if(productID!=null) out.print(editproduct.getQuantity()); 
      out.write("\"/> cái</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Hình ảnh: &nbsp;</td>\n");
      out.write("                            <td>\n");
      out.write("                                <input class=\"textfield\" type=\"text\" name=\"productimage\" id=\"filename\" value=\"");
 if(productID!=null) out.print(editproduct.getImage()); 
      out.write("\"/>\n");
      out.write("                                <input type=\"file\" accept=\"image\" name=\"imagefile\" onchange=\"updateFilename(this.value)\"/>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            \n");
      out.write("                            <td colspan=\"2\">\n");
      out.write("                                <textarea class=\"textview\" name=\"prodArticle\" placeholder=\"Nhập nội dung bài viết ở đây\">");
if(productID!=null) out.print(editproduct.getArticle());
      out.write("</textarea>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        \n");
      out.write("                        <tr>\n");
      out.write("           ");
 
                                if(productID!=null) {
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
      out.write("                    <div class=\"message\">\n");
      out.write("                        <p>");
      out.print(message );
      out.write("</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\t\t<div align=\"center\" class=\"content\">\n");
      out.write("                    \n");
      out.write("\t\t\t<div class=\"content-box\">\n");
      out.write("\t\t\t\t<div class=\"top-content-box\"><div class=\"top-content-box-icon\"></div>Danh sách sản phẩm</div>\n");
      out.write("\t\t\t\t<div class=\"middle-content-box\">\n");
      out.write("                <table class=\"admin_table\" border=\"1\" cellspacing=\"2\">\n");
      out.write("                    <tr class=\"admin_table_header\">\n");
      out.write("                        <td><input type=\"checkbox\" name=\"check_all\" id=\"checkAll\" title=\"select all\"/></td>\n");
      out.write("                        <td>ID</td>\n");
      out.write("                        <td>Tên</td>\n");
      out.write("                        <td>Category</td>\n");
      out.write("                        <td>Mô tả</td>\n");
      out.write("                        <td>Giá(VNĐ)</td>\n");
      out.write("                        <td>Hình ảnh</td>\n");
      out.write("                        <td>Số lượng</td>\n");
      out.write("                        <td>Chức năng</td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    <!--phan trang-->\n");
      out.write("                    ");

                        for(int i=1;i<=(pagenumb-1)*5;i++){
                            enumproducts.nextElement();
                        }
                        int productcount=0;
                        while(enumproducts.hasMoreElements() && productcount<5) {
                            Product product = (Product)enumproducts.nextElement();
                            Category cat = (Category)cats.get(product.getCatID());
                    
      out.write("\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    <tr class=\"tr_hover\">\n");
      out.write("                        <td><input type=\"checkbox\" name=\"check[]\" id=\"check[]\"/></td>\n");
      out.write("                        <td> ");
      out.print(product.getId() );
      out.write("</td>\n");
      out.write("                        <td> ");
      out.print(product.getName() );
      out.write(" </td>\n");
      out.write("                        <td> ");
      out.print(cat.getName() );
      out.write(" </td>\n");
      out.write("                        <td> ");
      out.print(product.getDescribes() );
      out.write(" </td>\n");
      out.write("                        <td> ");
      out.print(product.getPriceToString() );
      out.write(" </td>\n");
      out.write("                        <td><img src=\"images_data/thoitrangbegai_thumb/");
      out.print(product.getImage() );
      out.write("\" height=\"100\" width=\"100\"/></td>\n");
      out.write("                        <td>");
      out.print(product.getQuantity());
      out.write("</td>\n");
      out.write("                        <td>\n");
      out.write("                            <a href=\"product.jsp?productid=");
      out.print(product.getId() );
      out.write("\" title=\"chỉnh sửa\"><img src=\"images/icon/Modify.png\" alt=\"Edit\"/></a>&nbsp;\n");
      out.write("                            <a onclick=\"confirm_decision('");
      out.print(product.getId() );
      out.write("');\" title=\"xóa bản ghi\"><img src=\"images/icon/Delete.png\" alt=\"Delete\"/></a>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("      ");

                            productcount++;
                            
                }    

      out.write("\n");
      out.write("                ");
 if(products.size()>5){  
      out.write("\n");
      out.write("                <p>\n");
      out.write("                    <a style=\"border-radius: 2px;text-decoration: none;background-color: #dccfc6\" href=\"");
 if(pagenumb>1) out.print("product.jsp?page=" + (pagenumb-1));
      out.write("\">Trang trước</a>&nbsp;\n");
      out.write("                    ");
 for(int i=1;i<=products.size()/6+1;i++) { 
      out.write("\n");
      out.write("                            <a style=\"border-radius: 2px;text-decoration: none;background-color: #dccfc6;\" href=\"");
 if (pagenumb!=i) out.print("product.jsp?page=" + i);
      out.write("\">\n");
      out.write("                                ");
 if(pagenumb==i) out.print("<strong>"+i+"</strong>");
                                       else out.print(i);
                                
      out.write("\n");
      out.write("                            </a>&nbsp;\n");
      out.write("                        ");
 } 
      out.write("\n");
      out.write("                    <a style=\"border-radius: 2px;text-decoration: none;background-color: #dccfc6\" href=\"");
 if(pagenumb<products.size()/10+1) out.print("product.jsp?page=" + (pagenumb+1));
      out.write("\">Trang sau</a>&nbsp;\n");
      out.write("                </p>\n");
      out.write("                ");
 } 
      out.write("\n");
      out.write("                </table>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"bottom-content-box\"></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t</div>\n");
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
