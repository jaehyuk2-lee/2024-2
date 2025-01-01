/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.95
 * Generated at: 2024-12-15 16:45:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Calendar;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(2);
    _jspx_imports_classes.add("java.util.Calendar");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');

    response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate, max-age=0");
    response.setHeader("Pragma", "no-cache");
    response.setDateHeader("Expires", 0);

    if (session.getAttribute("email") == null) {
        response.sendRedirect("SignIn.jsp");
        return;
    }

    int year = 0;
    int month = 0;

    if (request.getParameter("year") == null || request.getParameter("month") == null) {
        Calendar today = Calendar.getInstance();
        year = today.get(Calendar.YEAR);
        month = today.get(Calendar.MONTH);
    } else {
        year = Integer.parseInt(request.getParameter("year"));
        month = Integer.parseInt(request.getParameter("month"));

        if (month == -1) {
            month = 11;
            year -= 1;
        }
        if (month == 12) {
            month = 0;
            year += 1;
        }
    }

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <link rel=\"icon\" href=\"./images/Logo.png\">\n");
      out.write("    <title>Life Log</title>\n");
      out.write("    <script>\n");
      out.write("    document.addEventListener(\"DOMContentLoaded\", function () {\n");
      out.write("        fetchDiaries();\n");
      out.write("\n");
      out.write("        function fetchDiaries() {\n");
      out.write("            fetch('loadDiaries.jsp')\n");
      out.write("                .then(response => response.json())\n");
      out.write("                .then(data => {\n");
      out.write("                    if (data.status === \"success\") {\n");
      out.write("                        renderDiaries(data.diaries);\n");
      out.write("                    } else {\n");
      out.write("                        console.error(\"Failed to fetch diaries:\", data.message);\n");
      out.write("                    }\n");
      out.write("                })\n");
      out.write("                .catch(error => {\n");
      out.write("                    console.error(\"Error fetching diaries:\", error);\n");
      out.write("                });\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function renderDiaries(diaries) {\n");
      out.write("            const diaryContainer = document.getElementById(\"diaryEntries\");\n");
      out.write("            if (!diaries || diaries.length === 0) {\n");
      out.write("                diaryContainer.innerHTML = \"<p>작성된 일기가 없습니다.</p>\";\n");
      out.write("                return;\n");
      out.write("            }\n");
      out.write("            diaryContainer.innerHTML = \"\";\n");
      out.write("            diaries.forEach(diary => {\n");
      out.write("            	var content = diary.diary_content;\n");
      out.write("            	var date = diary.date_written;\n");
      out.write("                const diaryElement = document.createElement(\"div\");\n");
      out.write("                diaryElement.className = \"diary-entry\";\n");
      out.write("                diaryElement.innerHTML =\n");
      out.write("                    '<div class=\"diary-entry-date\">' + date + '</div>' +\n");
      out.write("                    '<div class=\"diary-entry-content\">' + content + '</div>';\n");
      out.write("                diaryContainer.appendChild(diaryElement);\n");
      out.write("            });\n");
      out.write("        }\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            background-color: #1e1e1e;\n");
      out.write("            color: white;\n");
      out.write("            display: flex;\n");
      out.write("       	 	margin: 0;\n");
      out.write("       	 	padding: 0;\n");
      out.write("        	box-sizing: border-box;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .container {\n");
      out.write("        	display:flex;\n");
      out.write("        	height:100vh;\n");
      out.write("      	}\n");
      out.write("\n");
      out.write("		.menu-bar {\n");
      out.write("			width : 200px;\n");
      out.write("        	background-color: #274a8f;\n");
      out.write("        	display: flex;\n");
      out.write("        	flex-direction: column;\n");
      out.write("        	align-items: center;\n");
      out.write("        	padding: 20px 10px;\n");
      out.write("        	gap: 20px;\n");
      out.write("		}\n");
      out.write("\n");
      out.write("      	.menu-item {\n");
      out.write("        	display: flex;\n");
      out.write("        	align-items: center;\n");
      out.write("        	justify-content: center;\n");
      out.write("        	padding: 15px;\n");
      out.write("        	width: 80%;\n");
      out.write("        	color: white;\n");
      out.write("        	text-align: center;\n");
      out.write("        	background-color: #274a8f;\n");
      out.write("        	border-radius: 5px;\n");
      out.write("        	cursor: pointer;\n");
      out.write("        	transition: background-color 0.3s ease;\n");
      out.write("      	}\n");
      out.write("\n");
      out.write("      	.menu-item:hover,\n");
      out.write("      	.menu-item.active {\n");
      out.write("        	background-color: #007bff;\n");
      out.write("      	}\n");
      out.write("      	\n");
      out.write("      	.place-bottom{\n");
      out.write("      		bottom: 12px;\n");
      out.write("      		width: 160px;\n");
      out.write("      		position: absolute;\n");
      out.write("      	}\n");
      out.write("      	\n");
      out.write("      	.logo-container {\n");
      out.write("  			display: flex;\n");
      out.write("  			align-items: center;\n");
      out.write("  			gap: 10px;\n");
      out.write("  			margin-bottom: 20px;\n");
      out.write("  		}\n");
      out.write("\n");
      out.write("\n");
      out.write("		.logo {\n");
      out.write("  		    height: 50px;\n");
      out.write("  			width: auto;\n");
      out.write("  			}\n");
      out.write("\n");
      out.write("		.logo-text {\n");
      out.write("  			font-size: 24px;\n");
      out.write("  			font-weight: bold;\n");
      out.write("  			color: white;\n");
      out.write("		}\n");
      out.write("\n");
      out.write("        .calendar-container {\n");
      out.write("            flex:1;\n");
      out.write("            margin: 100px 10px 10px;\n");
      out.write("            background-color: #274a8f;\n");
      out.write("            border-radius: 10px;\n");
      out.write("           	height: 610px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .calendar-header {\n");
      out.write("            text-align: center;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .calendar-header a {\n");
      out.write("            color: white;\n");
      out.write("            text-decoration: none;\n");
      out.write("            margin: 0 10px;\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .side {\n");
      out.write("            flex: 0.5;\n");
      out.write("            background-color: #1e1e1e;\n");
      out.write("            display: flex;\n");
      out.write("            flex-direction: column;\n");
      out.write("            justify-content: center;\n");
      out.write("            align-items: center;\n");
      out.write("            padding: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .profile {\n");
      out.write("        	position:absolute;\n");
      out.write("        	top:30px;\n");
      out.write("        	right:50px;\n");
      out.write("            display: flex;\n");
      out.write("            align-items: center;\n");
      out.write("            gap: 15px;\n");
      out.write("            margin-bottom: 30px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .profile img {\n");
      out.write("            width: 50px;\n");
      out.write("            height: 50px;\n");
      out.write("            border-radius: 50%;\n");
      out.write("            border: 2px solid #007bff;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .profile .name {\n");
      out.write("            font-size: 20px;\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("		\n");
      out.write("		.side{\n");
      out.write("			margin-top:50px;\n");
      out.write("			padding:0px;\n");
      out.write("		}\n");
      out.write("        .summary {\n");
      out.write("        	width:420px;\n");
      out.write("            background-color: #274a8f;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            text-align: center;\n");
      out.write("            height:350px;\n");
      out.write("        }\n");
      out.write("        .diary{\n");
      out.write("        	margin-top:10px;\n");
      out.write("        	background-color: #274a8f;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            text-align: center;\n");
      out.write("            width:420px;\n");
      out.write("            height:250px;\n");
      out.write("        }\n");
      out.write("        .diary-entries-container {\n");
      out.write("        	display: flex;\n");
      out.write("        	gap: 10px;\n");
      out.write("        	overflow-x: auto;\n");
      out.write("        	padding: 10px;\n");
      out.write("    	}\n");
      out.write("\n");
      out.write("    	.diary-entry {\n");
      out.write("    		color: black;\n");
      out.write("        	background-color: white;\n");
      out.write("        	border: 1px solid #007bff;\n");
      out.write("        	border-radius: 8px;\n");
      out.write("        	padding: 10px;\n");
      out.write("        	width: 200px;\n");
      out.write("        	height: 100px;\n");
      out.write("        	flex-shrink: 0;\n");
      out.write("        	word-wrap: break-word;\n");
      out.write("    	}\n");
      out.write("\n");
      out.write("    	.diary-entry-date {\n");
      out.write("        	font-weight: bold;\n");
      out.write("        	margin-bottom: 8px;\n");
      out.write("    	}\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("	<div class=\"container\">\n");
      out.write("      <div class=\"menu-bar\">\n");
      out.write("      	<div class=\"logo-container\"  onclick=\"location.href='main.jsp'\">\n");
      out.write("  			<img src=\"./images/Logo.png\" alt=\"Logo\" class=\"logo\" />\n");
      out.write("  			<div class=\"logo-text\">Life Log</div>\n");
      out.write("		</div>\n");
      out.write("        <div class=\"menu-item active\" data-page=\"main\" onclick=\"location.href='main.jsp'\">메인</div>\n");
      out.write("        <div class=\"menu-item\" data-page=\"log-analysis\" onclick=\"location.href='log_analyze.jsp'\">로그 분석</div>\n");
      out.write("        <div class=\"menu-item\" data-page=\"log-record\" onclick=\"location.href='goal_set.jsp'\">로그 기록</div>\n");
      out.write("        <div class=\"menu-item\" data-page=\"diary\" onclick=\"location.href='diary.jsp'\">일기</div>\n");
      out.write("        <div class=\"menu-item place-bottom\" onclick=\"location.href='SignOut.jsp'\">로그아웃</div>\n");
      out.write("      </div>\n");
      out.write("    	<div class=\"calendar-container\">\n");
      out.write("        <div class=\"calendar-header\">\n");
      out.write("        	<h3>캘린더</h3>\n");
      out.write("            <a href=\"main.jsp?year=");
      out.print( (month == 0 ? year - 1 : year) );
      out.write("&month=");
      out.print( (month + 11) % 12 );
      out.write("\">◀</a>\n");
      out.write("			<span>");
      out.print( year );
      out.write('년');
      out.write(' ');
      out.print( month + 1 );
      out.write("월</span>\n");
      out.write("			<a href=\"main.jsp?year=");
      out.print( (month == 11 ? year + 1 : year) );
      out.write("&month=");
      out.print( (month + 1) % 12 );
      out.write("\">▶</a>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "calendar.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("year", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf( year ), request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("month", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf( month ), request.getCharacterEncoding()), out, false);
      out.write("\n");
      out.write("    	</div>\n");
      out.write("    	\n");
      out.write("    	<div class=\"side\">\n");
      out.write("    		<div class=\"summary\">\n");
      out.write("    		<h3>주간 달성률 분석</h3>\n");
      out.write("    		");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "weekly.jsp", out, false);
      out.write("\n");
      out.write("    		</div>\n");
      out.write("    		\n");
      out.write("    		<div class=\"diary\">\n");
      out.write("    			<h3>일기</h3>\n");
      out.write("    			<div id=\"diaryEntries\" class=\"diary-entries-container\">\n");
      out.write("    			</div>\n");
      out.write("			</div>\n");
      out.write("\n");
      out.write("    	</div>\n");
      out.write("    	</div>\n");
      out.write("   <div class=\"profile\" onclick=\"location.href='profile.jsp'\">\n");
      out.write("            <div class=\"name\">");
      out.print(session.getAttribute("name").toString());
      out.write("</div>\n");
      out.write("    		<img src=\"./images/profile-icon.png\" alt=\"User Icon\" />\n");
      out.write("       	</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
