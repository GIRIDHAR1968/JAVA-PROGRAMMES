class Student{
    String name;
    int rollNo;

}

public class ArrayOfObjects{
    public static void main(String[] args){
        Student s1 = new Student();
        s1.rollNo = 5;
        s1.name = "Yashwanth";
        Student s2 = new Student();
        s2.rollNo = 12;
        s2.name = "Sampath";
        Student students[] = new Student[2];
        students[0] = s1;
        students[1] = s2;
        for(int i = 0; i < students.length;i++){
            System.out.println(students[i].name + ":" + students[i].rollNo);
        }
            // to know variuos addresses of objects and array of objects
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(students);
            System.out.println(students);
 


    }
}