import org.jetbrains.annotations.NotNull;

public class Box {
    double length;
    double width;
    double height;

    // Конструкторы

    Box() {
        this(10);
    }

    Box(Box another){
        this(another.length, another.width, another.height);

    }

    Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    Box(double size) {
        this(size, size, size);
    }


//    Методы

    void compare(Box another) {
        double currentVolume = getVolume();
        double anotherVolume = another.getVolume();
        if (currentVolume > anotherVolume) {
            System.out.println("Current > Another");
        } else if (currentVolume < anotherVolume) {
            System.out.println("Current < Another");
        } else {
            System.out.println("Current == Another");
        }

    }

    int compare1(Box another) {
        double currentVolume = getVolume();
        double anotherVolume = another.getVolume();
        int result;
        if (currentVolume > anotherVolume) {
            result=1;
        } else if (currentVolume < anotherVolume) {
            result=-1;
        } else {
            result=0;
        }
        return result;

    }




    void setDimens(double length, double height, double width) {
        this.height = height;
        this.length = length;
        this.width = width;
    }


    double getVolume() {
        return length * width * height;

    }

    void showVolume() {
        System.out.println(getVolume());


    }

}
