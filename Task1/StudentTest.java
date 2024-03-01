package Task1;
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
