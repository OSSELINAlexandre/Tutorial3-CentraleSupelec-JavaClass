package Exercise2;

public class Main {

	
	
    public static void main(String[] args) {

        MSCStudent John = new MSCStudent("John", "Frusciante", new User("jfrusc"));
        MSCStudent Christ = new MSCStudent("Chris", "Cornell", new User("ccorn"));
        UGStudent Perry = new UGStudent("Perry", "Farrel", new User("pfarr"));

        Lecturer PB = new Lecturer("Paolo Ballarini");
        Module IS1120 = new Module("Computer Science 1120", "IS1120", PB);
        Module PHI101 = new Module("Philosophie 101", "PHI101", PB);

        IS1120.AddAStudentToModule(John);
        IS1120.AddAStudentToModule(Christ);
        IS1120.AddAStudentToModule(Perry);

        PHI101.AddAStudentToModule(John);
        PHI101.AddAStudentToModule(Christ);
        PHI101.AddAStudentToModule(Perry);
        

        John.GradingStudent(IS1120, 12,24,8);
        Christ.GradingStudent(IS1120, 2,13,12);
        Perry.GradingStudent(IS1120, 2,3,3);
        
        Christ.GradingStudent(PHI101, 20,20,20);

        
        
        PB.finalMark(IS1120);
        PB.finalMark(PHI101);
        Christ.SemesterRequirement();

    }
}
