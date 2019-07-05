package top.lin.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import top.lin.entity.Teacher;

/**
 * Created by IntelliJ IDEA.
 * User: Jungle Lin
 * Date: 2019/7/4
 * Time: 19:01
 */
public interface TeacherDao extends JpaRepository<Teacher, Integer> {
}
