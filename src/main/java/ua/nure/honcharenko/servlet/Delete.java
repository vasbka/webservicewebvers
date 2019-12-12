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
import java.math.BigInteger;

@WebServlet("/delete")
public class Delete extends HttpServlet {
    private FacultyWebService service;

    @Override
    public void init() throws ServletException {
        service = ServiceProvider.getInstance().getFacultyWebService();
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        Faculty faculty = null;
        try {
            faculty = service.deleteFaculty(id);
        } catch (Exception e){}
        if (faculty != null) {
            System.out.println("Deleted faculty successfuuly " + faculty);
        }
        resp.sendRedirect("faculties");
    }
}