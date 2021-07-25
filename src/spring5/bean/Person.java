package spring5.bean;

/**
 * @author YANG
 * @create 2021-07-25 15:26
 */
public class Person {
    private String name;

    public Person() {
        System.out.println("第一步 执行无参数构造创建 bean 实例");
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("第二步 调用 set 方法设置属性值");
    }


    public void initMethod(){
        System.out.println("第三步 执行初始化的方法");
    }
    public void destroyMethod(){
        System.out.println("第五步 执行销毁的方法");
    }

}
