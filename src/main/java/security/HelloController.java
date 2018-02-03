package security;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @RequestMapping(value = {"/", "/welcome/**"}, method = RequestMethod.GET)
    public ModelAndView welcomePage(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("title", "Spring Security");
        modelAndView.addObject("message", "THis is home page");
        modelAndView.setViewName("hello");

        return modelAndView;
    }

}
