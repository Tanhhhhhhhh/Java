package Person;

import java.util.Scanner;

public class person {
    Scanner sc = new Scanner(System.in);
    public String FullName;
    public String Address;
    public int Age;
    public int PhoneNumber;
    public person(){
        FullName = " ";
        Address =" ";
        Age = 0;
        PhoneNumber = 0;

    }
    public void EnterData()
    {
        System.out.print("Ho va ten: ");
        FullName = sc.nextLine();
        System.out.print("Tuoi: ");
        Age = sc.nextInt();
        System.out.print("Dia chi: ");
        Address = sc.next();
        System.out.print("So dien thoai: ");
        PhoneNumber = sc.nextInt();
    }
    public void Display()
    {
        System.out.println("Ho va ten: " + FullName);
        System.out.println("Tuoi: " + Age);
        System.out.println("Dia chi: " + Address);
        System.out.println("So dien thoai: " + PhoneNumber);
    }
}
