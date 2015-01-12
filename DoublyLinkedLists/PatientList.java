public class PatientList {
    private PatientNode first;

    public PatientList() {
        first = null;
    }

    public void add(Patient patient) {
        PatientNode newPatient = new PatientNode(patient);
        if (first == null) {
            first = newPatient;
            return;
        }
        PatientNode current = first;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(newPatient);
        current.getNext().setPrevious(current);
    }

    public void delete(Patient patient) {
        PatientNode delNode = new PatientNode(patient);
        if (first.getPatient().getName().equals(delNode.getPatient().getName())) {
            first = first.getNext();
            if (first != null) {
                first.setPrevious(null);
            }
            return;
        }
        PatientNode current = first;
        while (current.getNext() != null) {
            if (current.getNext().getNext() != null) {
                if (current.getNext().getPatient().getName().equals(delNode.getPatient().getName())) {
                    current.setNext(current.getNext().getNext());
                    current.getNext().setPrevious(current);
                }
                current = current.getNext();
            } else if (current.getNext().getPatient().getName().equals(delNode.getPatient().getName())) {
                current.setNext(null);
            } else {
                return;
            }
        }
    }

    public int Length() {
        if (first == null) {
            return 0;
        }
        int counter = 1;
        PatientNode current = first;
        while (current.getNext() != null) {
            current = current.getNext();
            counter++;
        }
        return counter;
    }

    public void printList() {
        PatientNode current = first;
        while (current != null) {
            System.out.println("Name: " + current.getPatient().getName() + ", age: " + current.getPatient().getAge() + ", illness: " + current.getPatient().getIllness());
            current = current.getNext();
        }
        System.out.println();
    }

    public void printListBackwards() {
        PatientNode current = first;
        while (current.getNext() != null) {
            current = current.getNext(); 
        }
        
        while (current != null) {
            System.out.println("Name: " + current.getPatient().getName() + ", age: " + current.getPatient().getAge() + ", illness: " + current.getPatient().getIllness());
            current = current.getPrevious();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PatientList patientList = new PatientList();
        Patient p1 = new Patient("Gabriel", 39, "Ebola");
        patientList.add(p1);
        Patient p2 = new Patient("Vincent", 48, "Fever");
        patientList.add(p2);
        Patient p3 = new Patient("Dieter", 34, "Malaria");
        patientList.add(p3);
        Patient p4 = new Patient("Oskar", 56, "Cold");
        patientList.add(p4);
        Patient p5 = new Patient("Simon", 23, "OCD");
        patientList.add(p5);
        Patient p6 = new Patient("Dennis", 37, "Fever");
        patientList.add(p6);
        Patient p7 = new Patient("Martin", 32, "Ebola");
        patientList.add(p7);
        Patient p8 = new Patient("Stefan", 34, "Steam Collection");
        patientList.add(p8);
        Patient p9 = new Patient("Sebastien", 78, "Cold");
        patientList.add(p9);
        Patient p10 = new Patient("Andreas", 12, "OCD");
        patientList.add(p10);

        patientList.printList();
        patientList.printListBackwards();
        System.out.println(patientList.Length());
        System.out.println();
        patientList.delete(p5);
        patientList.delete(p10);
        patientList.printList();
        patientList.printListBackwards();
        System.out.println(patientList.Length());
        System.out.println();
        patientList.delete(p1);
        patientList.printList();
        patientList.printListBackwards();
        System.out.println(patientList.Length());
        System.out.println();
        
        Patient p11 = new Patient("Andre", 12, "Fever");
        patientList.add(p11);
        Patient p99 = new Patient("Pseudo", 99, "LOL");
        patientList.delete(p99);
        patientList.printList();
        patientList.printListBackwards();
        System.out.println(patientList.Length());
        
    } 
}
