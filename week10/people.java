package week10;

import java.util.ArrayList;

public class people {
    public static void printDepartment(ArrayList<person> people) {
        for(int i = 0; i < people.size(); i++) {
          System.out.println(people.get(i));
          System.out.println("");
        }
      }
      public static void main(String[] args) {
        person p1 = new person("Pekka Rollins", "Street 701");
        student s1 = new student("Esko Ukkonen", "Cesta 1", 32);
        Teacher t1 = new Teacher("Adnan Miljkovic", "Sarajevska", 500000);
    
        s1.study();
    
        ArrayList<person> people = new ArrayList<person>();
    
        people.add(p1);
        people.add(s1);
        people.add(t1);
    
        printDepartment(people);
      }
}
