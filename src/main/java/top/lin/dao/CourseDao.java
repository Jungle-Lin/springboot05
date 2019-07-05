package top.lin.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import top.lin.entity.Course;

/**
 * Created by IntelliJ IDEA.
 * User: Jungle Lin
 * Date: 2019/7/4
 * Time: 19:34
 */
public interface CourseDao extends JpaRepository<Course, Integer> {
}
