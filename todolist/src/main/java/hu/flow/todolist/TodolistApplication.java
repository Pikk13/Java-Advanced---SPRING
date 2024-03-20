package hu.flow.todolist;

import hu.flow.todolist.model.SubTask;
import hu.flow.todolist.model.ToDo;
import hu.flow.todolist.repository.SubtaskRepository;
import hu.flow.todolist.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TodolistApplication {

    @Autowired
    private ToDoRepository toDoRepository;

    @Autowired
    private SubtaskRepository subtaskRepository;

    public static void main(String[] args) {
        SpringApplication.run(TodolistApplication.class, args);
    }

    @Bean
    public CommandLineRunner runner() {

        return args -> {

            if (toDoRepository.findAll().size() == 0) {
                ToDo todo = new ToDo("mosogatás", 99);
                ToDo todo2 = new ToDo("porszívózás", 100);

                toDoRepository.save(todo);
                toDoRepository.save(todo2);

                SubTask task1 = new SubTask("öblítés", 1, todo);
                SubTask task2 = new SubTask("súrolás", 2, todo);

                subtaskRepository.save(task1);
                subtaskRepository.save(task2);
            }
        };
    }
}
