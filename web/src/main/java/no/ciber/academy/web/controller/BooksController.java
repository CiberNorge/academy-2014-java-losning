package no.ciber.academy.web.controller;

import no.ciber.academy.domain.Book;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("/books")
public class BooksController {

    @RequestMapping(params = "init", method = RequestMethod.GET)
    public String createForm(@ModelAttribute Book message) {
        return "books/addBook";
    }

    @RequestMapping(value = "save", method = RequestMethod.POST)
    public ModelAndView save(@Valid Book book, BindingResult result,
                               RedirectAttributes redirect) {
        if (result.hasErrors()) {
            return new ModelAndView("books/addBook", "formErrors", result.getAllErrors());
        }
        //message = this.messageRepository.save(message);
        redirect.addFlashAttribute("globalMessage", String.format(
                "Successfully created a new book with the title '%s'.",
                book.getTitle()));
        return new ModelAndView("redirect:/", "message.id", 2);
    }

}
