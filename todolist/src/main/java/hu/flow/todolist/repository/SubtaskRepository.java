package hu.flow.todolist.repository;

import hu.flow.todolist.model.SubTask;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubtaskRepository extends JpaRepository <SubTask, Long> {


}
