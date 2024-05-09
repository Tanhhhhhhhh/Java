package Chuong4;

import java.util.ArrayList;
import java.util.Iterator;

public class Slide19Chuong4 {
    public static void main(String[] args) {
        ArrayList<Float> arrListFloat = new ArrayList<>();
        arrListFloat.add(0.7f);
        arrListFloat.add(7.26f);
        arrListFloat.add(1.02f);
        arrListFloat.add(9.3f);
        // khai bao mot iterrator bang kieu Float
        Iterator<Float> iterator = arrListFloat.iterator();
        System.out.println("Cac phan tu co trong arrListString la: ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + "\t");
            
        }
    }
}
