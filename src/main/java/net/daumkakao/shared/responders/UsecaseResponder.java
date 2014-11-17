package net.daumkakao.shared.responders;

public interface UsecaseResponder<T extends UseCaseResponse, S> {
    S present(T response);
}
