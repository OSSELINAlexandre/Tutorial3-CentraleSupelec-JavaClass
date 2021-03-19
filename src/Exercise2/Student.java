package Exercise2;

import java.util.ArrayList;

public abstract class Student {

    private String name;
    private String surname;
    private User user;
    private double MTRation;
    private double FERation;
    private double PWRatio;
    private ArrayList<Grade> semesterGrades;


    public Student(String name, String surname, User user,double MTRation, double FERation,  double PWRatio) {
        this.name = name;
        this.surname = surname;
        this.user = user;
        this.MTRation = MTRation;
        this.FERation = FERation;
        this.PWRatio = PWRatio;
        semesterGrades = new ArrayList<>();
    }

    public void GradingStudent(Module m , int PrivateW, int MidTermW, int FinalExam){
    	if(PrivateW <=20 && MidTermW <=20 && FinalExam <=20) {
        semesterGrades.add(new Grade(m, MidTermW, FinalExam , PrivateW ));
    	}else {
    		System.out.println("Error in the typo in the grades of " + this.name + " in the module " + m.getName());
    	}
    }

    public ArrayList<Grade> getSemesterGrades() {
        return semesterGrades;
    }

    public void SemesterRequirement(){

        double temp = 0 ;

        for(Grade g : semesterGrades){
//           temp += ((g.getFinaleExam() * FERation) + (g.getMidTermExam()+ MTRation) + (g.getPrivateWork() * PWRatio));
//            Small test to see if you could put it another way.
            temp += g.getMidTermExam() * MTRation + g.getFinaleExam() * FERation + g.getPrivateWork() * PWRatio;;
        }
        temp /= semesterGrades.size();

        if(this.getClass().getName().equals("Exercise2.MSCStudent")){
            if(temp >= 10){
                System.out.println("\t-Student: "+ name +", " + surname +" Pass the semester with " + temp);
            }else{
                System.out.println("\t-Student: "+ name +", " + surname +" failed the semester with " + temp);
            }
        }else{
            if(temp >= 8.0) {
                System.out.println("\t-Student: "+ name +", " + surname +" Pass the semester with " + temp);
            }else{
                System.out.println("\t-Student: "+ name +", " + surname +" failed the semester with " + temp);
            }
        }
    }


    public double computeFinaleGrade(Grade g){
        double FGRADE = g.getMidTermExam() * MTRation + g.getFinaleExam() * FERation + g.getPrivateWork() * PWRatio;

        if(this.getClass().getName().equals("Exercise2.MSCStudent")){
            if(FGRADE >= 10.0) {
                System.out.println("\t-Student: "+ name +", " + surname +" Pass with " + FGRADE);
            }else{
                System.out.println("\t-Student: "+ name +", " + surname +" failed with " + FGRADE);
            }
        }else{
            if(FGRADE >= 8.0) {
                System.out.println("\t-Student: "+ name +", " + surname +" Pass with " + FGRADE);
            }else{
                System.out.println("\t-Student: "+ name +", " + surname +" failed with " + FGRADE);
            }
        }

        return FGRADE;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public double getMTRation() {
		return MTRation;
	}

	public void setMTRation(double mTRation) {
		MTRation = mTRation;
	}

	public double getFERation() {
		return FERation;
	}

	public void setFERation(double fERation) {
		FERation = fERation;
	}

	public double getPWRatio() {
		return PWRatio;
	}

	public void setPWRatio(double pWRatio) {
		PWRatio = pWRatio;
	}

	public void setSemesterGrades(ArrayList<Grade> semesterGrades) {
		this.semesterGrades = semesterGrades;
	}

    
    
    
}
