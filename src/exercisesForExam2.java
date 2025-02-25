public class exercisesForExam2 {
    private String name;
    private int[] points;
    private int[] rebounds;
    private int[] assists;

    public String getName() {
        return this.name;
    }

    public boolean isTwoDidit(int number){
        if(number>9&&number<100){
            return true;
        }
        return false;
    }
    public int countDDOrTD(boolean isDDOrTD){
        int countDD=0;
        int countTD=0;
        for(int i=0;i<this.points.length;i++){
            boolean pointsTD=isTwoDidit(this.points[i]);
            boolean reboundsTD =isTwoDidit(this.rebounds[i]);
            boolean assistsTD=isTwoDidit(this.assists[i]);
            if(pointsTD&&reboundsTD||pointsTD&&assistsTD||reboundsTD&&assistsTD){
                countDD++;
            }
            if(pointsTD&&reboundsTD&&assistsTD){
                countTD++;
            }
        }
        if (isDDOrTD) {
            return countDD;
        } else {
            return countTD;
        }
    }
    }
