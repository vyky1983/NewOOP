public class Box {
    double length;
    double weight;
    double height;

    Box(double length, double weight, double height){
        this.weight=weight;
        this.height=height;
        this.length=length;
    }
    Box(){
        this.weight=weight;
        this.height=height;
        this.length=length;
    }

    Box(double size){
        this.length=size;
        this.height=size;
        this.weight=size;
    }

    void setDimens(double length, double weight, double height){
        this.length=length;
        this.height=height;
        this.weight=weight;
        System.out.println(length*weight*height);

    }

     void getVolume(){
        this.length=length;
        this.height=height;
        this.weight=weight;
        System.out.println("Resulted --> "+length*weight*height);
    }

}
