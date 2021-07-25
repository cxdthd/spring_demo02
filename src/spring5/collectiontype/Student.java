package spring5.collectiontype;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author YANG
 * @create 2021-07-24 12:14
 */
public class Student {
    private String[] arr;
    private List<String> list;
    private Map<String,String> map;
    private Set<String> set;

    private List<Course> courseList;
    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public void setArr(String[] arr) {
        this.arr = arr;
    }
    public void setList(List<String> list) {
        this.list = list;
    }
    public void setMap(Map<String, String> map) {
        this.map = map;
    }
    public void setSet(Set<String> set) {
        this.set = set;
    }


    public void test(){
        System.out.println(Arrays.toString(arr));
        System.out.println(list);
        System.out.println(map);
        System.out.println(set);
        System.out.println(courseList);
    }
}
