
import java.util.ArrayList;


public class PatientManager{
    ArrayList<Patient> patient_array = new ArrayList<Patient>(10);

    public PatientManager(){
    }

    public int addPatient(Patient patient){
        patient_array.add(patient);
        return patient_array.size();
    }

    public Patient removePatient(int spot){
        Patient removed = patient_array.get(spot);
        patient_array.remove(spot);
        return removed;
    }

    public void caffeineAbsorbtion(){
        ArrayList<Integer> negative_caffiene = new ArrayList<Integer>();
        for (int i = 0; i < patient_array.size() ; i++){
            patient_array.get(i).caffeine -= 170;
            if (patient_array.get(i).caffeine <= 0){
                negative_caffiene.add(i);
            }
        }

        for (int negative_index : negative_caffiene) {
            patient_array.remove(negative_index);
        }
    }

    public String toString(){
        String patient_data = "";
        for (int i = 0; i < patient_array.size(); i++) {
            if (patient_array.get(i) != null){
                patient_data += patient_array.get(i).id_number + " " + patient_array.get(i).caffeine;
            }
            if ( i < patient_array.size()-1){
                patient_data += "\n";
            }
        }

        if (patient_data == ""){
            patient_data = "Empty";
        }
        return patient_data;
    }
}