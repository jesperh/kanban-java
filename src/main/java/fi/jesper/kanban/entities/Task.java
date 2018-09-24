package fi.jesper.kanban.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "users")
public class Task {

    public Task(String name) {

    }

    public class User {

        @Id  @GeneratedValue
        private Integer id;
        @Column(nullable = false)
        private String name;
        private Date createdDate;
    }
}
