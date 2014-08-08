package no.ciber.academy.domain;

import org.joda.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Entity
public class BookInstance {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private BookDefinition bookDefinition;
    private LocalDate bought;
    private List<Loan> loans = new ArrayList<>();

    public BookInstance() {
    }

    public BookDefinition getBookDefinition() {
        return bookDefinition;
    }

    public void setBookDefinition(BookDefinition bookDefinition) {
        this.bookDefinition = bookDefinition;
    }

    public LocalDate getBought() {
        return bought;
    }

    public void setBought(LocalDate bought) {
        this.bought = bought;
    }

    public List<Loan> getLoans() {
        return loans;
    }

    public void setLoans(List<Loan> loans) {
        this.loans = loans;
    }
}
