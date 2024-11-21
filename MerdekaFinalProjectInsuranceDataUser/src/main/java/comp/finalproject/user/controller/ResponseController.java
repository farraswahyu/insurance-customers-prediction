package comp.finalproject.user.controller;

import comp.finalproject.user.entity.Customer;
import comp.finalproject.user.entity.Response;
import comp.finalproject.user.repository.CustomerRepository;
import comp.finalproject.user.repository.ResponseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ResponseController {

    @Autowired
    private ResponseRepository responseRepository;

    @Autowired
    private CustomerRepository customerRepository;

    // handler methods go here...
    @RequestMapping("/response")
    public String viewHomePage(Model model) {
        List<Response> listResponse = responseRepository.findAll();
        model.addAttribute("listResponse", listResponse);
        return "response";
    }

    @RequestMapping("/newresponse")
    public String showNewForm(Model model) {
        Response response = new Response();
        model.addAttribute("response", response);

        List<Customer> customer = customerRepository.findAll();
        model.addAttribute("customer", customer);

        return "responsenew";
    }

    @RequestMapping("/deleteresponse/{id}")
    public String delete(@PathVariable(name = "id") long id) {
        responseRepository.deleteById(id);
        return "redirect:/response";
    }

    @RequestMapping(value = "/saveresponse", method = RequestMethod.POST)
    public String save(@ModelAttribute("response") Response response) {

        responseRepository.save(response);

        return "redirect:/response";
    }

    @RequestMapping("/editresponse/{id}")
    public ModelAndView showEditForm(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("responseedit");
        Response response = responseRepository.findById(id);
        mav.addObject("response", response);

        return mav;
    }

    @RequestMapping(value = "/updateresponse", method = RequestMethod.POST)
    public String update(@ModelAttribute("response") Response response) {
        responseRepository.save(response);

        return "redirect:/response";
    }
}
