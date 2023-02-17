public class Lesson17_02 {
    public static void main(String[] args) {
        employ employ = new employ();
        employ.Constructor("K. Max", 18, "Java Developer");
        System.out.println(employ.toString());
    }
}
class employ{
    private String name;
    private int age;
    private String department;


    public void Constructor(String Name, int Age, String Department){
        this.name = Name;
        this.age = Age;
        this.department = Department;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getDepartment(){
        return department;
    }
    @Override
    public String toString(){
        return (String) ("My name is " + name + " age : " + age + " department " + department);
    }

}