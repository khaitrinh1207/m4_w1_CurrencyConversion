package controller;

import DAO.Convert;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/home")
public class HomeController {
    Convert convert = new Convert();

    @GetMapping("")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("home");
        return modelAndView;
    }

    @PostMapping("")
    public ModelAndView convert(@RequestParam int money, int value) {
        ModelAndView modelAndView = new ModelAndView("home");
        double result = 0;
        switch (money) {
            case 1:
                result = convert.UsdToVnd(value);
                break;
            case 2:
                result = convert.VndToUsd(value);
                modelAndView.addObject("selected", "selected");
                break;
        }
        modelAndView.addObject("result", result);
        modelAndView.addObject("value1", value);
        return modelAndView;
    }

}
