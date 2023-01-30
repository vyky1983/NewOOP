public class Box {
    double length;
    double weight;
    double height;

    Box(double length, double weight, double height){
        this.weight=weight;
        this.height=height;
        this.length=length;

    }

    void setDimens(double length, double weight, double height){
        this.length=length;
        this.height=height;
        this.weight=weight;
        System.out.println(length*weight*height);

    }

    Box(){
        this.weight=weight;
        this.height=height;
        this.length=length;
    }

    void getVolume(double length, double weight, double height){
        System.out.println("Resulted --> "+length*weight*height);
    }

}
