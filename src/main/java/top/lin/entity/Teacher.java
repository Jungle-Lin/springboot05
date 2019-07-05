package top.lin.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Jungle Lin
 * Date: 2019/7/4
 * Time: 18:02
 */
@Getter
@Setter
@Entity
@Table(name = "teacher")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tid")
    private Integer id;

    @Column(name = "tname")
    private String name;

    @OneToMany(mappedBy = "teacher", fetch = FetchType.EAGER)
    private List<Student> studentList;

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
