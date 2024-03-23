package com.bookLibrary.bookLibraryArtifact.CLI.seeder;//package com.bookLibrary.bookLibraryArtifact.CLI.seeder;

import com.bookLibrary.bookLibraryArtifact.repository.UsersRepository;
import com.bookLibrary.bookLibraryArtifact.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.time.LocalDate;

@Component
public class UsersSeeder implements CommandLineRunner {

    @Autowired
    UsersRepository usersRepository;

    @Override
    public void run(String... args) throws Exception {
        loadUserData();
    }

    //constructor
    private void loadUserData() {
        if (usersRepository.count() == 0) {
            Users user1 = new Users("randomUser1", "user1@user.com", "####", "User1", "Inactive", LocalDate.of(1982, 9, 20), "Female", "26");
            Users user2 = new Users("randomUser2", "user2@user.com", "####", "User2", "Active",  LocalDate.of(1982, 8, 21), "Male", "27");
            usersRepository.save(user1);
            usersRepository.save(user2);
        }
        System.out.println(usersRepository.count());
    }
}
