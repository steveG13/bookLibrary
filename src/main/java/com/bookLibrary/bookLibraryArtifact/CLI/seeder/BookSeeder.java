package com.bookLibrary.bookLibraryArtifact.CLI.seeder;

import com.bookLibrary.bookLibraryArtifact.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.bookLibrary.bookLibraryArtifact.entity.Book;

@Component
public class BookSeeder implements CommandLineRunner {

    @Autowired
    BookRepository bookRepository;

    @Override
    public void run(String... args) throws Exception {
        loadUserData();
    }

    //constructor
    private void loadUserData() {
        if (bookRepository.count() == 0) {
            Book book1 = new Book("Title1", "Publisher1", "Summary1");
            Book book2 = new Book("Title2", "Publisher2", "Summary2");
            bookRepository.save(book1);
            bookRepository.save(book2);
        }
        System.out.println(bookRepository.count());
    }
}
