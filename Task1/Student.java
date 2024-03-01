package Task1;

public class Student {
    private String name;
    private String email;
    private String CNIC;
    private Course course1;
    private Course course2;
    private Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCNIC() {
        return CNIC;
    }

    public void setCNIC(String CNIC) {
        this.CNIC = CNIC;
    }

    public Course getCourse1() {
        return course1;
    }

    public void setCourse1(Course course1) {
        this.course1 = course1;
    }

    public Course getCourse2() {
        return course2;
    }

    public void setCourse2(Course course2) {
        this.course2 = course2;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Student(String name,String CNIC, Address address) {
        setName(name);
        setCNIC(CNIC);
        setAddress(address);
    }
}
