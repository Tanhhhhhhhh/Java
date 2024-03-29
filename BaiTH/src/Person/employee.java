package Person;

import java.util.Scanner;

public class employee extends person {
    public String position;
    public double salary = 2000;
    public String IDEmployee;
    Scanner sc = new Scanner(System.in);
        public employee() 
    {
        IDEmployee = "";
        position = "";
    }
    public void xuatvitri()
    {
        System.out.println("---" + position + "---");
    }
    public void EnterData()
    {
        super.EnterData();
        System.out.print("ID nhan vien: ");
        IDEmployee = sc.nextLine();
    }
    public void Display()
    {
        super.Display();
        System.out.println("ID nhan vien: " + IDEmployee);
        System.out.println("Luong: " + salary + "VND");
    }
    
}
