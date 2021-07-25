package spring5.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring5.autowire.Emp;
import spring5.bean.Person;
import spring5.collectiontype.Book;
import spring5.collectiontype.Course;
import spring5.collectiontype.Student;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author YANG
 * @create 2021-07-24 13:04
 */
public class Test {

    @org.junit.Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Student student = context.getBean("student", Student.class);
        student.test();
    }

    @org.junit.Test
    public void test1(){
        ApplicationContext context =new ClassPathXmlApplicationContext("bean2.xml");
        Book book = context.getBean("book", Book.class);
        Book book1 = context.getBean("book", Book.class);
        System.out.println(book);
        System.out.println(book1);
    }

    @org.junit.Test
    public void test2(){
        ApplicationContext context =new ClassPathXmlApplicationContext("bean2.xml");
        Course mybean = context.getBean("mybean", Course.class);
        System.out.println(mybean);
    }

    @org.junit.Test
    public void testbean(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        Person person = context.getBean("person", Person.class);
        System.out.println("第四步 获取创建 bean 实例对象");
        context.close();
    }

    @org.junit.Test
    public void testAutowire(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
    }

    @org.junit.Test
    public void test12() throws SQLException {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");
        DataSource dataSource = context.getBean("dataSource", DataSource.class);
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
    }
}
