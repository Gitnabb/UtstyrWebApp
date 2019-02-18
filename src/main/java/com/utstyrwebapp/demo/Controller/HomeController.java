package com.utstyrwebapp.demo.Controller;

import com.utstyrwebapp.demo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {


    @RequestMapping("home") // Accepting home request
    public ModelAndView home(User user) {

        // ModelandView object hold the view and the data
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userObject", user);

        modelAndView.setViewName("home"); // the "home" page

        // Print a request message
        System.out.println("Home request from User: " + user.getUserName() + "!");

        return modelAndView;

    }

    /*
    @RequestMapping("home")
    public String home(HttpServletRequest request, HttpServletResponse response) {

        HttpSession session = request.getSession();
        String name = request.getParameter("name");
        System.out.println("Home request from User: " + name + "!");
        session.setAttribute("name", name);
        return "home";
    */

}

