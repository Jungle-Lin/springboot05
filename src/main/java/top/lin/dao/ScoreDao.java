package top.lin.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import top.lin.entity.Score;

/**
 * Created by IntelliJ IDEA.
 * User: Jungle Lin
 * Date: 2019/7/4
 * Time: 17:57
 */
public interface ScoreDao extends JpaRepository<Score, Integer> {
}
