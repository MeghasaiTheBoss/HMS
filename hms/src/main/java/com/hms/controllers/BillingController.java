package com.hms.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.hms.services.*;
import com.hms.entities.*;
@Controller
public class BillingController 
{

    @Autowired
    private BillingService billingService;

    // Show form to generate a new bill
    @GetMapping("/generate")
    public String showGenerateBillForm(Model model) 
    {
        model.addAttribute("bill", new Bill());
        return "generateBill"; // HTML page: generateBill.html
    }

    // Handle form submission to generate a bill
    @PostMapping("/generate")
    public String generateBill(@ModelAttribute Bill bill) 
    {
        billingService.generateBill(bill);
        return "redirect:/billing/details/" + bill.getBillId();
    }

    // Display bill details
    @GetMapping("/details/{id}")
    public String getBillDetails(@PathVariable Long id, Model model) 
    {
        Bill bill = billingService.getBillById(id);
        model.addAttribute("bill", bill);
        return "billDetails"; // HTML page: billDetails.html
    }

    // Process payment for a bill
    @PostMapping("/pay/{id}")
    public String processPayment(@PathVariable Long id) 
    {
        billingService.processPayment(id);
        return "redirect:/billing/details/" + id;
    }
}

