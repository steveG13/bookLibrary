//package com.bookLibrary.bookLibraryArtifact.CLI.seeder;
//
//import com.bookLibrary.bookLibraryArtifact.CLI.repository.BookRepository;
//import com.bookLibrary.bookLibraryArtifact.entity.Book;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//public class CommentSeeder implements CommandLineRunner {
//
//    @Autowired
//    BookRepository bookRepository;
//
//    @Override
//    public void run(String... args) throws Exception {
//        loadUserData();
//    }
//
//    private void loadUserData() {
//        if (bookRepository.count() == 0) {
//            Book book1 = new Book("Title1", "Publisher1", "Summary1");
//            Book book2 = new Book("Title2", "Publisher2", "Summary2");
//            bookRepository.save(book1);
//            bookRepository.save(book2);
//        }
//        System.out.println(bookRepository.count());
//    }
//}