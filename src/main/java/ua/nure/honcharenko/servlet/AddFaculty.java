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

@WebServlet("/add")
public class AddFaculty extends HttpServlet {
    private static Integer facultyId = 0;
    private FacultyWebService service;

    @Override
    public void init() throws ServletException {
        service = ServiceProvider.getInstance().getFacultyWebService();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Faculty faculty = null;
        try {
            faculty = service.createFaculty(parseRequest(req));
        } catch (Exception e) {}
        if (faculty == null) {
            req.setAttribute("error", "faculty did not create.");
        }
        resp.sendRedirect("faculties");
    }

    public Faculty parseRequest(HttpServletRequest req) {
        Faculty faculty = new Faculty();
        faculty.setTitle(req.getParameter("title"));
        faculty.setShortTitle(req.getParameter("shortTitle"));
        String facultyBranch1 = req.getParameter("facultyBranch");
        faculty.setPlaceCount(Integer.parseInt(req.getParameter("placeCount")));
        faculty.setBudgetPlaceCount(Integer.parseInt(req.getParameter("budgetPlaceCount")));
        if (facultyBranch1 != null) {
            try {
                faculty.setFacultyBranch(FacultyBranch.fromValue(facultyBranch1));
            } catch (Exception e) {}
        }
        Faculty.FacultyRoomNumber facultyRoomNumber = new Faculty.FacultyRoomNumber();
        if (req.getParameter("facultyRooNumber") != null && req.getParameter("facultyRoomNumberYes") == null) {
            facultyRoomNumber.setNo("");
        }
        if (req.getParameter("facultyRoomNumberYes") != null) {
            facultyRoomNumber.setYes(req.getParameter("facultyRooNumberYes"));
        }
        faculty.setFacultyRoomNumber(facultyRoomNumber);
        Faculty.Additional additional = new Faculty.Additional();
        if (req.getParameter("bacheloerCount") != null) {
            Faculty.Additional.BacheloerCount bacheloerCount = new Faculty.Additional.BacheloerCount();
            try {
                bacheloerCount.setValue(new BigInteger(req.getParameter("bacheloerCount")));
            } catch (Exception e){}
            if (req.getParameter("bacheloerYear") != null) {
                try {
                    bacheloerCount.setYear(Integer.parseInt(req.getParameter("bacheloerYear")));
                } catch (Exception e){}
            }
            additional.setBacheloerCount(bacheloerCount);
        }
        if (req.getParameter("employedCount") != null) {
            String employedCount = req.getParameter("employedCount");
            additional.setEmployedStudents(new BigInteger(employedCount));
        }
        faculty.setAdditional(additional);
        faculty.setId(facultyId++);
        return faculty;
    }
}
