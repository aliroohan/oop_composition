public class Test {
    public static void main(String[] args) {
        Date d1 = new Date(1, 1, 2020);
        Date d2 = new Date(12, 10, 2000);
        Employee e = new Employee("John", 1, d1, d2);
        System.out.println(e.getHireDate().getYear());
        e.getHireDate().setYear(2010);
        System.out.println(e.getHireDate().getYear());
    }
}
