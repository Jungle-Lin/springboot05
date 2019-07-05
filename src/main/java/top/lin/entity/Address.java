package top.lin.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by IntelliJ IDEA.
 * User: Jungle Lin
 * Date: 2019/7/4
 * Time: 17:44
 */

@Data
@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "aid")
    private Integer id;

    @Column(name = "aname")
    private String name;
}
