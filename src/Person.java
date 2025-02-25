public class Person {
    private String name;
    private int age;
    private Person[] children;

    public int getAge() {
        return this.age;
    }
    public String getName() {
        return this.name;
    }
    public boolean hasChildren(){
        if(children!=null&&children.length>0){
            return true;
        }
        return false;
    }
    public boolean isGrandFather(){
        for(int i=0;i<this.children.length;i++){
            if(this.children[i].hasChildren()){
                return true;
            }
        }
        return false;
    }
    public boolean addChild(Person child){
        if(this.age-child.age>=18){
            Person[] temp=new Person[this.children.length+1];
            for(int i=0;i<this.children.length;i++){
                temp[i]=this.children[i];
            }
            temp[temp.length-1]=child;
            this.children=temp;
            return true;
        }
        return false;
    }
    public Person getYoungestChild(){
        if(this.children==null||this.children.length==0){
            return null;
        }
        Person youngest=this.children[0];
        for(int i=1;i<this.children.length;i++){
            if(this.children[i].getAge()<youngest.getAge()){
                youngest=this.children[i];
            }
        }
        return youngest;
    }
           public char mostCommonStartingLetter() {
             String startingLetter = this.name.charAt(0) + "";
              if (hasChildren()) {
               for (int i = 0; i < this.children.length; i++) {
                startingLetter += this.children[i].getName().charAt(0);
                if (this.children[i].hasChildren()) {
                    for (int j = 0; j < this.children[i].children.length; j++) {
                        startingLetter += this.children[i].children[j].getName().charAt(0);
                    }
                   }
                 }
               }
              return getMostCommonChar(startingLetter);//(. Y .) 8008135
            }
         public char getMostCommonChar(String str){
          int max=0;
          char mostCommonChar=' ';
           for(int i=0;i<str.length();i++){
              int count=0;
              for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
                if(count>max){
                    max=count;
                    mostCommonChar=str.charAt(i);
                }
            }
        }
        return mostCommonChar;
    }
}
