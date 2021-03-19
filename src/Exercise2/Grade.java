package Exercise2;

public class Grade {

    private String ModuleCode;
    private int MidTermExam;
    private int FinaleExam;
    private int PrivateWork;

    public Grade(Module m , int midTermExam, int finaleExam,int privateWork) {
        MidTermExam = midTermExam;
        FinaleExam = finaleExam;
        PrivateWork = privateWork;
        ModuleCode = m.getCode();
    }

    public Grade(int finaleExam, int privateWork) {
        FinaleExam = finaleExam;
        PrivateWork = privateWork;
    }

    public String getModuleName() {
        return ModuleCode;
    }

    public void setModuleName(String moduleName) {
        ModuleCode = moduleName;
    }

    public int getMidTermExam() {
        return MidTermExam;
    }

    public void setMidTermExam(int midTermExam) {
        MidTermExam = midTermExam;
    }

    public int getFinaleExam() {
        return FinaleExam;
    }

    public void setFinaleExam(int finaleExam) {
        FinaleExam = finaleExam;
    }

    public int getPrivateWork() {
        return PrivateWork;
    }

    public void setPrivateWork(int privateWork) {
        PrivateWork = privateWork;
    }
}
