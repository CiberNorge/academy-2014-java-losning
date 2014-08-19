package no.ciber.academy.domain;

import org.hibernate.validator.constraints.NotBlank;
import org.joda.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;

@Entity
@Inheritance(strategy= InheritanceType.TABLE_PER_CLASS)
public class BookDefinition {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @NotBlank
    private String title;

    @NotBlank
    private String author;
    @DateTimeFormat(pattern="dd.MM.yyyy")
    private LocalDate released;
    private String description;
//    private BookCategory category;
    private String link;
    private String isbn;

//   private List<BookInstance> instances = new ArrayList<>();

    public BookDefinition() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getReleased() {
        return released;
    }

    public void setReleased(LocalDate released) {
        this.released = released;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

//    public BookCategory getCategory() {
//        return category;
//    }
//
//    public void setCategory(BookCategory category) {
//        this.category = category;
//    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

//    public List<BookInstance> getInstances() {
//        return instances;
//    }

//    public void setInstances(List<BookInstance> instances) {
//        this.instances = instances;
//    }
}
