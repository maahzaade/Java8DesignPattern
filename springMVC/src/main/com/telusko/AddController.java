package main.com.telusko;/*
 * Created by Mahdiye on 2021, Mar, 18
 */


//@component contains 3 categories @Controller, @Component and @Service
import main.com.telusko.service.AddService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class AddController {

    //    @RequestMapping("/add")
//    public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {
//
//        int i = Integer.parseInt(request.getParameter("t1"));
//        int j = Integer.parseInt(request.getParameter("t2"));
    @RequestMapping("/add")
    public ModelAndView add(@RequestParam("t1") int i, @RequestParam("t2") int j) {

        AddService addService = new AddService();
        int k = addService.add(i, j);


        ModelAndView mv = new ModelAndView();
        mv.setViewName("display");
        mv.addObject("result", k);
        return mv;
    }
}
