package no.ciber.academy.service;

import no.ciber.academy.domain.BookDefinition;

public interface BookService {
    public Iterable<BookDefinition> findAllBooks();
}
