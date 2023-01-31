public class Square {
    double length;
    double width;
    double height;

    // Конструктор... №1
    Square(double height, double width, double length){
        this.height=height;
        this.length=length;
        this.width=width;
    }


    Square(double size){
        this(size,size,size);
    }

    Square(Square another){
        this(another.height, another.width, another.length);
    }

    // Методы
    void getSquare(double height, double width, double length){
        this.height=height;
        this.width=width;
        this.length=length;
    }

    double getVolume(){
        return height*length*width;
    }

    void showVolume(){
        System.out.println(getVolume());
    }


}
