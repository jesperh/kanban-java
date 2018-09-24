package fi.jesper.kanban.repositories;

import fi.jesper.kanban.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {

}