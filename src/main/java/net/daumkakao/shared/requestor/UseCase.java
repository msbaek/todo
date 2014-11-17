package net.daumkakao.shared.requestor;

import net.daumkakao.shared.responders.UseCaseResponse;
import net.daumkakao.todo.interactor.CreateTodoRequest;

public interface UseCase<T extends CreateTodoRequest, S extends UseCaseResponse> {
    S execute(T request);
}
