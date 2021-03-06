<%-- 
    Document   : index
   
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*, com.my.bean.*, com.my.dao.*" %>
<%
    Customer cus = (Customer)session.getAttribute("customer");
    ProductDAO productDAO = new ProductDAO();                
    CategoryDAO catDAO = new CategoryDAO();
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="style.css" rel="stylesheet" type="text/css" />
        <title>JSP Page</title>
        <script type="text/javascript" src="js/jquery-1.10.2.min.js"></script>
    </head>
    <body>
        <div align="center" id="main">
            <div align="center" id="container">
            <%@include file="includes/top_menu.jsp" %>
	<div id="wrapper">
		<div class="left-content">
			<div class="left-content-box">
				<div class="top-left-content-box">Danh mục</div>
				<div class="menu-middle-left-content-box">
                                    <table>
           <%
                    
                    Hashtable cats = catDAO.selectAll();
                    Enumeration enumcats = cats.elements();
                    while(enumcats.hasMoreElements()){
                         Category cat = (Category)enumcats.nextElement();
%>
                            <tr><td><a href="categoryproduct.jsp?catID=<%=cat.getId()%>"><%=cat.getName()%></a></td></tr>
                    <% } %>
                                    </table>
                                </div>
				<div class="bottom-left-content-box"></div>
			</div>
			<div class="left-content-box">
                            <%@include file="includes/menu_today.jsp" %>
		<div align="center" class="content">
			<div class="content-box">
				<div class="top-content-box"><div class="top-content-box-icon"></div>Sống phong cách!</div>
				<div class="middle-content-box">
                    
				</div>
				<div class="bottom-content-box"></div>
			</div>
		</div>
		<div class="right-content">
			<div class="right-content-box">
				<%@include file="includes/search_box.jsp" %>
			</div>
			
                                    <table>
           <%
                    
                    Hashtable newproducts = productDAO.selectNewFood();
                    Enumeration enumnewproducts = newproducts.elements();
                    while(enumnewproducts.hasMoreElements()){
                         Product product = (Product)enumnewproducts.nextElement();
%>
                        <tr><td><a href="productdetail.jsp?productid=<%=product.getId()%>">
                                    <img src="images_data/thoitrangbegai_thumb/<%=product.getImage() %>" width="150" height="100"/>
                        </a></td></tr>
                    <% } %>
                                    </table>
                                </div>
				<div class="bottom-right-content-box"></div>
			</div>
        </div>
	</div>
	<div id="footer">
		<div class="foot_ke"></div>
		<div class="foot_left">
			<strong style="margin-left:20px; font-weight:bold">Copyright 2017 ©  </strong><br>

			<span class="chu_tieude">Địa chỉ :  30 Hưng lợi – Ninh Kiều – Tp.Cần Thơ </span><br>

			<span class="chu_tieude">Điện thoại : 012345678 </span><br>

			
		

		

		<div class="foot_ke"></div>
	</div>
    </div>
    </body>
</html>
