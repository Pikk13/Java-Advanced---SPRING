
        package hu.flowacademy.library;
import hu.flowacademy.library.model.Book;
import hu.flowacademy.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.time.LocalDate;
@SpringBootApplication
public class LibraryApplication {
    public static void main(String[] args) {
        SpringApplication.run(LibraryApplication.class, args);
    }
    @Autowired
    BookRepository bookRepository;
//    @Bean
//    public CommandLineRunner runner() {
//        return args -> {
//            Book book = new Book("A", 1000L, LocalDate.of(1993, 03, 12));
//            bookRepository.save(book);
//        };
//    }
}
 