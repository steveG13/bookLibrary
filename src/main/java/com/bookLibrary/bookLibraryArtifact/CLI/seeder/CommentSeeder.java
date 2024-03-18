package com.bookLibrary.bookLibraryArtifact.CLI.seeder;

import com.bookLibrary.bookLibraryArtifact.CLI.repository.CommentRepository;
import com.bookLibrary.bookLibraryArtifact.entity.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
public class CommentSeeder implements CommandLineRunner {

    @Autowired
    CommentRepository commentRepository;

    @Override
    public void run(String... args) throws Exception {
        loadUserData();
    }

    //constructor
    private void loadUserData() {
        if (commentRepository.count() == 0) {
            Comment comment1 = new Comment(LocalDateTime.of(2018,9,1,9,1,15), LocalDateTime.of(2019,9,1,9,1,15));
            Comment comment2 = new Comment(LocalDateTime.of(2020,9,1,9,1,15), LocalDateTime.of(2021,9,1,9,1,15));
            commentRepository.save(comment1);
            commentRepository.save(comment2);
        }
        System.out.println(commentRepository.count());
    }
}
