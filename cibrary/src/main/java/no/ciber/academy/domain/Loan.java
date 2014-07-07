package no.ciber.academy.domain;

import org.joda.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Loan {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private Loaner loaner;
    private BookInstance bookInstance;
    private LocalDateTime borrowed;
    private LocalDateTime returned;

    public Loan() {
    }

    public Loaner getLoaner() {
        return loaner;
    }

    public void setLoaner(Loaner loaner) {
        this.loaner = loaner;
    }

    public BookInstance getBookInstance() {
        return bookInstance;
    }

    public void setBookInstance(BookInstance bookInstance) {
        this.bookInstance = bookInstance;
    }

    public LocalDateTime getBorrowed() {
        return borrowed;
    }

    public void setBorrowed(LocalDateTime borrowed) {
        this.borrowed = borrowed;
    }

    public LocalDateTime getReturned() {
        return returned;
    }

    public void setReturned(LocalDateTime returned) {
        this.returned = returned;
    }
}
