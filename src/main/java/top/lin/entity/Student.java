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
 * Time: 17:49
 */
//@Data
@Getter
@Setter
@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sid")
    private Integer id;

    @Column(name = "sname")
    private String name;

    @OneToOne
    @JoinColumn(name = "addr_id", referencedColumnName = "aid")
    private Address address;

    @ManyToOne(targetEntity = Teacher.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "teacher_id", referencedColumnName = "tid")
    private Teacher teacher;


    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "score", joinColumns = {@JoinColumn(name = "sid", referencedColumnName = "sid")},
            inverseJoinColumns = {@JoinColumn(name = "cid", referencedColumnName = "cid")})
    private List<Course> courses;

//    @ManyToOne
//    @JoinColumn(name = "")


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", teacher=" + teacher +
                ", courses=" + "" +
                '}';
    }
}
