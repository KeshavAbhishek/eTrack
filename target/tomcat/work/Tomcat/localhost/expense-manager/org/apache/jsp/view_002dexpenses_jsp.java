/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2025-03-13 08:01:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.example.model.Expense;

public final class view_002dexpenses_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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

      out.write("\r\n");
      out.write("    \r\n");
      out.write("        <!DOCTYPE html>\r\n");
      out.write("        <html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("        <head>\r\n");
      out.write("            <meta charset=\"UTF-8\">\r\n");
      out.write("            <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("            <title>View Expenses</title>\r\n");
      out.write("            <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\r\n");
      out.write("                integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\"\r\n");
      out.write("                crossorigin=\"anonymous\">\r\n");
      out.write("            <link rel=\"stylesheet\" href=\"input.css\">\r\n");
      out.write("            <link rel=\"stylesheet\" href=\"button.css\">\r\n");
      out.write("            <link rel=\"stylesheet\" href=\"logout.css\">\r\n");
      out.write("            <style>\r\n");
      out.write("                body {\r\n");
      out.write("                    background: url('https://images.unsplash.com/photo-1669881336715-5a51a78d5434') no-repeat center center fixed;\r\n");
      out.write("                    background-size: cover;\r\n");
      out.write("                    font-family: 'Arial', sans-serif;\r\n");
      out.write("                    display: flex;\r\n");
      out.write("                    justify-content: center;\r\n");
      out.write("                    align-items: center;\r\n");
      out.write("                    min-height: 100dvh;\r\n");
      out.write("                    margin: 0;\r\n");
      out.write("                    color: #333;\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                .accordion-body {\r\n");
      out.write("                    text-align: left;\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                .container {\r\n");
      out.write("                    position: absolute;\r\n");
      out.write("                    backdrop-filter: blur(10px) saturate(180%);\r\n");
      out.write("                    -webkit-backdrop-filter: blur(10px) saturate(180%);\r\n");
      out.write("                    background-color: rgba(0, 0, 0, 0.6);\r\n");
      out.write("                    border-radius: 16px;\r\n");
      out.write("                    border: 1px solid rgba(255, 215, 0, 0.5);\r\n");
      out.write("                    box-shadow: 0 4px 15px rgba(255, 215, 0, 0.3);\r\n");
      out.write("                    padding: 40px;\r\n");
      out.write("                    text-align: center;\r\n");
      out.write("                    max-width: 400px;\r\n");
      out.write("                    width: 100%;\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                h1 {\r\n");
      out.write("                    font-size: 2.5em;\r\n");
      out.write("                    margin-bottom: 20px;\r\n");
      out.write("                    color: #ffe600;\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                a {\r\n");
      out.write("                    display: block;\r\n");
      out.write("                    margin: 15px 0;\r\n");
      out.write("                    padding: 10px 20px;\r\n");
      out.write("                    text-decoration: none;\r\n");
      out.write("                    color: #fff;\r\n");
      out.write("                    background-color: #007BFF;\r\n");
      out.write("                    border-radius: 8px;\r\n");
      out.write("                    transition: background-color 0.3s ease, transform 0.3s ease;\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                a:hover {\r\n");
      out.write("                    background-color: #0056b3;\r\n");
      out.write("                    transform: translateY(-3px);\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                .accordion {\r\n");
      out.write("                    max-height: 50dvh;\r\n");
      out.write("                    overflow: scroll;\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                .accordion::-webkit-scrollbar {\r\n");
      out.write("                    display: none !important;\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                @media screen and (max-width: 700px) {\r\n");
      out.write("                    .container {\r\n");
      out.write("                        width: 85vw !important;\r\n");
      out.write("                    }\r\n");
      out.write("\r\n");
      out.write("                    .accordion {\r\n");
      out.write("                        max-height: 40dvh;\r\n");
      out.write("                        overflow: scroll;\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                a {\r\n");
      out.write("                    display: block;\r\n");
      out.write("                    margin: 15px 0;\r\n");
      out.write("                    padding: 12px 24px;\r\n");
      out.write("                    text-decoration: none;\r\n");
      out.write("                    color: #000;\r\n");
      out.write("                    background-color: #ffcc00;\r\n");
      out.write("                    /* Gold button */\r\n");
      out.write("                    border-radius: 8px;\r\n");
      out.write("                    transition: background-color 0.3s ease, transform 0.3s ease;\r\n");
      out.write("                    font-size: 1.2rem;\r\n");
      out.write("                    font-weight: bold;\r\n");
      out.write("                    width: max-content;\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                a:hover {\r\n");
      out.write("                    /* background-color: #0056b3; */\r\n");
      out.write("                    background-color: #ffcc00;\r\n");
      out.write("                    transform: translateY(-3px);\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                .accordion-item {\r\n");
      out.write("                    backdrop-filter: blur(10px) saturate(180%);\r\n");
      out.write("                    -webkit-backdrop-filter: blur(10px) saturate(180%);\r\n");
      out.write("                    background-color: rgba(255, 215, 0, 0.12);\r\n");
      out.write("                    /* Soft golden glass effect */\r\n");
      out.write("                    border-radius: 12px;\r\n");
      out.write("                    border: 1px solid rgba(255, 215, 0, 0.4);\r\n");
      out.write("                    /* Light golden border */\r\n");
      out.write("                    box-shadow: 0 4px 15px rgba(255, 215, 0, 0.3);\r\n");
      out.write("                    /* Yellow glow effect */\r\n");
      out.write("                    margin-bottom: 10px;\r\n");
      out.write("                    overflow: hidden;\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                .accordion-button {\r\n");
      out.write("                    backdrop-filter: blur(8px) saturate(150%);\r\n");
      out.write("                    -webkit-backdrop-filter: blur(8px) saturate(150%);\r\n");
      out.write("                    background-color: rgba(255, 215, 0, 0.15);\r\n");
      out.write("                    /* Subtle golden overlay */\r\n");
      out.write("                    color: #fff;\r\n");
      out.write("                    font-weight: bold;\r\n");
      out.write("                    transition: all 0.3s ease-in-out;\r\n");
      out.write("                    border: none;\r\n");
      out.write("                    box-shadow: inset 0 0 10px rgba(255, 215, 0, 0.25);\r\n");
      out.write("                    /* Inner glow */\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                .accordion-button:hover {\r\n");
      out.write("                    background-color: rgba(255, 215, 0, 0.3);\r\n");
      out.write("                    /* More intense golden glow */\r\n");
      out.write("                    box-shadow: 0 0 10px rgba(255, 215, 0, 0.6);\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                .accordion-body {\r\n");
      out.write("                    color: #fff;\r\n");
      out.write("                    background-color: rgba(0, 0, 0, 0.3);\r\n");
      out.write("                    backdrop-filter: blur(12px);\r\n");
      out.write("                    border-radius: 0 0 12px 12px;\r\n");
      out.write("                    padding: 15px;\r\n");
      out.write("                    border-top: 1px solid rgba(255, 215, 0, 0.3);\r\n");
      out.write("                    /* Golden divider */\r\n");
      out.write("                    box-shadow: inset 0 0 8px rgba(255, 215, 0, 0.4);\r\n");
      out.write("                }\r\n");
      out.write("            </style>\r\n");
      out.write("        </head>\r\n");
      out.write("\r\n");
      out.write("        <body>\r\n");
      out.write("            <div class=\"container box\">\r\n");
      out.write("                <h1 style=\"font-weight: bolder; text-align: center;\">View Expenses</h1>\r\n");
      out.write("                <div class=\"accordion\" id=\"accordionExample\">\r\n");
      out.write("                    ");
 Expense[] expenses=(Expense[]) request.getAttribute("expenses"); if (expenses !=null) { for (int
                        i=0; i < expenses.length; i++) { Expense expense=expenses[i]; String collapseId="collapse" + i;
                        
      out.write("\r\n");
      out.write("                        <div class=\"accordion-item\">\r\n");
      out.write("                            <h2 class=\"accordion-header\" id=\"heading");
      out.print( i );
      out.write("\">\r\n");
      out.write("                                <button class=\"accordion-button collapsed\" type=\"button\" data-bs-toggle=\"collapse\"\r\n");
      out.write("                                    data-bs-target=\"#");
      out.print( collapseId );
      out.write("\" aria-expanded=\"true\"\r\n");
      out.write("                                    aria-controls=\"");
      out.print( collapseId );
      out.write("\" style=\"font-weight: bolder;\">\r\n");
      out.write("                                    ID: ");
      out.print( expense.getId() );
      out.write("\r\n");
      out.write("                                </button>\r\n");
      out.write("                            </h2>\r\n");
      out.write("                            <div id=\"");
      out.print( collapseId );
      out.write("\" class=\"accordion-collapse collapse\"\r\n");
      out.write("                                aria-labelledby=\"heading");
      out.print( i );
      out.write("\" data-bs-parent=\"#accordionExample\">\r\n");
      out.write("                                <div class=\"accordion-body\">\r\n");
      out.write("                                    Product Name: ");
      out.print( expense.getProductName() );
      out.write("<br>\r\n");
      out.write("                                        Price: ");
      out.print( expense.getPrice() );
      out.write("<br>\r\n");
      out.write("                                            Purchase Date: ");
      out.print( expense.getPurchaseDate() );
      out.write("<br>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <br>\r\n");
      out.write("                        ");
 } } 
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <a href=\"./index.jsp\" style=\"font-weight: bolder;\">Back | Home</a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("                integrity=\"sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz\"\r\n");
      out.write("                crossorigin=\"anonymous\"></script>\r\n");
      out.write("        </body>\r\n");
      out.write("\r\n");
      out.write("        </html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
