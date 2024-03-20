package hu.flow.todolist.repository;

import hu.flow.todolist.model.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.List;

public interface ToDoRepository extends JpaRepository<ToDo, Long > {

//    @Query(nativeQuery = true, value = "select * from ToDo where name = ?1")

    List<ToDo> findByName (String name);




}
