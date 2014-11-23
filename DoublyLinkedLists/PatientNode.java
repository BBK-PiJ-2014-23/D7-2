public class PatientNode {
    private Patient patient;
    private PatientNode next;
    private PatientNode previous;
    
    public PatientNode(Patient patient) {
        this.patient = patient;
        next = null;
        previous = null;
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
    
    public void setPrevious(PatientNode previous) {
        this.previous = previous;
    }
    
    public PatientNode getPrevious() {
        return previous;
    }
}