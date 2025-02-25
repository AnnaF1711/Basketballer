public class Act {
    private String name;
    private int length;
    private Actor[] actors;
    private int level;

    public Act (String name,int level, int length){
        this.name=name;
        this.level=level;
        this.length=length;
        this.actors=new Actor[0];
    }

    public boolean isExist(Actor actor){
        for(int i=0;i<this.actors.length;i++){
            if(this.actors[i]==actor){
                return true;
            }
        }
        return false;
    }
    public void addToActors(Actor actor){
        Actor[] temp=new Actor[this.actors.length+1];
        for(int i=0;i<this.actors.length;i++){
            temp[i]=this.actors[i];
        }
        temp[temp.length-1]=actor;
        this.actors=temp;
    }
    public boolean addActor(Actor toad){
        if(this.length==0){
            addToActors(toad);
            return true;
        }else if(this.length==1) {
            if (toad.getAge() >= 16 && toad.getActs() >= 3) {
                if (!isExist(toad)) {
                addToActors(toad);
                    return true;
            }
        }
        }else if(this.length==2) {
            if (toad.getAge() >= 25 && toad.getActs() >= 5) {
                if (!isExist(toad)) {
                    addToActors(toad);
                    return true;
                }
            }
        }
        return false;
    }

    public String mostHistoryActs (Actor[] actors){
        int mostActs=0;
        String actorName="";
        for(int i=0;i<this.actors.length;i++){
                if(this.actors[i].getActs()>=mostActs){
                    mostActs=this.actors[i].getActs();
                    actorName=this.actors[i].getName();
            }
        }
        return actorName;
    }
}
