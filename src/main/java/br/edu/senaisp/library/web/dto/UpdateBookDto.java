package br.edu.senaisp.library.web.dto;

import jakarta.validation.constraints.NotBlank;

public class UpdateBookDto {

    @NotBlank
    private String title;

    @NotBlank
    private String confirmTitle;

    @NotBlank
    private String published_date;

    @NotBlank
    private String author;

    public UpdateBookDto() {
    }

    public UpdateBookDto(String title, String confirmTitle, String published_date, String author) {
        this.title = title;
        this.confirmTitle = confirmTitle;
        this.published_date = published_date;
        this.author = author;
    }

    public @NotBlank String getTitle() {
        return title;
    }

    public void setTitle(@NotBlank String title) {
        this.title = title;
    }

    public @NotBlank String getConfirmTitle() {
        return confirmTitle;
    }

    public void setConfirmTitle(@NotBlank String confirmTitle) {
        this.confirmTitle = confirmTitle;
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

    @Override
    public String toString() {
        return "UpdateBookDto{" +
                "title='" + title + '\'' +
                ", ConfirmTitle='" + confirmTitle + '\'' +
                ", published_date='" + published_date + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
