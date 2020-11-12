import java.util.Objects;

import static java.lang.System.out;

public class DemoCompare {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "name 1");
        Employee employee2 = new Employee(1, "name 1");

        if(employee1.equals(employee2)) {
            out.println("OK");
        } else {
            out.println("NOT OK");
        }
    }
}

class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
