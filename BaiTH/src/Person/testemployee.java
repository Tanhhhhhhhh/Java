package Person;

public class testemployee {
    public static void main(String[] args) {
        employeePartTime ep = new employeePartTime();
        ep.xuatvitri();
        ep.EnterData();
        ep.salary();
        ep.Display();
        employeeFullTime ef = new employeeFullTime();
        ef.xuatvitri();
        ef.EnterData();
        ef.salary();
        ef.Display();

    }
}
