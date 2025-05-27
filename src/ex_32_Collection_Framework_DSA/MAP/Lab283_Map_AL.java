package ex_32_Collection_Framework_DSA.MAP;

import java.util.*;

public class Lab283_Map_AL {
    public static void main(String[] args) {
        Map m = new HashMap();
        m.put("rollNo",1);
        m.put("name","Kasi");
        m.put("age",24);

        System.out.println(m);

        Map m2 = new LinkedHashMap();
        m2.put("rollNo",2);
        m2.put("name","Amar");
        m2.put("age",34);

        System.out.println(m2);

        Map m3 = new TreeMap();
        m3.put("rollNo",4);
        m3.put("name","reddy");
        m3.put("age",45);

        System.out.println(m3);


        List Student = new ArrayList();

        Student.add(m);
        Student.add(m2);
        Student.add(m3);
        System.out.println("Student\t" + Student);




    }
}
