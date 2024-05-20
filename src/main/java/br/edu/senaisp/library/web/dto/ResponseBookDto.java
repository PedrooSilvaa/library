package br.edu.senaisp.library.web.dto;

public class ResponseBookDto {

    private String title;
    private String author;
    private String description;

    public ResponseBookDto(String title, String author, String description) {
        this.title = title;
        this.author = author;
        this.description = description;
    }

    public ResponseBookDto() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "ResponseBookDto{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
