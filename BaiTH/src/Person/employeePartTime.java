package Person;

public class employeePartTime extends employee {
    public int hour;
    public employeePartTime()
    {
        position = "Part time";
        hour = 0;
    }
    public void EnterData()
    {
        super.EnterData();
        System.out.print("So gio lam viec: ");
        hour = sc.nextInt();
    }
    public void salary()
    {
        salary *= hour;
    }
    public void Display()
    {
        super.Display();
    }



    
}
