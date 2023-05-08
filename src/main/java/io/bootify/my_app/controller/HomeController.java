package io.bootify.my_app.controller;
import io.bootify.my_app.model.User;
import io.bootify.my_app.service.UserService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {

    final UserService userService;

    public HomeController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String index(Model model) {
        return "index";
    }

    @GetMapping("/reservations")
    public String reservations(Model model) {
        // If a request is received at "/reservations", this code will call our userService and ask for the user with id 10000L. Then it will add this user to the Model.
        User user = userService.get(10000L);
        model.addAttribute("user", user);

        return "reservations";
    }
}
