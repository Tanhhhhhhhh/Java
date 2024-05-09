package Chuong4;

import java.util.ArrayList;
public class Slide17Chuong4 {
public static void main(String[] args) {
    // khai bao 1 ArrayList co ten la arrListString
    //  co kieu la String
    ArrayList<String> arrayListString = new ArrayList<>();
    // them cac phan tu su dung phuong thuc add()
    arrayListString.add("JAVA");
    arrayListString.add("PHP");
    arrayListString.add("C#");
    arrayListString.add("C++");
    /*
     * duyet theo kich thuoc cua arrListString
     * su dung vong lap for thong thuong
     * phuong thuc  arrListString.size() se tra ve so phan tu cua arrListString
     * va sau do lay phan tu tai vi tri thu i thong qua ham get()
     * sau do hien thi gia tri cua phan tu do ra 
     */
    System.out.println("Cac phan tu co trong arrListString la:");
    for(int i = 0;i < arrayListString.size();i++){
        System.out.println(arrayListString.get(i)+ "\t");
    }
}
}
