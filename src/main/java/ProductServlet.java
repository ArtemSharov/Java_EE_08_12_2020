import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ProductServlet", urlPatterns = "/products")
public class ProductServlet  extends HttpServlet {
        private static Logger logger = LoggerFactory.getLogger(FirstServlet.class);

        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            ArrayList<Product> productsList = new ArrayList<>();
            Product car = new Product(1,"Lada", 100);
            productsList.add(car);
            Product car1 = new Product(1,"Opel", 300);
            productsList.add(car1);
            Product car2 = new Product(1,"Nissan", 250);
            productsList.add(car2);
            Product car3 = new Product(1,"Kia", 150);
            productsList.add(car3);
            Product car4 = new Product(1,"Ford", 180);
            productsList.add(car4);
            Product car5 = new Product(1,"Mazda", 400);
            productsList.add(car5);
            Product car6 = new Product(1,"Lexus", 500);
            productsList.add(car6);
            Product car7 = new Product(1,"Subaru", 450);
            productsList.add(car7);
            Product car8 = new Product(1,"Jeep", 600);
            productsList.add(car8);
            Product car9 = new Product(1,"BMW", 650);
            productsList.add(car9);


       logger.info("New GET request");
//
            for (Product p:productsList) {
                resp.getWriter().println(p.getTitle() + " " + p.getCoast());
            }

            //  resp.getWriter().printf("<h1>New GET request with parameters param1 = %s; param2 = %s </h1>", req.getParameter("param1"), req.getParameter("param2"));
//            logger.info("New Get request with includes");
//
//            getServletContext().getRequestDispatcher("/header.html").include(req, resp);
//            resp.getWriter().println("<p>Response body from servlet</p>");
//            getServletContext().getRequestDispatcher("/footer.html").include(req, resp);

        }
}
