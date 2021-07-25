package spring5.bean;

import org.springframework.beans.factory.FactoryBean;
import spring5.collectiontype.Course;

/**
 * @author YANG
 * @create 2021-07-24 16:18
 */
public class Mybean implements FactoryBean<Course> {
    @Override
    public Course getObject() throws Exception {
        return new Course();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
