public class Cat {
    String name;
    int age;
    double weight;

    String getName(){
        return "Name --> "+name+"\nAge --> "+age+"\nWeight --> "+weight;
    }

    void showName(){
        System.out.println(getName());
    }

}
