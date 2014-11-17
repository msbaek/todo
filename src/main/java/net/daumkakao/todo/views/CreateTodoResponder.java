package net.daumkakao.todo.views;

import net.daumkakao.shared.responders.UsecaseResponder;
import net.daumkakao.todo.interactor.CreateTodoResponse;
import org.springframework.stereotype.Component;

import java.time.format.DateTimeFormatter;

@Component("createTodoResponder")
public class CreateTodoResponder implements UsecaseResponder<CreateTodoResponse, CreateTodoViewModel> {
    @Override
    public CreateTodoViewModel present(CreateTodoResponse response) {
        CreateTodoViewModel model = new CreateTodoViewModel();
        model.id = response.id.toString();
        model.name = response.name;
        model.dueDate = response.dueDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        return model;
    }
}
