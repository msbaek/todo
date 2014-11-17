package net.daumkakao.todo.interactor;

import net.daumkakao.shared.requestor.UseCase;
import net.daumkakao.todo.domain.Todo;
import net.daumkakao.todo.domain.TodoRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Service("createTodoUsecase")
public class CreateTodoUsecase implements UseCase<CreateTodoRequest, CreateTodoResponse> {
    @Resource(name = "todoRepository")
    TodoRepository todoRepository;
    private DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    @Override
    public CreateTodoResponse execute(CreateTodoRequest request) {
        Todo todo = new Todo(request.name, LocalDate.parse(request.dueDate, fmt));
        todoRepository.save(todo);
        CreateTodoResponse response = new CreateTodoResponse();
        response.id = todo.getId();
        response.name = todo.getName();
        response.dueDate = todo.getDueDate();
        return response;
    }
}
