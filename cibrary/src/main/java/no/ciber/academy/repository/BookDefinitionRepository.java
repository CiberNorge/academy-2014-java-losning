package no.ciber.academy.repository;

import no.ciber.academy.domain.BookDefinition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookDefinitionRepository extends JpaRepository<BookDefinition, Long> {
}
