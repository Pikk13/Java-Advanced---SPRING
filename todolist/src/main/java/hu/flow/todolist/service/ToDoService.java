package hu.flow.todolist.service;

import hu.flow.todolist.TodolistApplication;
import hu.flow.todolist.model.ToDo;
import hu.flow.todolist.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class ToDoService {

    @Autowired
    private ToDoRepository toDoRepository;


    public List<ToDo> listTodos() {
        return toDoRepository.findAll();
    }

    public List<ToDo> findByName(String name) {
        return toDoRepository.findByName(name);
    }

    public ToDo addtodo(ToDo toDoItem) {
        return toDoRepository.save(toDoItem);
    }

    public ToDo updateTodo(ToDo toDoItem) {
        return toDoRepository.save(toDoItem);
    }

    public void deleteToDo(Long id) {
        toDoRepository.deleteById(id);
    }

    public ToDo findToDoById(Long id) {
        Optional<ToDo> toDoOptional = toDoRepository.findById(id);

        if (toDoOptional.isPresent())
            return toDoOptional.orElse(null);
        return null;
    }


}