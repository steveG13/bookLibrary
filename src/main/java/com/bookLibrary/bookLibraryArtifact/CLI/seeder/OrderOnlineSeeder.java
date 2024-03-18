package com.bookLibrary.bookLibraryArtifact.CLI.seeder;//package com.bookLibrary.bookLibraryArtifact.CLI.seeder;

import com.bookLibrary.bookLibraryArtifact.CLI.repository.OrderOnlineRepository;
import com.bookLibrary.bookLibraryArtifact.entity.OrderOnline;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class OrderOnlineSeeder implements CommandLineRunner {

    @Autowired
    OrderOnlineRepository orderOnlineRepository;

    @Override
    public void run(String... args) throws Exception {
        loadUserData();
    }

    //constructor
    private void loadUserData() {
        if (orderOnlineRepository.count() == 0) {
            OrderOnline orderOnline1 = new OrderOnline();
            OrderOnline orderOnline2 = new OrderOnline();
            orderOnlineRepository.save(orderOnline1);
            orderOnlineRepository.save(orderOnline2);
        }
        System.out.println(orderOnlineRepository.count());
    }
}
