public class Shift {
    private ClinicWorker[] staff;
    private Patient[] patients;

    public String workerWithMaxExperience() {
        if(this.staff.length == 0){
            return null;
        }
        int maxExperience = 0;
        String workerName = "";
        for (int i = 0; i < this.staff.length; i++) {
            if (this.staff[i].getExperienceYears() > maxExperience) {
                maxExperience = this.staff[i].getExperienceYears();
                workerName = this.staff[i].fullName();
            }
        }
        return workerName;
    }

    public Patient[] typeOfTreatment(int type) {
        if(this.patients.length == 0){
            return null;
        }
        int count = 0;
        for (int i = 0; i < this.patients.length; i++) {
            if (this.patients[i].getCheckType() == type) {
                if (this.patients[i].isUrgent()) {
                    count++;
                }
            }
        }
        Patient[] tempPatients = new Patient[count];
        for (int i = 0; i < this.patients.length; i++) {
            if (this.patients[i].getCheckType() == type) {
                if (this.patients[i].isUrgent()) {
                    tempPatients[i] = this.patients[i];
                }
            }
        }
        return tempPatients;
    }
}

