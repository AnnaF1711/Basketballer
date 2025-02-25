public class Triangle {
    private int angle1;
    private int angle2;
    private int angle3;


    public Triangle (int angle1, int angle2){
        this.angle1 = angle1;
        this.angle2 = angle2;
        this.angle3 = 180-(angle1 + angle2);
    }

    public int type(){
        if(this.angle1<90&&this.angle2<90&&this.angle3<90){
            return 1;
        }else if(this.angle1==90||this.angle2==90||this.angle3==90){
            return 2;
        }else if(this.angle1>90||this.angle2>90||this.angle3>90){
            return 3;
        }
        return -1;
    }
    public int specialType(){
        boolean isoscelesTriangle=false;
        if(this.angle1==this.angle2||this.angle2==this.angle3||this.angle1==this.angle3){
            isoscelesTriangle=true;
            return 1;
        }else if(this.angle1==this.angle2&&this.angle1==this.angle3){
            return 2;
        }else if(type()==2&&isoscelesTriangle){
            return 3;
        }
        return -1;
    }
    
}
