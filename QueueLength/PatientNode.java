public class PatientNode {
    private Patient patient;
    private PatientNode next;
    
    public PatientNode(Patient patient) {
        this.patient = patient;
        next = null;
    }
    
    public Patient getPatient() {
        return patient;
    }
    
    public void setNext(PatientNode next) {
        this.next = next;
    }
    
    public PatientNode getNext() {
        return next;
    }
}