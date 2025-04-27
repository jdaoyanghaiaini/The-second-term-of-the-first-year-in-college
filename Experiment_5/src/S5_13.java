import java.util.Comparator;
import java.util.Objects;
import java.util.TreeSet;

public class S5_13 {
    public static void main(String[] args) {
        TreeSet<Student> set = new TreeSet();
        Student p1 = new Student("zhangsan",97.4);
        Student p2 = new Student("lisi",93.4);
        Student p3 = new Student("xiaohua",95.4);
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);
    }
}
class Student implements Comparable<Student>{
    private String name;
    private double score;

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public boolean equals(Object o) {
       if(!(o instanceof Student))
           return false;
       if(o == null)
           return false;
       else if(this.name.equals(((Student) o).name) && this.score==((Student) o).score)
           return true;
       else
           return false;
    }

    @Override
    public int hashCode() {
      return Objects.hash(name,score);
    }

    @Override
    public int compareTo(Student o) {
        if(this.score-o.score==0)
            return 0;
        else if(this.score-o.score>0)
            return 1;
        else
            return -1;
    }
}
