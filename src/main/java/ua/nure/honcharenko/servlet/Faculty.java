package ua.nure.honcharenko.servlet;

import ua.nure.honcharenko.provider.ServiceProvider;
import ua.nure.honcharenko.service.FacultyWebService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/faculty")
public class Faculty extends HttpServlet {
    private FacultyWebService service;

    @Override
    public void init() throws ServletException {
        service = ServiceProvider.getInstance().getFacultyWebService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        Integer facultyId = Integer.parseInt(id);
        ua.nure.honcharenko.entity.Faculty facultyById = null;
        try {
            facultyById = service.getFacultyById(facultyId);
        } catch (Exception e){}
        System.out.println("FAC BY ID : " + facultyById);
        req.setAttribute("faculty", facultyById);
        req.getRequestDispatcher("faculty.jsp").forward(req, resp);
    }
}