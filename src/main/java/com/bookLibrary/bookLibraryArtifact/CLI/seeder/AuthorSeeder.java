package com.bookLibrary.bookLibraryArtifact.CLI.seeder;

import com.bookLibrary.bookLibraryArtifact.CLI.repository.AuthorRepository;
import com.bookLibrary.bookLibraryArtifact.entity.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AuthorSeeder implements CommandLineRunner {

    @Autowired
    AuthorRepository authorRepository;

    @Override
    public void run(String... args) throws Exception {
        loadUserData();
    }

    //constructor
    private void loadUserData() {
        if (authorRepository.count() == 0) {
            Author author1 = new Author("firstName1", "lastName1", "bio1");
            Author author2 = new Author("firstName2", "lastName2", "bio2");
            authorRepository.save(author1);
            authorRepository.save(author2);
        }
        System.out.println(authorRepository.count());
    }
}
