package com.erensayar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author ErenSayar
 */
@Controller
public class ViewController {

    @GetMapping(value = "/")
    public String redirectHome() {
        return "redirect:/home";
    }

    @GetMapping(value = "/home")
    public String home() {
        return "home";
    }

    @GetMapping(value = "/login")
    public String login() {
        return "login";
    }

    @GetMapping(value = "/addAuthor")
    public String addAuthor() {
        return "addAuthor";
    }

    @GetMapping(value = "/addBook")
    public String addBook() {
        return "addBook";
    }

    @GetMapping(value = "/addPublisher")
    public String addPublisher() {
        return "addPublisher";
    }

    @GetMapping(value = "/detailsOfAuthor/{id}")
    public String detailsAuthor(@PathVariable Integer id, Model model) {
        model.addAttribute("authorId", id);
        return "detailsOfAuthor";
    }

    @GetMapping(value = "/detailsOfBook/{id}")
    public String detailsBook(@PathVariable Integer id, Model model) {
        model.addAttribute("bookId", id);
        return "detailsOfBook";
    }

    @GetMapping(value = "/detailsOfPubisher/{id}")
    public String detailsPubisher(@PathVariable Integer id, Model model) {
        model.addAttribute("publisherId", id);
        return "detailsOfPubisher";
    }

}