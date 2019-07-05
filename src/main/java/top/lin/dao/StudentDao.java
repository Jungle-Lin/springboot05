package top.lin.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import top.lin.entity.Student;

/**
 * Created by IntelliJ IDEA.
 * User: Jungle Lin
 * Date: 2019/7/4
 * Time: 17:51
 */
public interface StudentDao extends JpaRepository<Student, Integer> {
}
