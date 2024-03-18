package com.bookLibrary.bookLibraryArtifact.CLI.seeder;//package com.bookLibrary.bookLibraryArtifact.CLI.seeder;

import com.bookLibrary.bookLibraryArtifact.CLI.repository.GenreRepository;
import com.bookLibrary.bookLibraryArtifact.entity.Genre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class GenreSeeder implements CommandLineRunner {

    @Autowired
    GenreRepository genreRepository;

    @Override
    public void run(String... args) throws Exception {
        loadUserData();
    }

    //constructor
    private void loadUserData() {
        if (genreRepository.count() == 0) {
            Genre genre1 = new Genre("Mystery");
            Genre genre2 = new Genre("War");
            genreRepository.save(genre1);
            genreRepository.save(genre2);
        }
        System.out.println(genreRepository.count());
    }
}
