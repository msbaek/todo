package net.daumkakao.todo.application.createtodo;

import net.daumkakao.shared.responders.UsecaseResponder;
import org.springframework.stereotype.Component;

import java.time.format.DateTimeFormatter;

@Component("createTodoResponder")
public class CreateTodoResponder implements UsecaseResponder<CreateTodoResponse, CreateTodoViewModel> {
    @Override
    public CreateTodoViewModel present(CreateTodoResponse response) {
        CreateTodoViewModel model = new CreateTodoViewModel();
        model.id = response.todo.getId().toString();
        model.name = response.todo.getName();
        model.dueDate = response.todo.getDueDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        return model;
    }
}
