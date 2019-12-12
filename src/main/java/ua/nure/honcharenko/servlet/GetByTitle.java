package ua.nure.honcharenko.servlet;

import ua.nure.honcharenko.entity.Faculty;
import ua.nure.honcharenko.entity.FacultyBranch;
import ua.nure.honcharenko.provider.ServiceProvider;
import ua.nure.honcharenko.service.FacultyWebService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/getByTitle")
public class GetByTitle extends HttpServlet {
    private FacultyWebService service;

    @Override
    public void init() throws ServletException {
        service = ServiceProvider.getInstance().getFacultyWebService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        Faculty faculty = null;
        try {


            faculty = service.geFacultyByName(name);
        } catch (Exception e){}
        req.setAttribute("faculty", faculty);
        req.getRequestDispatcher("faculty.jsp").forward(req, resp);
    }
}