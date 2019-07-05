package top.lin.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import top.lin.entity.Address;

/**
 * Created by IntelliJ IDEA.
 * User: Jungle Lin
 * Date: 2019/7/4
 * Time: 17:46
 */
public interface AddressDao extends JpaRepository<Address, Integer> {
}
