package comp.finalproject.admin.controller;

import comp.finalproject.admin.entity.Customer;
import comp.finalproject.admin.repository.CustomerRepository;
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
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    // handler methods go here...
    @RequestMapping("/customer")
    public String viewHomePage(Model model) {
        List<Customer> listCustomer = customerRepository.findAll();
        model.addAttribute("listCustomer", listCustomer);
        return "customer";
    }

    @RequestMapping("/newcustomer")
    public String showNewForm(Model model) {
        Customer customer = new Customer();
        model.addAttribute("customer", customer);

        return "customernew";
    }

    @RequestMapping(value = "/savecustomer", method = RequestMethod.POST)
    public String save(@ModelAttribute("customer") Customer customer) {
        customerRepository.save(customer);

        return "redirect:/customer";
    }

    @RequestMapping("/editcustomer/{id}")
    public ModelAndView showEditForm(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("customeredit");
        Customer customer = customerRepository.findById(id);
        mav.addObject("customer", customer);

        return mav;
    }

    @RequestMapping("/showcustomer/{id}")
    public ModelAndView showCustomerForm(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("showcustomer_form");
        Customer customer = customerRepository.findById(id);
        mav.addObject("customer", customer);

        return mav;
    }

    @RequestMapping(value = "/updatecustomer", method = RequestMethod.POST)
    public String update(@ModelAttribute("customer") Customer customer) {

        customerRepository.save(customer);

        return "redirect:/customer";
    }

    @RequestMapping("/deletecustomer/{id}")
    public String delete(@PathVariable(name = "id") long id) {
        customerRepository.deleteById(id);
        return "redirect:/customer";
    }

}
