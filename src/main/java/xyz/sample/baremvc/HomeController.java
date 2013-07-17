package xyz.sample.baremvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    Treasure treasure = new Treasure();
    @RequestMapping("/")
    public String index(Model model) {
        treasure.reset();
        return "home";
    }

    @RequestMapping("/home")
    public ModelAndView notHome() {
        String viewName = treasure.isCleared()?"result":"home";
        ModelAndView modelAndView = new ModelAndView(viewName);
        modelAndView.getModel().put("score",treasure.getScore());
        return modelAndView;
    }

    @RequestMapping("/country/{country}")
    public ModelAndView toCountry(@PathVariable String country){
        ModelAndView modelAndView = new ModelAndView("country");
        modelAndView.getModel().put("treasure",treasure.getTreasure(country));
        return modelAndView;
    }
}
