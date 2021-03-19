package Exercise1;

import java.util.ArrayList;



public class BloodTest {


    public static void main(String[] args) {

        Patient mary = new Patient("Mary");
        Patient john = new Patient("John");

        mary.addBlood_measure(new Blood(94,61, new Date(2,5,2013)));
        mary.addBlood_measure(new Blood(97,65, new Date(3,5,2013)));
        mary.addBlood_measure(new Blood(144,99, new Date(4,5,2013)));
        mary.addBlood_measure(new Blood(123,88, new Date(5,5,2013)));
        mary.addBlood_measure(new Blood(177,110, new Date(6,5,2013)));
        mary.addBlood_measure(new Blood(145,89, new Date(7,5,2013)));
        printReport(mary);
        
        
        john.addBlood_measure(new Blood(88,57, new Date(15,5,2013)));
        john.addBlood_measure(new Blood(95,61, new Date(16,5,2013)));
        john.addBlood_measure(new Blood(114,80, new Date(17,5,2013)));
        john.addBlood_measure(new Blood(151,96, new Date(18,5,2013)));
        john.addBlood_measure(new Blood(176,104, new Date(19,5,2013)));
        john.addBlood_measure(new Blood(176,110, new Date(20,5,2013)));
        printReport(john);

    }


    public static void printReport(Patient patient){
        int compteur = 0;
        int average = 0;
        int comparator = Integer.MIN_VALUE;
    
        System.out.println();
        System.out.println("\t\t\t\t\t\t====   Report of " + patient.getName()+"   ====");
        System.out.println();
        printTheMeasurment(patient.getMeasurement());
        System.out.println();
        for(Blood b : patient.getMeasurement()){
            if(b.getSystolic() >= comparator)
                comparator = b.getSystolic();
            average += b.getDiastolic();
            if(b.getSystolic()>= 140){
                System.out.println("-\t\t\tAbnormal take on the " + b.returnDate() + " Systolic value : " + b.getSystolic() + " Diastolic value : " + b.getDiastolic());
                compteur ++;
            }
        }

        average /= patient.getMeasurement().size();
        if(compteur == 0){
            System.out.println("No measurment was too high");
        }

        System.out.println();
        System.out.println("-\t\t\tAverage Diastolic Blood Pressure : " + average);
        System.out.println();
        System.out.println("-\t\t\tHighest Systolic Blood Pressure recorded : " + comparator );

    }

    private static void innerPrinting(int size, String text){
        int adjuster = 0;
        if(text.length() % 2 == 0)
            adjuster = 1;

        System.out.print(" ".repeat((size/(3) - text.length()) / 2 ) );
        System.out.print(text);
        System.out.print(" ".repeat((size/(3) - text.length()) / 2  - 2 + adjuster));
        System.out.print("|");
        System.out.print("|");

    }

    private static void printTheMeasurment(ArrayList<Blood> measure){

        int i = 0;
        System.out.println("=".repeat(76));
        {
            System.out.print("|");

            innerPrinting(75, "Systolic");
            innerPrinting(75, "Diastolic");
            innerPrinting(75, "Date");

            System.out.println();
        }
        System.out.println(".".repeat(74));



        while(i < measure.size() ){

            System.out.print("|");
            innerPrinting(75, "" + measure.get(i).getSystolic());
            innerPrinting(75, "" + measure.get(i).getDiastolic());
            innerPrinting(75, "" + measure.get(i).returnDate());
            System.out.println();
            i++;
        }

        System.out.println("=".repeat(76));
    }

}
