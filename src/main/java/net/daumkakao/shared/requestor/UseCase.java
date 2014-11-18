package net.daumkakao.shared.requestor;

import net.daumkakao.shared.responders.UseCaseResponse;

public interface UseCase<T extends UseCaseRequest, S extends UseCaseResponse> {
    S execute(T request);
}
