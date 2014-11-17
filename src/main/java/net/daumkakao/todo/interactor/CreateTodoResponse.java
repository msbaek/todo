package net.daumkakao.todo.interactor;

import net.daumkakao.shared.responders.UseCaseResponse;

import java.time.LocalDate;

public class CreateTodoResponse implements UseCaseResponse {
    public Long id;
    public String name;
    public LocalDate dueDate;
}
