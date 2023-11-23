package com.example;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.Arrays;
import java.util.List;

@Path("/api/books")
public class BookResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Book> getBooks(){
        return Arrays.asList(
          new Book(1L, "El Gran Gatsby", "F. Scott Fitzgerald"),
          new Book(2L, "Matar a un ruiseñor", "Harper Lee"),
          new Book(3L, "1984", "George Orwell")
        );
    }
}
