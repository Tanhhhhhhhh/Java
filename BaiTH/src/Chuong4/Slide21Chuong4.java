package Chuong4;

import java.util.ArrayList;

public class Slide21Chuong4 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>(3);
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        System.out.println(colors.get(1));
        System.out.println(colors.contains("Blue"));
        System.out.println(colors.size());
        System.out.println(colors);
        }
}
