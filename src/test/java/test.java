import com.baizhi.dao.StudentDAO;
import com.baizhi.entity.Student;
import com.baizhi.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void test1() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentService studentService= (StudentService) ac.getBean("studentService");
        Student student = new Student("2", "小小", 20, "女");
        /* studentDAO.insert(student);*/
      // studentDAO.delete("3");
        studentService.update(student);
    }

}
