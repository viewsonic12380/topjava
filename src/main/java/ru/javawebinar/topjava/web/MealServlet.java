package ru.javawebinar.topjava.web;

import org.slf4j.Logger;
import ru.javawebinar.topjava.model.MealTo;
import ru.javawebinar.topjava.model.Model;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;

public class MealServlet extends HttpServlet {
    private static final Logger log = getLogger(UserServlet.class);

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        log.debug("redirect to meals");

//        request.getRequestDispatcher("/users.jsp").forward(request, response);
//        response.sendRedirect("meals.jsp");
        Model model = Model.getInstance();
        List<MealTo> list = model.list();
        request.setAttribute("Meals",list);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/meals.jsp");
        requestDispatcher.forward(request, response);

    }
}