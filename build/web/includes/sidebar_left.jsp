<%-- 
    Document   : sidebar_left
    Created
    
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


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
				<div class="top-left-content-box">Hỗ trợ</div>
		<div class="menu-middle-left-content-box">
                    <img src="images/icon/support.jpg" alt="hotline" width="50" height="50"/> 
                </div>
                                
				<div class="bottom-left-content-box">SDT: <b style="color: red">0916 090 900</b></div>
			</div>
                                    
			<div class="left-content-box">