package com.ruralcare.ruralcare;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    // =========================
    // LOGIN PAGE
    // =========================

    @GetMapping("/")
    public String loginPage() {
        return "login";
    }


    // =========================
    // LOGIN
    // =========================

    @PostMapping("/login")
    public String login(
            @RequestParam("username") String username,
            @RequestParam("password") String password) {

        System.out.println("LOGIN BUTTON CLICKED");
        System.out.println("Username: " + username);

        // Demo login
        // Any non-empty username and password accepted

        if (!username.isEmpty() && !password.isEmpty()) {

            System.out.println("LOGIN SUCCESS");

            return "redirect:/products";
        }

        System.out.println("LOGIN FAILED");

        return "login";
    }


    // =========================
    // PRODUCTS PAGE
    // =========================

    @GetMapping("/products")
    public String productsPage() {
        return "index";
    }


    // =========================
    // CART PAGE
    // =========================

    @GetMapping("/cart")
    public String cartPage() {
        return "cart";
    }


    // =========================
    // CHECKOUT PAGE
    // =========================

    @GetMapping("/checkout")
    public String checkoutPage() {
        return "checkout";
    }


    // =========================
    // ORDER SUCCESS PAGE
    // =========================

    @GetMapping("/order-success")
    public String orderSuccessPage() {
        return "order-success";
    }
}