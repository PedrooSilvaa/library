package br.edu.senaisp.library.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.util.Date;

@Entity
public class Library {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    private Integer id;
    @NotBlank
    @Column(name = "title", unique = true, length = 100, nullable = false)
    private String title;
    @NotBlank
    @Column(name = "author", length = 100, nullable = false)
    private String author;
    @NotBlank
    @Column(name = "published_date", nullable = false, length = 10)
    private String published_date;
    @NotBlank
    @Column(name = "description", nullable = false, length = 200)
    private String description = "Livro sobre:" + getTitle() + " Do autor: " + getAuthor();

    public Library(Integer id, String title, String author, String published_date, String description) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.published_date = published_date;
        this.description = description;
    }

    public Library() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public @NotBlank String getTitle() {
        return title;
    }

    public void setTitle(@NotBlank String title) {
        this.title = title;
    }

    public @NotBlank String getAuthor() {
        return author;
    }

    public void setAuthor(@NotBlank String author) {
        this.author = author;
    }

    public @NotBlank String getPublished_date() {
        return published_date;
    }

    public void setPublished_date(@NotBlank String published_date) {
        this.published_date = published_date;
    }

    public @NotBlank String getDescription() {
        return description;
    }

    public void setDescription(@NotBlank String description) {
        this.description = description;
    }
}
