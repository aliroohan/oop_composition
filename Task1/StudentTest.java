package Task1;

class Address {
    private String street;
    private String town;
    private String city;
    private String country;
    private PhoneNumber phoneNumber;

    public Address(String street, String town, String city, String country, PhoneNumber phoneNumber) {
        setStreet(street);
        setTown(town);
        setCity(city);
        setCountry(country);
        setPhoneNumber(phoneNumber);
    }
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}


class Course {
    private String courseCode;
    private String courseTitle;

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
    
    public String getCourseCode() {
        return courseCode;
    }
    
    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }
    
    public String getCourseTitle() {
        return courseTitle;
    }
}


class PhoneNumber {
    private String countryCode;
    private String cityCode;
    private String lineNumber;

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
    }
    public PhoneNumber(String countryCode, String cityCode, String lineNumber) {
        setCountryCode(countryCode);
        setCityCode(cityCode);
        setLineNumber(lineNumber);
        
    }
}


class Student {
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


public class StudentTest {
    public static void main(String[] args) {
    Student student1 = new Student("Ali", "12345-1234567-1", new Address("Street 1", "Town 1", "City 1", "Country 1", new PhoneNumber("92", "51", "1234567")));
    Student student2 = new Student("Ahmad", "55553-1234522-1", student1.getAddress());
   
    student1.setCourse1(new Course());
    student1.getCourse1().setCourseCode("CS101");
    student1.getCourse1().setCourseTitle("Introduction to Computing");
    student1.setCourse2(new Course());
    student1.getCourse2().setCourseCode("CS102");
    student1.getCourse2().setCourseTitle("Programming Fundamentals");
    student1.setEmail("hello@gmail.com");
   
    student2.setCourse1(student1.getCourse1());
    student2.setCourse2(student1.getCourse2());
    student2.setEmail("hi@gmail.com");

    System.out.println("Student 1");
    System.out.println("Name: " + student1.getName());
    System.out.println("CNIC: " + student1.getCNIC());
    System.out.println("Address: " + student1.getAddress().getStreet() + ", " + student1.getAddress().getTown() + ", " + student1.getAddress().getCity() + ", " + student1.getAddress().getCountry());
    System.out.println("Phone: " + student1.getAddress().getPhoneNumber().getCountryCode() + "-" + student1.getAddress().getPhoneNumber().getCityCode() + "-" + student1.getAddress().getPhoneNumber().getLineNumber());
    System.out.println("Course 1: " + student1.getCourse1().getCourseCode() + " " + student1.getCourse1().getCourseTitle());   
    System.out.println("Course 2: " + student1.getCourse2().getCourseCode() + " " + student1.getCourse2().getCourseTitle());
    
    System.out.println("Student 2");
    System.out.println("Name: " + student2.getName());
    System.out.println("CNIC: " + student2.getCNIC());
    System.out.println("Address: " + student2.getAddress().getStreet() + ", " + student2.getAddress().getTown() + ", " + student2.getAddress().getCity() + ", " + student2.getAddress().getCountry());
    System.out.println("Phone: " + student2.getAddress().getPhoneNumber().getCountryCode() + "-" + student2.getAddress().getPhoneNumber().getCityCode() + "-" + student2.getAddress().getPhoneNumber().getLineNumber());
    System.out.println("Course 1: " + student2.getCourse1().getCourseCode() + " " + student2.getCourse1().getCourseTitle());   
    System.out.println("Course 2: " + student2.getCourse2().getCourseCode() + " " + student2.getCourse2().getCourseTitle());


}
}
