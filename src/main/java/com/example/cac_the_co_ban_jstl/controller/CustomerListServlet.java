package com.example.cac_the_co_ban_jstl.controller;

import com.example.cac_the_co_ban_jstl.model.Customer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet (name = "customerListServlet", urlPatterns = "/customers")
public class    CustomerListServlet extends HttpServlet {
    protected List<Customer> customerList;
    protected void setCustomerList () {
        customerList = new ArrayList<Customer>();
        customerList.add(new Customer("Mai Văn Hoàn","1983/08/20","Hà Nội","https://i.pinimg.com/736x/2c/49/12/2c4912586341a3f8ca8bf6b2f3354544.jpg"));
        customerList.add(new Customer("Nguyễn Văn Nam","1983/08/21","Bắc Giang","https://i.pinimg.com/564x/5a/44/81/5a44816688cbf15c4a04c157c8e7d03e.jpg"));
        customerList.add(new Customer("Nguyễn Thái Hòa","1983/08/22","Nam Định","https://i.pinimg.com/564x/38/c9/9d/38c99dccd6d62fc0d61f9029d72fa26c.jpg"));
        customerList.add(new Customer("Trần Đăng Khoa","1983/08/17","Hà Tây  ","https://i.pinimg.com/564x/d4/1a/83/d41a8382d4b0b0df5854dd6a10a98e52.jpg"));
        customerList.add(new Customer("Nguyễn Đình Thi","1983/08/19","Hà Nội","https://i.pinimg.com/564x/33/0b/3b/330b3b61d5e6e7e296029c25ed90fe48.jpg"));
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        setCustomerList();
        request.setAttribute("customerList", customerList);
        request.getRequestDispatcher("customerList.jsp").forward(request, response);
    }

}
