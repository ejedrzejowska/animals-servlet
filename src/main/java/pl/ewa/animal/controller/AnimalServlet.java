package pl.ewa.animal.controller;

import pl.ewa.animal.model.Species;
import pl.ewa.animal.service.AnimalService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by ej on 03/02/2019.
 */

@WebServlet(name="animals", urlPatterns={"/", "/new", "/details"})
public class AnimalServlet extends HttpServlet {

    public static final String TEXT_HTML = "text/html";

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType(TEXT_HTML);

        if(request.getServletPath().equals("/add")) {
            request.getRequestDispatcher("add.jsp").forward(request, response);
        } else if(request.getServletPath().equals("/details")){
            String id = request.getParameter("id");
            request.setAttribute("animal", AnimalService.findById(id));
            request.getRequestDispatcher("details.jsp").forward(request, response);
        } else {
            request.setAttribute("animals", AnimalService.findAll());
            request.getRequestDispatcher("list.jsp").forward(request, response);
        }
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        String url = request.getParameter("pictureUrl");
        String species = request.getParameter("species");
        AnimalService.add(name, Integer.valueOf(age), url, Species.valueOf(species));
        response.sendRedirect("/animals");
    }


}
