import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
 class Employee {
     int id;String name;int sal;


    public Employee(int eid, String ename, int esalary) {
        this.id = eid;
        this.name = ename;
        this.sal = esalary;



    }
    public String toString(){
        return this.id +" " + this.name + " " +this.sal;
    }
    public static class employee implements Comparator<Employee> {
        public int compare(Employee a, Employee b) {
            return a.sal - b.sal;
        }
    }


    static class GenericInteger {
        public static void main(String[] args) {
            List<Employee> ls = new ArrayList<Employee>();
            ls.add(new Employee(01, "uttkarsh", 360000));
            ls.add(new Employee(04, "ayush", 340000));
            ls.add(new Employee(03, "sahas", 500000));
            ls.add(new Employee(05, "rohit", 440000));
            System.out.println("Unsorted");
            System.out.println(ls);
            /*for (int i = 0; i < ls.size(); i++)
                System.out.println(ls.get(i));
*/
            Collections.sort(ls, new employee());
            System.out.println(ls);}}}

            /*System.out.println("\nSorted by rollno");
            for (int i = 0; i < ls.size(); i++)
                System.out.println(ls.get(i));
        }
    }
}
*/
