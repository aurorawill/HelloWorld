package study2;

public class Student2 {
    public int age;
    private String name;
    public Student2(){}
    public Student2(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                '}';
    }
}
