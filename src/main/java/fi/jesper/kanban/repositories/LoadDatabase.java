package fi.jesper.kanban.repositories;

import fi.jesper.kanban.entities.Task;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase(TaskRepository repository) {
        return args -> {
            repository.save(new Task("Create Java backend"));
            repository.save(new Task("Integrate with frontend"));
        };
    }
}