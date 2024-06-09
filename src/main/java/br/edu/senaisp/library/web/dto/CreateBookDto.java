package br.edu.senaisp.library.web.dto;

import jakarta.validation.constraints.NotBlank;

public class CreateBookDto {

    @NotBlank
    private String title;

    @NotBlank
    private String published_date;

    @NotBlank
    private String author;

    @NotBlank
    private String description;

    public CreateBookDto(String title, String published_date, String author, String description) {
        this.title = title;
        this.published_date = published_date;
        this.author = author;
        this.description = description;
    }

    public CreateBookDto() {
    }

    public @NotBlank String getTitle() {
        return title;
    }

    public void setTitle(@NotBlank String title) {
        this.title = title;
    }

    public @NotBlank String getPublished_date() {
        return published_date;
    }

    public void setPublished_date(@NotBlank String published_date) {
        this.published_date = published_date;
    }

    public @NotBlank String getAuthor() {
        return author;
    }

    public void setAuthor(@NotBlank String author) {
        this.author = author;
    }

    public @NotBlank String getDescription() {
        return description;
    }

    public void setDescription(@NotBlank String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "CreateBookDto{" +
                "title='" + title + '\'' +
                ", published_date='" + published_date + '\'' +
                ", author='" + author + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
