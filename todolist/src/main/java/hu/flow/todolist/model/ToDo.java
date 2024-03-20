package hu.flow.todolist.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class ToDo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private int priority;

    @OneToMany(mappedBy = "todo")
    private List<SubTask> subTasks;

    public ToDo() {
    }



    public ToDo(String name, int priority) {

        this.name = name;
        this.priority = priority;
    }

    public List<SubTask> getSubTasks() {
        return subTasks;
    }

    public void setSubTasks(List<SubTask> subTasks) {
        this.subTasks = subTasks;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "ToDo{" +
                "name='" + name + '\'' +
                ", priority=" + priority +
                '}';
    }
}
