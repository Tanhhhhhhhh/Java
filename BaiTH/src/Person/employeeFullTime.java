package Person;

import java.util.Scanner;

public class employeeFullTime extends employee {
    public int day;
    public int year;
    Scanner sc = new Scanner(System.in);
 
    public employeeFullTime()
    {
        position = "Full time";
        day = 0;
        year = 0;
    }
    public void EnterData ()
    {
        super.EnterData();
        System.out.print("So nam lam viec : ");
        year = sc.nextInt();
        System.out.print("So ngay lam viec: ");
        day = sc.nextInt();
    }
    public void salary()
    {
        if (year<2)
            salary = salary * day * 11 + 10000;
        else if (year<5) {
            salary = salary * day * 11 + 30000;
        }
        else 
            salary = salary * day * 11 + 50000;
    }
    public void Display ()
    {
        super.Display();
        System.out.println("So nam lam viec : " + year);
    }
}
    
