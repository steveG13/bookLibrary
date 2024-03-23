package com.bookLibrary.bookLibraryArtifact.CLI.seeder;//package com.bookLibrary.bookLibraryArtifact.CLI.seeder;

import com.bookLibrary.bookLibraryArtifact.repository.RolesRepository;
import com.bookLibrary.bookLibraryArtifact.entity.Roles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RolesSeeder implements CommandLineRunner {

    @Autowired
    RolesRepository rolesRepository;

    @Override
    public void run(String... args) throws Exception {
        loadUserData();
    }

    //constructor
    private void loadUserData() {
        if (rolesRepository.count() == 0) {
            Roles role1 = new Roles("Admin");
            Roles role2 = new Roles("Base User");
            rolesRepository.save(role1);
            rolesRepository.save(role2);
        }
        System.out.println(rolesRepository.count());
    }
}
