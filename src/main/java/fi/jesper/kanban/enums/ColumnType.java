package fi.jesper.kanban.enums;

public enum  ColumnType {
    TODO("TODO"),
    INPROGRESS("In Progress"),
    DONE("Done");

    private String name;

    ColumnType(String name) {
        this.name = name;
    }

    public String getText() {
        return this.name;
    }

    public static ColumnType fromString(String name) {
        for (ColumnType b : ColumnType.values()) {
            if (b.name.equalsIgnoreCase(name)) {
                return b;
            }
        }
        return null;
    }
}
