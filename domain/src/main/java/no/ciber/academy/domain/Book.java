package no.ciber.academy.domain;

import org.hibernate.validator.constraints.NotBlank;

public class Book {

    @NotBlank
    private String title;

    @NotBlank
    private String author;
    private String released;

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

    public String getReleased() {
        return released;
    }

    public void setReleased(String released) {
        this.released = released;
    }
}
