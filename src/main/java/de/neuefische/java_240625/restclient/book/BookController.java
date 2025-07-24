package de.neuefische.java_240625.restclient.book;

import de.neuefische.java_240625.restclient.book.dto.BookDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private final BookService service;

    public BookController(BookService bookService) {
        this.service = bookService;
    }

    @GetMapping
    public List<BookDto> getBooks() {
        return service.getBooks();
    }

    @GetMapping("/{isbn}")
    public BookDto getBookByIsbn(@PathVariable String isbn) {return service.getBookByIsbn(isbn);
    }
}
