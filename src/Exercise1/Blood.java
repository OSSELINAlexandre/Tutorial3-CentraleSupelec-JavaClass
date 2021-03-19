package Exercise1;

public class Blood {

    private int systolic;
    private int diastolic;
    private Date measurmentdate;

    public Blood(int systolic, int diastolic, Date measurmentdate) {
        this.systolic = systolic;
        this.diastolic = diastolic;
        this.measurmentdate = measurmentdate;
    }

    public String returnDate(){

        int day = this.measurmentdate.getDay();
        int month = this.measurmentdate.getMonth();
        int year = this.measurmentdate.getYear();

        return "" + day + "/" + month + "/" + year;
    }

    public int getSystolic() {
        return systolic;
    }

    public void setSystolic(int systolic) {
        this.systolic = systolic;
    }

    public int getDiastolic() {
        return diastolic;
    }

    public void setDiastolic(int diastolic) {
        this.diastolic = diastolic;
    }

    public Date getMeasurmentdate() {
        return measurmentdate;
    }

    public void setMeasurmentdate(Date measurmentdate) {
        this.measurmentdate = measurmentdate;
    }
}
