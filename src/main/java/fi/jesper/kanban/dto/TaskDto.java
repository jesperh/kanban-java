package fi.jesper.kanban.dto;

import fi.jesper.kanban.enums.ColumnType;

public class TaskDto {

    public TaskDto() {
    }

    private Integer id;
    private String name;
    private ColumnType status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ColumnType getStatus() {
        return status;
    }

    public void setStatus(ColumnType status) {
        this.status = status;
    }
}
