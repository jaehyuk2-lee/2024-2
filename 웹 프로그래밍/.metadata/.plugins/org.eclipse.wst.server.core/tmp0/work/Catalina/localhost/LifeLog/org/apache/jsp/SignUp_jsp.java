/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.95
 * Generated at: 2024-12-15 17:02:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class SignUp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(6);
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"UTF-8\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <link rel=\"icon\" href=\"./images/Logo.png\">\n");
      out.write("    <title>Life Log</title>\n");
      out.write("    <style>\n");
      out.write("      body,\n");
      out.write("      html {\n");
      out.write("        margin: 0;\n");
      out.write("        padding: 0;\n");
      out.write("        font-family: Arial, sans-serif;\n");
      out.write("        background-color: #1e294a;\n");
      out.write("        color: white;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      .signup-container {\n");
      out.write("        display: flex;\n");
      out.write("        height: 100vh;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      .signup-left {\n");
      out.write("        flex: 1;\n");
      out.write("        background-color: #274a8f;\n");
      out.write("        display: flex;\n");
      out.write("        flex-direction: column;\n");
      out.write("        justify-content: center;\n");
      out.write("        align-items: center;\n");
      out.write("        padding: 20px;\n");
      out.write("        animation: slide-in-left1 1s cubic-bezier(0.25, 0.46, 0.45, 0.94) both;\n");
      out.write("        z-index: 1;\n");
      out.write("      }\n");
      out.write("      @keyframes slide-in-left1 {\n");
      out.write("        0% {\n");
      out.write("          transform: translateX(-200px);\n");
      out.write("        }\n");
      out.write("        100% {\n");
      out.write("          transform: translateX(0);\n");
      out.write("        }\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      .signup-left h1 {\n");
      out.write("        position: relative;\n");
      out.write("        bottom: 100px;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      .signup-form {\n");
      out.write("        width: 100%;\n");
      out.write("        max-width: 300px;\n");
      out.write("        display: flex;\n");
      out.write("        flex-direction: column;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      .signup-form label {\n");
      out.write("        margin-bottom: 5px;\n");
      out.write("        font-size: 14px;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      .signup-form input {\n");
      out.write("        margin-bottom: 15px;\n");
      out.write("        padding: 10px;\n");
      out.write("        border: none;\n");
      out.write("        border-radius: 5px;\n");
      out.write("        font-size: 14px;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      .signup-right {\n");
      out.write("        flex: 2;\n");
      out.write("        background-color: #1f305e;\n");
      out.write("        display: flex;\n");
      out.write("        flex-direction: column;\n");
      out.write("        justify-content: center;\n");
      out.write("        align-items: center;\n");
      out.write("        padding: 20px;\n");
      out.write("        opacity: 0;\n");
      out.write("        transform: translateX(100%);\n");
      out.write("        z-index: 0;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      .signup-right.slide-in-left2 {\n");
      out.write("        animation: slide-in-left2 1s cubic-bezier(0.25, 0.46, 0.45, 0.94) both;\n");
      out.write("      }\n");
      out.write("      @keyframes slide-in-left2 {\n");
      out.write("        0% {\n");
      out.write("          transform: translateX(-400px);\n");
      out.write("        }\n");
      out.write("        100% {\n");
      out.write("          transform: translateX(0);\n");
      out.write("        }\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      .signup-form-right {\n");
      out.write("        width: 100%;\n");
      out.write("        max-width: 300px;\n");
      out.write("        display: grid;\n");
      out.write("        gap: 20px;\n");
      out.write("      }\n");
      out.write("      .signup-right.visible {\n");
      out.write("        display: flex;\n");
      out.write("        opacity: 1;\n");
      out.write("        transform: translateX(0);\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      .signup-form-right .form-group {\n");
      out.write("        display: flex;\n");
      out.write("        flex-direction: column;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      .signup-form-right input,\n");
      out.write("      .signup-form-right select {\n");
      out.write("        padding: 10px;\n");
      out.write("        border: 1px solid white;\n");
      out.write("        border-radius: 5px;\n");
      out.write("        background-color: transparent;\n");
      out.write("        color: white;\n");
      out.write("        font-size: 14px;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      .signup-form-right input[type=\"date\"] {\n");
      out.write("        padding: 10px;\n");
      out.write("        border: 1px solid white;\n");
      out.write("        border-radius: 5px;\n");
      out.write("        color: white;\n");
      out.write("        font-size: 14px;\n");
      out.write("        cursor: pointer;\n");
      out.write("        appearance: none;\n");
      out.write("      }\n");
      out.write("      .signup-form-right input[type=\"date\"]::-webkit-calendar-picker-indicator {\n");
      out.write("        filter: invert(1);\n");
      out.write("        cursor: pointer;\n");
      out.write("      }\n");
      out.write("      \n");
      out.write("      button {\n");
      out.write("        padding: 10px;\n");
      out.write("        border: none;\n");
      out.write("        color: white;\n");
      out.write("        border-radius: 5px;\n");
      out.write("        font-size: 16px;\n");
      out.write("        cursor: pointer;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      button.next {\n");
      out.write("        background-color: #007bff;\n");
      out.write("        margin-bottom: 15px;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      button.complete {\n");
      out.write("        background-color: #00aaff;\n");
      out.write("        width: 100%;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      button.reset {\n");
      out.write("        background-color: transparent;\n");
      out.write("        border: 1px solid white;\n");
      out.write("      }\n");
      out.write("      .empty {\n");
      out.write("        flex: 2;\n");
      out.write("      }\n");
      out.write("      .error {\n");
      out.write("        color: red;\n");
      out.write("        font-size: 12px;\n");
      out.write("        margin-top: -10px;\n");
      out.write("        margin-bottom: 10px;\n");
      out.write("      }\n");
      out.write("    </style>\n");
      out.write("    <script>\n");
      out.write("    let isDuplicate = false;\n");
      out.write("      document.addEventListener(\"DOMContentLoaded\", () => {\n");
      out.write("        const emailInput = document.getElementById(\"email\");\n");
      out.write("        const passwordInput = document.getElementById(\"password\");\n");
      out.write("        const checkPasswordInput = document.getElementById(\"check-password\");\n");
      out.write("        const nextButton = document.querySelector(\".next\");\n");
      out.write("        const rightSection = document.querySelector(\".signup-right\");\n");
      out.write("\n");
      out.write("        function showError(input, message) {\n");
      out.write("          const error = input.nextElementSibling;\n");
      out.write("          if (error && error.classList.contains(\"error\")) {\n");
      out.write("            error.textContent = message;\n");
      out.write("          } else {\n");
      out.write("            const errorMsg = document.createElement(\"div\");\n");
      out.write("            errorMsg.className = \"error\";\n");
      out.write("            errorMsg.textContent = message;\n");
      out.write("            input.parentNode.insertBefore(errorMsg, input.nextSibling);\n");
      out.write("          }\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function clearError(input) {\n");
      out.write("          const error = input.nextElementSibling;\n");
      out.write("          if (error && error.classList.contains(\"error\")) {\n");
      out.write("            error.textContent = \"\";\n");
      out.write("          }\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        nextButton.addEventListener(\"click\", () => {\n");
      out.write("          let isValid = true;\n");
      out.write("\n");
      out.write("          const email = emailInput.value.trim();\n");
      out.write("          const password = passwordInput.value.trim();\n");
      out.write("          const checkPassword = checkPasswordInput.value.trim();\n");
      out.write("          \n");
      out.write("\n");
      out.write("          if (!/^[^\\s@]+@[^\\s@]+\\.[^\\s@]+$/.test(email)) {\n");
      out.write("            showError(emailInput, \"이메일 형식이 아닙니다.\");\n");
      out.write("            isValid = false;\n");
      out.write("          } else {\n");
      out.write("            clearError(emailInput);\n");
      out.write("          }\n");
      out.write("\n");
      out.write("          if (password === \"\") {\n");
      out.write("            showError(passwordInput, \"패스워드를 입력하세요.\");\n");
      out.write("            isValid = false;\n");
      out.write("          } else {\n");
      out.write("            clearError(passwordInput);\n");
      out.write("          }\n");
      out.write("\n");
      out.write("          if (password !== checkPassword) {\n");
      out.write("            showError(checkPasswordInput, \"패스워드가 일치하지 않습니다.\");\n");
      out.write("            isValid = false;\n");
      out.write("          } else {\n");
      out.write("            clearError(checkPasswordInput);\n");
      out.write("          }\n");
      out.write("\n");
      out.write("          if (isValid) {\n");
      out.write("            rightSection.style.opacity = \"1\";\n");
      out.write("            rightSection.style.transform = \"translateX(0)\";\n");
      out.write("            rightSection.classList.add(\"slide-in-left2\");\n");
      out.write("          } else {\n");
      out.write("            rightSection.style.opacity = \"0\";\n");
      out.write("            rightSection.style.transform = \"translateX(100%)\";\n");
      out.write("            rightSection.classList.remove(\"slide-in-left2\");\n");
      out.write("          }\n");
      out.write("        });\n");
      out.write("      });\n");
      out.write("    </script>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <form action=\"SignUp_Check.jsp\" method = \"post\">\n");
      out.write("      <div class=\"signup-container\">\n");
      out.write("        <div class=\"signup-left slide-in-left\">\n");
      out.write("          <h1>Sign up</h1>\n");
      out.write("\n");
      out.write("          <div class=\"signup-form\">\n");
      out.write("            <label for=\"email\">Email:</label>\n");
      out.write("    		<input type=\"email\" id=\"email\" placeholder=\"Email\" name=\"email\" required>\n");
      out.write("            <label for=\"password\" >Password</label>\n");
      out.write("            <input\n");
      out.write("              type=\"password\"\n");
      out.write("              name = \"pwd\"\n");
      out.write("              id=\"password\"\n");
      out.write("              placeholder=\"Password\"\n");
      out.write("              required\n");
      out.write("            />\n");
      out.write("\n");
      out.write("            <label for=\"check-password\">Check Password</label>\n");
      out.write("            <input\n");
      out.write("              type=\"password\"\n");
      out.write("              id=\"check-password\"\n");
      out.write("              placeholder=\"Check Password\"\n");
      out.write("              required\n");
      out.write("            />\n");
      out.write("\n");
      out.write("            <button type=\"button\" class=\"next\">다음</button>\n");
      out.write("            <button\n");
      out.write("              type=\"button\"\n");
      out.write("              class=\"reset\"\n");
      out.write("              onclick=\"location.href='SignIn.jsp'\"\n");
      out.write("            >\n");
      out.write("             이전으로\n");
      out.write("            </button>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"signup-right\">\n");
      out.write("          <div class=\"signup-form-right\">\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label for=\"name\">이름</label>\n");
      out.write("              <input type=\"text\" name = \"name\" id=\"name\" placeholder=\"이름\" required />\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label for=\"gender\">성별</label>\n");
      out.write("              <select name =\"gender\" id=\"gender\" required>\n");
      out.write("                <option style=\"color:black;\" value=\"Other\">성별</option>\n");
      out.write("                <option style=\"color:black;\" value=\"MALE\">남성</option>\n");
      out.write("                <option style=\"color:black;\" value=\"FEMALE\">여성</option>\n");
      out.write("              </select>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label for=\"dob\">생일</label>\n");
      out.write("              <input type=\"date\" name = \"birth\" id=\"dob\" required />\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label for=\"job\">직업</label>\n");
      out.write("              <input type=\"text\" name = \"job\" id=\"job\" placeholder=\"직업\" required />\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label for=\"organization\">소속</label>\n");
      out.write("              <input\n");
      out.write("                type=\"text\"\n");
      out.write("                name = \"org\"\n");
      out.write("                id=\"organization\"\n");
      out.write("                placeholder=\"소속\"\n");
      out.write("                required\n");
      out.write("              />\n");
      out.write("            </div>\n");
      out.write("            <button type=\"submit\" class=\"complete\">완료</button>\n");
      out.write("            <button type=\"reset\" class=\"reset\">다시쓰기</button>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"empty\"></div>\n");
      out.write("      </div>\n");
      out.write("    </form>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
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
