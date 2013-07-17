package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class country_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <link href=\"");
      out.print(request.getContextPath());
      out.write("/resources/css/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"");
      out.print(request.getContextPath());
      out.write("/resources/css/myStyle.css\" rel=\"stylesheet\">\r\n");
      out.write("    <title>Home</title>\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("        $(document).ready(function() {\r\n");
      out.write("            $('.tagTitle').mouseover(function(){\r\n");
      out.write("            $(this).addClass('over');\r\n");
      out.write("            })\r\n");
      out.write("            .mouseout(function(){\r\n");
      out.write("            $('.tagTitle').removeClass('over');\r\n");
      out.write("            })\r\n");
      out.write("            .click(function() {\r\n");
      out.write("                $('.tagTitle').removeClass('clicked');\r\n");
      out.write("                $(this).addClass('clicked');\r\n");
      out.write("                $('.tagContent').hide();\r\n");
      out.write("                var divID = $(this).attr(\"id\").replace(\"Title\",\"Content\")\r\n");
      out.write("                $('#'+divID).show();\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("        </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"body\">\r\n");
      out.write("<h1 class=\"textCenter\">Oh, you find ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${treasure}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h1>\r\n");
      out.write("        <div class=\"tags\">\r\n");
      out.write("            <div id=\"titles\" class=\"titles\">\r\n");
      out.write("                <div id=\"tagTitle_1\" class=\"tagTitle\">News</div>\r\n");
      out.write("                <div id=\"tagTitle_2\" class=\"tagTitle\">Sports</div>\r\n");
      out.write("                <div id=\"tagTitle_3\" class=\"tagTitle\">Games</div>\r\n");
      out.write("             </div>\r\n");
      out.write("\r\n");
      out.write("             <div id=\"contents\" class=\"contents\">\r\n");
      out.write("\r\n");
      out.write("                <div id=\"tagContent_1\" class=\"tagContent\">\r\n");
      out.write("                <h2>China NEWS</h2>\r\n");
      out.write("                <hr>\r\n");
      out.write("                <span>China is going to attack Japan with aircraft</span>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div id=\"tagContent_2\" class=\"tagContent\">\r\n");
      out.write("                <h2><bold>David Beckham<bold> Leave Real Mardrid!</h2>\r\n");
      out.write("                <hr>\r\n");
      out.write("                <p>Because of the unsatisfied salary, david chose to leave RM,\r\n");
      out.write("                where is the next staion?</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                <div id=\"tagContent_3\" class=\"tagContent\">\r\n");
      out.write("                <h2>Bllizard is going to release the newest RTS game: Warcraft 3!</h2>\r\n");
      out.write("                <hr>\r\n");
      out.write("                <p>After 10 years waiting ,Warcraft 3 is comming soon!</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("             </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    <div class=\"bottomButton\">\r\n");
      out.write("        <a href=\"/home\" class=\"btn\">continue</a>\r\n");
      out.write("        </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
