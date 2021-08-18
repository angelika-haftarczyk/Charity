package pl.coderslab.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.coderslab.model.dto.DonationFormDto;
import pl.coderslab.service.CategoryService;
import pl.coderslab.service.DonationService;
import pl.coderslab.service.InstitutionService;

@AllArgsConstructor
@Controller
@RequestMapping("/form")
public class DonationController {

    @Autowired
    DonationService donationService;

    @Autowired
    CategoryService categoryService;

    @Autowired
    InstitutionService institutionService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String formGet(Model model){
        model.addAttribute("categories", categoryService.findAll());
        model.addAttribute("institutions", institutionService.findAll());
        return "form";
    }

//    @RequestMapping(value = "/confirmation", method = RequestMethod.POST)
//    public String formPost(@ModelAttribute DonationFormDto donationFormDto, Model model) {
//        model.addAttribute("donation", donationFormDto);
//        return "formConfirmation";
//    }

    @RequestMapping(value = "/confirmation", method = RequestMethod.POST)
    public String formPost(@ModelAttribute DonationFormDto donationFormDto, Model model) {
        model.addAttribute("donation", donationFormDto);
        return "formConfirmation";
    }
}
