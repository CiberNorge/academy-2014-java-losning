package no.ciber.academy.web.controller;

import no.ciber.academy.domain.BaseEntity;
import no.ciber.academy.repository.BaseEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class RootController {

    @Autowired
    private BaseEntityRepository baseEntityRepository;

    @RequestMapping("/")
    public String index(Model model) {
        List<BaseEntity> all = baseEntityRepository.findAll();
        model.addAttribute("entities", all);

        return "index";
    }

    @RequestMapping("/add")
    public String add(@RequestParam String text, Model model) {
        BaseEntity baseEntity = baseEntityRepository.save(new BaseEntity(text));
        model.addAttribute("entity", baseEntity);
        return "added";
    }


}
