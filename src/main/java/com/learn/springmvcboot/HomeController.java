package com.learn.springmvcboot;

import com.learn.springmvcboot.model.Alien;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    /*
    @RequestMapping("/")
    public String home(){
        return "index.jsp";
    }
    */


    /*
    //Not using Servlet here....
    @RequestMapping("add")
    public String add(HttpServletRequest request){

        int number1 = Integer.parseInt(request.getParameter("number1"));
        int number2 = Integer.parseInt(request.getParameter("number2"));

        int number3 = number1 + number2;

        HttpSession session = request.getSession();

        session.setAttribute("number3", number3);

        return "result.jsp";
    }
     */

    /*
    @RequestMapping("add")
    public String add(@RequestParam("number1") int number1, @RequestParam("number2") int number2, HttpSession session){

        int number = number1 + number2;
        session.setAttribute("number3", number);
        return "result.jsp";
    }

     */

    /*
    @RequestMapping("add")
    public ModelAndView add(@RequestParam("number1") int number1, @RequestParam("number2") int number2){

        ModelAndView view = new ModelAndView();
        view.setViewName("result.jsp");

        int sum = number1 + number2;
        view.addObject("number3", sum);

        return view;
    }
     */

    /*
    Moving index.jsp and result.jsp into views(new) directory
     */


    @RequestMapping("/")
    public String home(){
        return "index";
    }

    /*
    @RequestMapping("add")
    public ModelAndView add(@RequestParam("number1") int number1, @RequestParam("number2") int number2){

        ModelAndView view = new ModelAndView();
        view.setViewName("result");

        int sum = number1 + number2;
        view.addObject("number3", sum);

        return view;
    }

     */

    @RequestMapping("add")
    public String add(@RequestParam("number1") int number1, @RequestParam("number2") int number2, ModelMap model){

        //You can use Model instead of ModelMap

        int sum = number1 + number2;
        model.addAttribute("number3", sum);

        return "result";
    }

    @RequestMapping("/alien")
    public String alienHome(){
        return "alien";
    }

    /*
    @RequestMapping("addAlien")
    public String addAlien(@RequestParam("id") int id, @RequestParam("name") String name, Model model){

        Alien alien = new Alien();

        alien.setId(id);
        alien.setName(name);

        model.addAttribute("alien", alien);

        return "alienResult";
    }

     */

    /*
    ModelAttribute
     */
    /*
    @RequestMapping("addAlien")
    public String addAlien(@ModelAttribute("alien") Alien alien, Model model){

        //model.addAttribute("alien", alien);

        return "alienResult";
    }

     */

    /*
    Model Attribute at Method Level
     */

    @ModelAttribute
    public void modelData(ModelMap model){
        model.addAttribute("name", "Aliens");
    }

    @RequestMapping("addAlien")
    public String addAlien(@ModelAttribute("alien") Alien alien, Model model){
        return "alienResult";
    }

}
