public class Candidate {
    private int experience;
    private int salaryExpectation;
    private String[] languages;
    private int average;

    public int getSalaryExpectation(){
        return this.salaryExpectation;
    }
    public int getAverage() {
        return this.average;
    }
    public int getExperience() {
        return this.experience;
    }
    public int getLanguage(){
        int count=0;
        for(int i=0;i<this.languages.length;i++){
            if(this.languages[i].equals("JAVA")||this.languages[i].equals("PYTHON")||this.languages[i].equals("JAVASCRIPT")){
                count++;
            }
        }
        return count;
    }
    public int suitableApplicant(){
        if(this.average>=80&&getLanguage()>=2&&this.salaryExpectation<=16000){
            return 1;
        }else if(this.experience>=3&&getLanguage()>=3&&this.salaryExpectation<=30000){
            return 2;
        }else{
            return 0;
        }
    }

}
