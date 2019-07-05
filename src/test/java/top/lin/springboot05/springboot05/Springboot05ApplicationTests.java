package top.lin.springboot05.springboot05;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.lin.dao.*;
import top.lin.entity.*;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot05ApplicationTests {

    @Autowired
    AddressDao addressDao;
    @Autowired
    StudentDao studentDao;

    @Autowired
    ScoreDao scoreDao;

    @Autowired
    TeacherDao teacherDao;

    @Autowired
    CourseDao courseDao;

    @Test
    public void contextLoads() {

        List<Course> all = courseDao.findAll();
        System.out.println(all);

//        List<Teacher> all = teacherDao.findAll();
//        System.out.println(all);

//        List<Score> all = scoreDao.findAll();
//        System.out.println(all);


//        List<Student> all = studentDao.findAll();
//        System.out.println(all);

//        List<Address> all = addressDao.findAll();
//        System.out.println(all);
    }

}
