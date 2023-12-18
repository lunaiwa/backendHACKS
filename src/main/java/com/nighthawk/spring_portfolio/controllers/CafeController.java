package com.nighthawk.spring_portfolio.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CafeController {
    
    @GetMapping("/menu")
    public String getMenu(Model model) {
        // Create a list of menu items
        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("Espresso", "Black coffee", 2.5));
        menuItems.add(new MenuItem("Latte", "Coffee with milk", 3.0));
        menuItems.add(new MenuItem("Croissant", "Yum pastry", 2.0));

        // add list of menu items to model
        model.addAttribute("menuItems", menuItems);

        // return the template name
        return "menu";
    }

    // simple MenuItem class for demo
    public static class MenuItem {
        private String name;
        private String description;
        private double price;

        public MenuItem(String name, String description, double price) {
            this.name = name;
            this.description = description;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public String getDescription() {
            return description;
        }

        public double getPrice() {
            return price;
        }
    }
}
