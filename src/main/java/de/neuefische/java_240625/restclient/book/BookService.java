package de.neuefische.java_240625.restclient.book;

import de.neuefische.java_240625.restclient.book.dto.BookDto;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Service
public class BookService {

    private final RestClient restClient;

    public BookService(RestClient.Builder restClientBuilder) {
        this.restClient = restClientBuilder
                .baseUrl("https://my-json-server.typicode.com/Flooooooooooorian/BookApi")
                .build();
    }

    public List<BookDto> getBooks() {
        List<BookDto> books =
                Arrays.stream(Objects.requireNonNull(restClient.get()
                                .uri("/books")
                                .retrieve()
                                .body(BookDto[].class)))
                        .toList();
        return books;
    }

    public BookDto getBookByIsbn(String isbn) {
        return restClient.get()
                .uri("/books/" + isbn)
                .retrieve()
                .body(BookDto.class);
    }
}
