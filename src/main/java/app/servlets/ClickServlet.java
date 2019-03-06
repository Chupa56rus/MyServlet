package app.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ClickServlet")
public class ClickServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("value");

        if (name.equals("hello")) {
            req.getRequestDispatcher("views/postRequest/helloPost.html").forward(req, resp);
        } else if(name.equals("goodbye")){
            req.getRequestDispatcher("views/postRequest/goodbyePost.html").forward(req, resp);
        } else {
            req.getRequestDispatcher("views/postRequest/anotherPost.html").forward(req, resp);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

        String name = req.getParameter("value");

        if (name.equals("hello")) {
            req.getRequestDispatcher("views/getRequest/helloGet.html").forward(req, resp);
        } else if(name.equals("goodbye")){
            req.getRequestDispatcher("views/getRequest/goodbyeGet.html").forward(req, resp);
        } else {
            req.getRequestDispatcher("views/getRequest/anotherGet.html").forward(req, resp);
        }
    }
}
