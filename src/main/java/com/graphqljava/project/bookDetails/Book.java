package com.graphqljava.project.bookDetails;

import java.util.Arrays;
import java.util.List;

public record Book(String id, String name, int pageCount, String authorId) {

    private static List<Book> books = Arrays.asList(
            new Book("book-1", "Harry Potter and the Philosopher's Stone", 223, "Shisir"),
            new Book("book-2","Moby Dick",635,"Ramila"),
            new Book("book-3", "Interview with the vampire",371, "Basanta")
    );

    public static Book getById(String id){
        return books.stream().filter(book -> book.id().equals(id)).findFirst().orElse(null);
    }
}
