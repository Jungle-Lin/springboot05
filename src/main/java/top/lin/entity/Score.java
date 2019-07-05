package top.lin.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Jungle Lin
 * Date: 2019/7/4
 * Time: 17:53
 */
@Data
@Entity
@Table(name = "score")
public class Score {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "scid")
    private Integer id;

    private Integer scores;

//    @OneToMany
//    @JoinColumn(name = "sid", referencedColumnName = "sid")
//    private List<Student> students;
}
