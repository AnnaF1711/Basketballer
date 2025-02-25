public abstract class ClinicWorker {
    private String firstName;
    private String lastName;
    private int experienceYears;

    public String fullName(){
        return this.firstName + " " + this.lastName;
    }
    public int getExperienceYears(){
        return this.experienceYears;
    }
}
