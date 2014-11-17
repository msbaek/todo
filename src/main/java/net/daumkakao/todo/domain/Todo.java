package net.daumkakao.todo.domain;

import java.time.LocalDate;

public class Todo {
    private Long id;
    private LocalDate dueDate;
    private String name;

    public Todo(String name, LocalDate dueDate) {
        this.name = name;
        this.dueDate = dueDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
