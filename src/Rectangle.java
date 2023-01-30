public class Rectangle {
    double length;
    double weight;

   void getRect(double length, double weight){
        this.weight=weight;
        this.length=length;
        System.out.println(("Длина прямоугольника --> "+length+"\nШирина прямоугольника --> "+weight));
       System.out.println("------------------->");
    }



    void ariaRect(){
        System.out.println("Площадь прямоугольника --> "+weight*length);
    }


}
