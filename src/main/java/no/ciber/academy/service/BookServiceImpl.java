package no.ciber.academy.service;

import com.google.common.base.Optional;
import no.ciber.academy.domain.BookDefinition;
import no.ciber.academy.repository.BookDefinitionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDefinitionRepository bookDefinitionRepository;

    public BookDefinition save(BookDefinition bookDefinition) {
        return bookDefinitionRepository.save(bookDefinition);
    }

    public Optional<BookDefinition> findOne(long id) {
        return Optional.fromNullable(bookDefinitionRepository.findOne(id));
    }

    public Iterable<BookDefinition> findAllBooks() {
        return bookDefinitionRepository.findAll();
    }
}
