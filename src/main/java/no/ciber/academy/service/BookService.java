package no.ciber.academy.service;

import com.google.common.base.Optional;
import no.ciber.academy.domain.BookDefinition;

public interface BookService {
    public BookDefinition save(BookDefinition bookDefinition);

    public Optional<BookDefinition> findOne(long id);

    public Iterable<BookDefinition> findAllBooks();
}
