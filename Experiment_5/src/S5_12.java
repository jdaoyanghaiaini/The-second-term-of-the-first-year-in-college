import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class S5_12 {
    public static void main(String[] args) {
        HashSet<Person> set = new HashSet<>();
        Person person1 = new Person("zhangsan",18);
        Person person2 = new Person("zhangsan",19);
        Person person3 = new Person("zhangsan",19);
        set.add(person1);
        set.add(person2);
        set.add(person3);
        System.out.println(set);
        System.out.println("此时发现person3没有被加入到set中说明我们重新的equals和hashcode起作用了");
    }
}
class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Person))
            return false;
        if(this.name.equals(((Person) o).name) && this.age==((Person) o).age)
            return true;
        else
            return false;
    }
    @Override
    public int hashCode() {
       return Objects.hash(name,age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}