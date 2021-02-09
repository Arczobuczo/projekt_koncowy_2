package pl.sda.borat.projekt_koncowy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

import static java.util.Arrays.asList;

@Controller
public class HelpView {

    @GetMapping("/help")
    public String index(@RequestParam(value = "participant", required = false) String participant,
                        @RequestParam(value = "country", required = false) String country,
                        @RequestParam(value = "action", required = false) String action,
                        @RequestParam(value = "id", required = false) Integer id,
                        Model model) {
        model.addAttribute("id", id);
        List<Integer> userIds = asList(1,2,3,4);
        model.addAttribute("userIds", userIds);
    return "help";
    }
}
