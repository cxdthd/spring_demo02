package spring5.collectiontype;


/**
 * @author YANG
 * @create 2021-07-24 15:19
 */
public class Course {
    private String courseName;
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                '}';
    }
}
