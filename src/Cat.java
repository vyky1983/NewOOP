public class Cat {
    String name;
    int age;
    double weight;

    void getName(String name, int age, double weight){
        this.name=name;
        this.age=age;
        this.weight=weight;
        System.out.println("Name --> "+name+"\nAge --> "+age+"\nWeight --> "+weight);
    }

//    void showName(){
//        System.out.println(getName(String name, int age, double weight));
//    }

}
