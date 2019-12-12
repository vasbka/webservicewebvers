package ua.nure.honcharenko.servlet;

import ua.nure.honcharenko.entity.Faculty;
import ua.nure.honcharenko.provider.ServiceProvider;
import ua.nure.honcharenko.service.FacultyWebService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.List;

@WebServlet("/faculties")
public class AllFaculties extends HttpServlet {

    private FacultyWebService service;

    @Override
    public void init() throws ServletException {
       service = ServiceProvider.getInstance().getFacultyWebService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        Faculty[] faculties = new Faculty[]{};
        try {
            faculties = service.getFaculties();
        } catch (Exception e) {
        }
        if (faculties != null) {
            List<Faculty> facultiesList = Arrays.asList(faculties);
            System.out.println("FACS : " + facultiesList);
            req.setAttribute("faculties", facultiesList);
        }
        try {
            req.getRequestDispatcher("faculties.jsp").forward(req, resp);
        } catch (Exception e){
            System.out.println(e);
        }
    }

}
