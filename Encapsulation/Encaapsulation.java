/**
 * Encaapsulation
 */
/**
 * InnerEncaapsulation
 */
class PersanalInfo {

    private String name;

    private float salary;

    private String campany;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return this.salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public String getCampany() {
        return this.campany;
    }

    public void setCompany(String campany) {
        this.campany = campany;
    }

}

public class Encaapsulation extends PersanalInfo {

    public static void main(String[] args) {

        PersanalInfo obj = new PersanalInfo();

        obj.setName("Kiran");
        obj.setSalary(25000f);
        obj.setCompany("LinkCode");

        System.out.println(obj.getName());
        System.out.println(obj.getSalary());
        System.out.println(obj.getCampany());
    }
}