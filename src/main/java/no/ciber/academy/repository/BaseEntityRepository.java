package no.ciber.academy.repository;

import no.ciber.academy.domain.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseEntityRepository extends JpaRepository<BaseEntity, Long> {
}
