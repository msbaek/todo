package net.daumkakao.todo.interactor;

import net.daumkakao.shared.responders.UseCaseResponse;
import net.daumkakao.todo.domain.Todo;

import java.time.LocalDate;

public class CreateTodoResponse implements UseCaseResponse {
    public Todo todo;
}
