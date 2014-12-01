package net.daumkakao.todo.application.createtodo.usecase;

import net.daumkakao.shared.responders.UseCaseResponse;
import net.daumkakao.todo.domain.Todo;

public class CreateTodoResponse implements UseCaseResponse {
    public Todo todo;
}
