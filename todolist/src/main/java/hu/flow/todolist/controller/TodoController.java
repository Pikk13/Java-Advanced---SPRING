package hu.flow.todolist.controller;

import hu.flow.todolist.model.ToDo;
import hu.flow.todolist.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/todo")
public class TodoController {

    @Autowired
    private ToDoService toDoService;


    List<ToDo> toDoList = new ArrayList<>();

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public Object addTodo(@RequestBody ToDo todoItem){
    return toDoService.addtodo(todoItem);
    }

    @GetMapping("/findByName/{name}")
    public List<ToDo> findToDoById(@PathVariable String name){
       return toDoService.findByName(name);
    }



    @GetMapping("/list")
    public List<ToDo> listTodos(){

        return toDoService.listTodos();
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
       toDoService.deleteToDo(id);
    }



}
