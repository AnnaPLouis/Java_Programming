package day08_ternaries;

public class FieldTrip {
    public static void main(String[] args) {

        int gradeNumber =3;

        String location = "Unknown";
        int numberOfGroups = 0;
        String teacherInCharge = "Unknown";



        if (gradeNumber >=1 && gradeNumber <=6){
            if (gradeNumber ==1){
                location = "Apple orchard";
                numberOfGroups = 3;
                teacherInCharge = "Ms. Smith";
            }
            else if (gradeNumber ==2){
                location = "Zoo";
                numberOfGroups = 7;
                teacherInCharge = "Mr. Lee";
            }
            else if (gradeNumber ==3){
                location = "Aquarium";
                numberOfGroups = 5;
                teacherInCharge = "Ms. Wilson";
            }
            else if (gradeNumber ==4){
                location = "Movie theatre";
                numberOfGroups = 2;
                teacherInCharge = "Ms. Reyes";
            }
            else if (gradeNumber ==5) {
                location = "Musieum";
                numberOfGroups = 5;
                teacherInCharge = "Ms. Lela";
            } else{
            location = "Six Flags";
            numberOfGroups = 6;
            teacherInCharge = "Mr. Watt";
        }

        }

        String result = "location - " + location +
                "\nnumber of groups - "+ numberOfGroups +
                "\nteacher in charge - " + teacherInCharge;
        System.out.println(result);





    }
}
