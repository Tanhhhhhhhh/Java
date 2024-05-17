package Chuong4;

import java.util.TreeMap;
import java.util.Set;
import java.util.Map;

public class Slide106Chuong4 {
    public static void main(String[] args) {
        TreeMap<Integer, Character> treeMap = new TreeMap<>();
        treeMap.put(6, 'A');
        treeMap.put(5, 'B');
        treeMap.put(1, 'C');
        treeMap.put(2, 'D');
        Set<Map.Entry<Integer, Character>> setTreeMap = treeMap.entrySet();
        System.out.println("Cac entry co trong setTreeMap: ");
        System.out.println(setTreeMap);
    }
}
