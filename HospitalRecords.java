class Patient {
    private String name;
    private int age;

    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }    

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTreatmentPlan() {
        return "General treatment plan for patient.";
    }
}

class InPatient extends Patient {
    private String roomNumber;

    public InPatient(String name, int age, String roomNumber) {
        super(name, age);
        this.roomNumber = roomNumber;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public String getTreatmentPlan() {
        return "Full treatment plan with room number: " + roomNumber;
    }
}

class OutPatient extends Patient {
    private String appointmentDate;

    public OutPatient(String name, int age, String appointmentDate) {
        super(name, age);
        this.appointmentDate = appointmentDate;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    @Override
    public String getTreatmentPlan() {
        return "Treatment plan for outpatient with appointment on: " + appointmentDate;
    }
}

public class HospitalRecords {
    public static void main(String[] args) {
        Patient inpatient = new InPatient("Ram", 45, "101");
        Patient outpatient = new OutPatient("Hari", 30, "2025-06-10");

        System.out.println(inpatient.getName() + ": " + inpatient.getTreatmentPlan());
        System.out.println(outpatient.getName() + ": " + outpatient.getTreatmentPlan());
    }
}
