package Exercise2;

import java.util.ArrayList;

public class Lecturer {

    private String name;
    private User user;
    private ArrayList<Module> Classes;

    public Lecturer(String name) {
        this.name = name;
        Classes = new ArrayList<>();
    }
    
    public Lecturer(String name, User Sysuser) {
        this.name = name;
        Classes = new ArrayList<>();
        user = Sysuser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Module> getClasses() {
        return Classes;
    }

    public void setClasses(ArrayList<Module> classes) {
        Classes = classes;
    }

    public void addModule(Module module){
        Classes.add(module);
    }

    public void removeModule(Module module){
        Classes.remove(module);
    }

    public void finalMark(Module m){

        for(Student s : m.getStudents()){
            for(Grade g : s.getSemesterGrades()){
                if(g.getModuleName().equals(m.getCode())) {
                    s.computeFinaleGrade(g);

                }
            }
        }
    }
}
