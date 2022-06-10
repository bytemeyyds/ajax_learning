package ajax.servlet;

public class Student {
    private String no;
    private String name;
    private String age;
    private String address;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Student(String no, String name, String age, String address) {
        this.no = no;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Student() {
    }
}
