/**
 Перевод дюймов в метры
 */
public class InchToMeters {
    public static void main(String args[]) {
        double inch, metres;
        int counter = 0;
        for (inch=1;inch<=144;inch++) {
            metres = inch * 39.37;
            System.out.println(inch + " дюймов соответствует " + metres + " метров");
            counter++;
            if(counter==12){
                System.out.println();
                counter=0;
            }
        }
    }
}
