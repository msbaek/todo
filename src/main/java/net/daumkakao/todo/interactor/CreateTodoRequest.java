package net.daumkakao.todo.interactor;

import net.daumkakao.shared.requestor.UseCaseRequest;

public class CreateTodoRequest implements UseCaseRequest {
    public String name;
    public String dueDate;

    public CreateTodoRequest(String name, String dueDate) {
        this.name = name;
        this.dueDate = dueDate;
    }
}
