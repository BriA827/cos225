public class PatientTester{
    public static void main(String[] args){
        PatientManager ward = new PatientManager();
        // System.out.println(ward.toString());

        for (int i = 1; i <= 4; i++) {
            ward.patient_array.add(new Patient(i, i*200));
        }
        System.out.println(ward.toString());

        ward.caffeineAbsorbtion();
        System.out.println(ward.toString());
        ward.caffeineAbsorbtion();
        System.out.println(ward.toString());

        double highest_caffiene = 0;
        int index = -1;
        for (int i = 0; i < ward.patient_array.size(); i++) {
            if (ward.patient_array.get(i).caffeine >= highest_caffiene){
                highest_caffiene = ward.patient_array.get(i).caffeine;
                index = i;
            }
        }

        ward.removePatient((index));
        System.out.println(ward.toString());
    }
}