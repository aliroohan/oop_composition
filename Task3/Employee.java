public class Employee {
    private String name;
    private int id;
    private Date hireDate;
    private Date birthDate;

    public Employee(String name, int id, Date hireDate, Date birthDate){
        this.name = name;
        this.id = id;
        this.hireDate = hireDate;
        this.birthDate = birthDate;
    }
    
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
