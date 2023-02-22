package quanly.quanlynhansu.controller;
import quanly.quanlynhansu.model.dto.StaffDto;
import quanly.quanlynhansu.service.StaffService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "staffServlet", value = {"/", "/staff"})

public class StaffController extends HttpServlet {


    private StaffService staffService = null;

    @Override
    public void init () throws SecurityException{
        staffService = new StaffService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException{
        String begin = req.getServletPath();

        switch (begin){
            case "/":
            case "/staffs":
                req.setAttribute("staffs", staffService.findAll());
                req.getRequestDispatcher("/WEB-INF/view/staff/index.jsp").forward(req, resp);
                break;
            case "/staff/detail":
              int detail = Integer.parseInt(req.getParameter("id"));
              req.setAttribute("staff",staffService.find(detail) );
              req.getRequestDispatcher("/WEB-INF/view/staff/detail.jsp").forward(req,resp);
              break;
            case "/staff/add":
                req.getRequestDispatcher("/WEB-INF/view/staff/add.jsp").forward(req,resp);
                break;
            case "/staff/edit":
                int edit = Integer.parseInt(req.getParameter("id"));
                req.setAttribute("staff",staffService.find(edit) );
                req.getRequestDispatcher("/WEB-INF/view/staff/edit.jsp").forward(req,resp);
                break;
            case "/staff/remove":
                int remove = Integer.parseInt(req.getParameter("id"));
                staffService.remove(remove);
                resp.sendRedirect(req.getContextPath() + "/staffs");
                break;
            case "/staff/invoice":
                int in = Integer.parseInt(req.getParameter("id"));
                req.setAttribute("staff",staffService.find(in) );
                req.getRequestDispatcher("/WEB-INF/view/staff/invoice.jsp").forward(req,resp);
                break;

            case "/staff/searchByName":
            String searchId = req.getParameter("id");
            staffService.searchByName(searchId);
            req.setAttribute("staffs",staffService.searchByName(searchId));
            req.getRequestDispatcher("/WEB-INF/view/staff/index.jsp").forward(req,resp);
            break;
            case "/staff/sortByIdDesc":
                staffService.sortByIdDesc();
                req.setAttribute("staffs",staffService.sortByIdDesc());
                req.getRequestDispatcher("/WEB-INF/view/staff/index.jsp").forward(req,resp);
                break;
        }

    }

    @Override
    protected void doPost (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        String begin = req.getServletPath();

        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String address = req.getParameter("address");
        String position = req.getParameter("position");
        String start_date = req.getParameter("start_date");
        String phone = req.getParameter("phone");
        double salary = Double.parseDouble((req.getParameter("salary")));


        StaffDto staffDto = new StaffDto(id,name,address,phone,position,start_date,salary);
        switch (begin){
            case "/staff/add":
                staffService.add(staffDto);
                resp.sendRedirect(req.getContextPath()+ "/staffs");
                break;
            case "/staff/edit":
                id = Integer.parseInt(req.getParameter("id"));
                StaffDto edits = staffService.find(id);
                edits.setName(staffDto.getName());
                edits.setAddress(staffDto.getAddress());
                edits.setPhone(staffDto.getPhone());
                edits.setPosition(staffDto.getPosition());
                edits.setStartDate(staffDto.getStartDate());
                edits.setSalary(staffDto.getSalary());

                staffService.edit(edits);
                resp.sendRedirect(req.getContextPath() + "/staffs");
                break;
        }
        }
}