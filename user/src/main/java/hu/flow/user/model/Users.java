package hu.flow.user.model;

import jakarta.persistence.*;


@Entity
@Table(name = "t_user")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String fullName;

    @Enumerated(EnumType.STRING)
    private Rights rights;
    private int points;

    public Users(String name, String fullName, Rights rights, int points) {
        this.name = name;
        this.fullName = fullName;
        this.rights = rights;
        this.points = points;
    }

    public Users() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Rights getRights() {
        return rights;
    }

    public void setRights(Rights rights) {
        this.rights = rights;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fullName='" + fullName + '\'' +
                ", rights=" + rights +
                ", points=" + points +
                '}';
    }
}
