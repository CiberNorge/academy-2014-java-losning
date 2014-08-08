package no.ciber.academy.service;

import no.ciber.academy.domain.BookDefinition;
import no.ciber.academy.repository.BookDefinitionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl {
    @Autowired
    private BookDefinitionRepository bookDefinitionRepository;

    public Iterable<BookDefinition> findAllBooks() {
        return bookDefinitionRepository.findAll();
    }
}
