package net.daumkakao.todo.controllers;

import net.daumkakao.shared.requestor.UseCase;
import net.daumkakao.shared.responders.UsecaseResponder;
import net.daumkakao.todo.interactor.CreateTodoRequest;
import net.daumkakao.todo.interactor.CreateTodoResponse;
import net.daumkakao.todo.views.CreateTodoViewModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class TodoController {
    @Resource(name = "createTodoUsecase")
    private UseCase<CreateTodoRequest, CreateTodoResponse> usecase;

    @Resource(name = "createTodoResponder")
    private UsecaseResponder<CreateTodoResponse, CreateTodoViewModel> usecaseResponder;

    @RequestMapping(value = "/todo", method = RequestMethod.POST)
    public @ResponseBody CreateTodoViewModel createTodo(
            @RequestParam(value="name", required=true) String name,
            @RequestParam(value="dueDate", required=true) String dueDate) {
        CreateTodoRequest request = new CreateTodoRequest(name, dueDate);
        CreateTodoResponse response = usecase.execute(request);
        return usecaseResponder.present(response);
    }
}
