package Exercise2;

import java.util.ArrayList;

public class Module {

    private String name;
    private String code;
    private Lecturer teacher;
    private ArrayList<Student> students;


    public Module(String name, String code, Lecturer teacher) {
        this.name = name;
        this.code = code;
        this.teacher = teacher;
        teacher.addModule(this);
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Lecturer getTeacher() {
        return teacher;
    }

    public void setTeacher(Lecturer teacher) {
        this.teacher = teacher;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void AddAStudentToModule(Student student){
        students.add(student);
    }

    public void RemoveAStudentToModule(Student student){
        students.remove(student);
    }
}
