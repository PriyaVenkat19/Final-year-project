package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <!-- Basic -->\n");
      out.write("  <meta charset=\"utf-8\" />\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("  <!-- Mobile Metas -->\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\n");
      out.write("  <!-- Site Metas -->\n");
      out.write("  <meta name=\"keywords\" content=\"\" />\n");
      out.write("  <meta name=\"description\" content=\"\" />\n");
      out.write("  <meta name=\"author\" content=\"\" />\n");
      out.write("\n");
      out.write("  <title>cheque clearance</title>\n");
      out.write("\n");
      out.write("  <!-- slider stylesheet -->\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\"\n");
      out.write("    href=\"https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.1.3/assets/owl.carousel.min.css\" />\n");
      out.write("\n");
      out.write("  <!-- bootstrap core css -->\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.css\" />\n");
      out.write("\n");
      out.write("  <!-- fonts style -->\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700|Roboto:400,500&display=swap\"\n");
      out.write("    rel=\"stylesheet\" />\n");
      out.write("  <!-- Custom styles for this template -->\n");
      out.write("  <link href=\"css/style.css\" rel=\"stylesheet\" />\n");
      out.write("  <!-- responsive style -->\n");
      out.write("  <link href=\"css/responsive.css\" rel=\"stylesheet\" />\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("  <!-- header section strats -->\n");
      out.write("  <header class=\"header_section\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <nav class=\"navbar navbar-expand-lg custom_nav-container \">\n");
      out.write("        <a class=\"navbar-brand\" href=\"#\">\n");
      out.write("          <div class=\"logo_box\">\n");
      out.write("            <img src=\"images/logo.png\" alt=\"\" />\n");
      out.write("          </div>\n");
      out.write("        </a>\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\"\n");
      out.write("          aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("          <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("        </button>\n");
      out.write("\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("          <ul class=\"navbar-nav ml-auto mr-2\">\n");
      out.write("            <li class=\"nav-item active\">\n");
      out.write("              <a class=\"nav-link\" href=\"index.html\">Home <span class=\"sr-only\"></span></a>\n");
      out.write("            </li>\n");
      out.write("            \n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("              <a class=\"nav-link\" href=\"login.jsp\">Login </a>\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("      </nav>\n");
      out.write("    </div>\n");
      out.write("  </header>\n");
      out.write("  <!-- end header section -->\n");
      out.write("\n");
      out.write("  <!-- slider section -->\n");
      out.write("  <section class=\" slider_section\">\n");
      out.write("    <div id=\"carouselExampleIndicators\" class=\"carousel slide vert\" data-ride=\"carousel\">\n");
      out.write("      <ol class=\"carousel-indicators\">\n");
      out.write("        <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("        <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"1\"></li>\n");
      out.write("        <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"2\"></li>\n");
      out.write("      </ol>\n");
      out.write("      <div class=\"carousel-inner\">\n");
      out.write("        <div class=\"carousel-item active\">\n");
      out.write("          <div class=\"slider_box\">\n");
      out.write("            <div class=\"fixed_company-detail\">\n");
      out.write("              <p>\n");
      out.write("                cheque clearance\n");
      out.write("              </p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"slider-detail\">\n");
      out.write("              <div class=\"slider_detail-heading\">\n");
      out.write("                <h2>\n");
      out.write("                 \n");
      out.write("                </h2>\n");
      out.write("                <h1>\n");
      out.write("                  cheque clearance\n");
      out.write("                </h1>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"slider_detail-text\">\n");
      out.write("                <p>\n");
      out.write("                 \n");
      out.write("                </p>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"slider_detail-btn\">\n");
      out.write("                <a href=\"\">\n");
      out.write("                  <span>\n");
      out.write("                   \n");
      out.write("                  </span>\n");
      out.write("                  <img src=\"images/arrow.png\" alt=\"\" class=\"ml-2\" />\n");
      out.write("                </a>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"carousel-item\">\n");
      out.write("          <div class=\"slider_box\">\n");
      out.write("            <div class=\"fixed_company-detail\">\n");
      out.write("              <p>\n");
      out.write("               cheque clearance\n");
      out.write("              </p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"slider-detail\">\n");
      out.write("              <div class=\"slider_detail-heading\">\n");
      out.write("                <h2>\n");
      out.write("               \n");
      out.write("                </h2>\n");
      out.write("                <h1>\n");
      out.write("                 cheque clearance\n");
      out.write("                </h1>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"slider_detail-text\">\n");
      out.write("                <p>\n");
      out.write("                 \n");
      out.write("                </p>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"slider_detail-btn\">\n");
      out.write("                <a href=\"\">\n");
      out.write("                  <span>\n");
      out.write("                \n");
      out.write("                  </span>\n");
      out.write("                  <img src=\"images/arrow.png\" alt=\"\" class=\"ml-2\" />\n");
      out.write("                </a>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"carousel-item\">\n");
      out.write("          <div class=\"slider_box\">\n");
      out.write("            <div class=\"fixed_company-detail\">\n");
      out.write("              <p>\n");
      out.write("              cheque clearance\n");
      out.write("              </p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"slider-detail\">\n");
      out.write("              <div class=\"slider_detail-heading\">\n");
      out.write("                <h2>\n");
      out.write("             \n");
      out.write("                </h2>\n");
      out.write("                <h1>\n");
      out.write("                 cheque clearance\n");
      out.write("                </h1>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"slider_detail-text\">\n");
      out.write("                <p>\n");
      out.write("                 \n");
      out.write("                </p>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"slider_detail-btn\">\n");
      out.write("                <a href=\"\">\n");
      out.write("                  <span>\n");
      out.write("           \n");
      out.write("                  </span>\n");
      out.write("                  <img src=\"images/arrow.png\" alt=\"\" class=\"ml-2\" />\n");
      out.write("                </a>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <a class=\"carousel-control-prev\" href=\"#carouselExampleIndicators\" role=\"button\" data-slide=\"prev\">\n");
      out.write("        <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("        <span class=\"sr-only\">Previous</span>\n");
      out.write("      </a>\n");
      out.write("      <a class=\"carousel-control-next\" href=\"#carouselExampleIndicators\" role=\"button\" data-slide=\"next\">\n");
      out.write("        <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("        <span class=\"sr-only\">Next</span>\n");
      out.write("      </a>\n");
      out.write("    </div>\n");
      out.write("  </section>\n");
      out.write("\n");
      out.write("  <!-- end slider section -->\n");
      out.write("\n");
      out.write("  \n");
      out.write("   <!-- welcome section -->\n");
      out.write("  <section class=\"welcome_section layout_padding\">\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\" col-md-6\">\n");
      out.write("          <div>\n");
      out.write("            <img class=\"img-fluid\" src=\"images/welcome.jpg\" alt=\"\" />\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\" col-md-6\">\n");
      out.write("          <div class=\"welcome_detail\">\n");
      out.write("            <h3>\n");
      out.write("             Login\n");
      out.write("            </h3>\n");
      out.write("            <h2>\n");
      out.write("             \n");
      out.write("            </h2>\n");
      out.write("            <p>\n");
      out.write("            <form action=\"login\">\n");
      out.write("           \n");
      out.write("              user id   <input type=\"text\" name=\"id\" value=\"\" /><br>\n");
      out.write("              password  <input type=\"text\" name=\"pwd\" value=\"\" /><br>\n");
      out.write("              email      <input type=\"text\" name=\"email\" value=\"\" />\n");
      out.write("               <input type=\"submit\" value=\"submit\" />\n");
      out.write("               \n");
      out.write("                </form>\n");
      out.write("            </p>\n");
      out.write("            <div class=\"welcome_detail-btn\">\n");
      out.write("              <a href=\"\">\n");
      out.write("                <span>\n");
      out.write("                 \n");
      out.write("                </span>\n");
      out.write("             \n");
      out.write("              </a>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </section>\n");
      out.write("  <!-- end welcome section -->\n");
      out.write("\n");
      out.write("  \n");
      out.write("\n");
      out.write("  <!-- footer section -->\n");
      out.write("  <section class=\"container-fluid footer_section\">\n");
      out.write("    <p>\n");
      out.write("      \n");
      out.write("    </p>\n");
      out.write("  </section>\n");
      out.write("  <!-- footer section -->\n");
      out.write("\n");
      out.write("  <script type=\"text/javascript\" src=\"js/jquery-3.4.1.min.js\"></script>\n");
      out.write("  <script type=\"text/javascript\" src=\"js/bootstrap.js\"></script>\n");
      out.write("  <script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.2.1/owl.carousel.min.js\">\n");
      out.write("  </script>\n");
      out.write("  <script type=\"text/javascript\">\n");
      out.write("    $(\".owl-carousel\").owlCarousel({\n");
      out.write("      loop: true,\n");
      out.write("      margin: 20,\n");
      out.write("      nav: true,\n");
      out.write("      navText: [],\n");
      out.write("      autoplay: true,\n");
      out.write("      autoplayHoverPause: true,\n");
      out.write("      responsive: {\n");
      out.write("        0: {\n");
      out.write("          items: 1\n");
      out.write("        },\n");
      out.write("        600: {\n");
      out.write("          items: 2\n");
      out.write("        },\n");
      out.write("        1000: {\n");
      out.write("          items: 3\n");
      out.write("        }\n");
      out.write("      }\n");
      out.write("    });\n");
      out.write("  </script>\n");
      out.write("\n");
      out.write("  <script>\n");
      out.write("    $(\".nav_search-btn\").click(function () {\n");
      out.write("      if ($(\".nav_search-input\").hasClass(\"d-none\")) {\n");
      out.write("        event.preventDefault();\n");
      out.write("        $(\".nav_search-input\")\n");
      out.write("          .animate({\n");
      out.write("              left: \"-1000px\"\n");
      out.write("            },\n");
      out.write("            \"1000000\"\n");
      out.write("          )\n");
      out.write("          .removeClass(\"d-none\");\n");
      out.write("      } else {\n");
      out.write("        $(\".nav_search-input\")\n");
      out.write("          .animate({\n");
      out.write("              left: \"0px\"\n");
      out.write("            },\n");
      out.write("            \"1000000\"\n");
      out.write("          )\n");
      out.write("          .addClass(\"d-none\");\n");
      out.write("      }\n");
      out.write("    });\n");
      out.write("  </script>\n");
      out.write("\n");
      out.write("  <script>\n");
      out.write("    // This example adds a marker to indicate the position of Bondi Beach in Sydney,\n");
      out.write("    // Australia.\n");
      out.write("    function initMap() {\n");
      out.write("      var map = new google.maps.Map(document.getElementById('map'), {\n");
      out.write("        zoom: 11,\n");
      out.write("        center: {\n");
      out.write("          lat: 40.645037,\n");
      out.write("          lng: -73.880224\n");
      out.write("        },\n");
      out.write("      });\n");
      out.write("\n");
      out.write("      var image = 'images/maps-and-flags.png';\n");
      out.write("      var beachMarker = new google.maps.Marker({\n");
      out.write("        position: {\n");
      out.write("          lat: 40.645037,\n");
      out.write("          lng: -73.880224\n");
      out.write("        },\n");
      out.write("        map: map,\n");
      out.write("        icon: image\n");
      out.write("      });\n");
      out.write("    }\n");
      out.write("  </script>\n");
      out.write("  <!-- google map js -->\n");
      out.write("  <script src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyA8eaHt9Dh5H57Zh0xVTqxVdBFCvFMqFjQ&callback=initMap\">\n");
      out.write("  </script>\n");
      out.write("  <!-- end google map js -->\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
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
