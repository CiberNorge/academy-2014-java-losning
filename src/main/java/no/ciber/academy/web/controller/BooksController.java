package no.ciber.academy.web.controller;

import no.ciber.academy.domain.BookDefinition;
import no.ciber.academy.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("/books")
public class BooksController {

    @Autowired
    private BookServiceImpl bookService;

    @RequestMapping(value = "/init", method = RequestMethod.GET)
    public String createForm(@ModelAttribute BookDefinition bookDefinition) {
        return "books/addBook";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@Valid BookDefinition bookDefinition, BindingResult result,
                               ModelMap model, RedirectAttributes redirect) {
        if (result.hasErrors()) {
            return "books/addBook";
        }

        bookDefinition = bookService.save(bookDefinition);

        redirect.addFlashAttribute("globalMessage", String.format(
                "Successfully created a new book with the title '%s'.",
                bookDefinition.getTitle()));
        return "redirect:/";
    }

    @RequestMapping(value = "/inventory", method = RequestMethod.GET)
    public String findAll(ModelMap model) {
        model.put("books", bookService.findAllBooks());
        return "books/inventory";
    }

}
