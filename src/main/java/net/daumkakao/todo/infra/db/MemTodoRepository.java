package net.daumkakao.todo.infra.db;

import net.daumkakao.todo.domain.Todo;
import net.daumkakao.todo.domain.TodoRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository("todoRepository")
public class MemTodoRepository implements TodoRepository {
    private final AtomicLong counter = new AtomicLong();
    private List<Todo> todos = new ArrayList<Todo>();

    @Override
    public void save(Todo todo) {
        todo.setId(counter.incrementAndGet());
        todos.add(todo);
    }
}
