package pl.coderslab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.model.Institution;
import pl.coderslab.service.DonationService;
import pl.coderslab.service.InstitutionService;


@Controller
public class HomeController {

    @Autowired
    InstitutionService institutionService;

    @Autowired
    DonationService donationService;

    @RequestMapping("/")
    public String homeAction(Model model){
        model.addAttribute("institutions", institutionService.findAll());
        model.addAttribute("donationsCount", donationService.donationCount());
        model.addAttribute("sumQuantity", donationService.getSumQuantity());
        return "index";
    }
}
