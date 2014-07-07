package no.ciber.academy.repository;

import no.ciber.academy.domain.BookDefinition;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface BookDefinitionRepository extends CrudRepository<BookDefinition, Long> {
}
