import java.util.TreeMap;

public class StudentManage {
    TreeMap<Integer,Student> studentsList=new TreeMap<>();
    public void addNewStudent(Student student){
        int key=student.getExamId();
        studentsList.put(key,student);
    }
    public Student searchingByExamId(int searchingId){
        Student student= studentsList.get(searchingId);
        return student;
    }
    public void displayStudentById(int searchingId){
        Student student=searchingByExamId(searchingId);
        if (student==null) System.out.println("NOT FOUND");
        else System.out.println(student);
    }
}
