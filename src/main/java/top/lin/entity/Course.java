package top.lin.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Jungle Lin
 * Date: 2019/7/4
 * Time: 19:08
 */
@Entity
@Table(name = "course")
@Data
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cid")
    private Integer id;

    @Column(name = "cname")
    private String name;

    @ManyToMany(mappedBy = "courses", fetch = FetchType.EAGER)
    private List<Student> students;

}
