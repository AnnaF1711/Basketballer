//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    }
//    public static Candidate getMaxGrades(Candidate[] candidates, int type) {
//        Candidate candidate = null;
//        int max=0;
//        for(int i=0;i<candidates.length;i++) {
//            if(candidates[i].suitableApplicant()==type){
//                if(candidates[i].getAverage()>max){
//                    max=candidates[i].getAverage();
//                    candidate=candidates[i];
//                }
//            }
//        }
//        return candidate;
//    }
//    public static Candidate getMaxExperience(Candidate[] candidates, int type) {
//        Candidate candidate = null;
//        int max = 0;
//        for (int i = 0; i < candidates.length; i++) {
//            if (candidates[i].suitableApplicant() == type) {
//                if (candidates[i].getExperience() > max) {
//                    max = candidates[i].getExperience();
//                    candidate = candidates[i];
//                }
//            }
//        }
//        return candidate;
//    }
//    public static Candidate getLowerSalaryExpectation(Candidate[] candidates, int type) {
//        Candidate candidate = null;
//        int min = candidates[0].getSalaryExpectation();
//        for (int i = 0; i < candidates.length; i++) {
//            if (candidates[i].suitableApplicant() == type) {
//                if (candidates[i].getSalaryExpectation() < min) {
//                    min = candidates[i].getSalaryExpectation();
//                    candidate = candidates[i];
//                }
//            }
//        }
//        return candidate;
//    }
//    public static Candidate mostSuitable(Candidate[] candidates, int type){
//            if(type==1){
//                return getMaxGrades(candidates,type);
//            }else if(type==2){
//                return getMaxGrades(candidates,type);
//            }else{
//                return getLowerSalaryExpectation(candidates,type);
//            }
//    }
    public static String getMaxTrippleDoubler(Basketballer[] players){
        int max=0;
        String name=players[0].getName();
        for(int i=0;i<players.length;i++){
            if(players[i].countDDOrTD(false)>max){
                max=players[i].countDDOrTD(false);//false means tripleDouble
                name=players[i].getName();
            }
        }
        return name;
    }
}