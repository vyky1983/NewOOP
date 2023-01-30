public class Dog {
    String  name;
    String breed;
    double weight;
    int speed;

    void getDog(String name, String breed, double weight){
        System.out.println("Name dog --> "+name+"\nBreed dog -->"+breed+"\nWeight dog --> "+weight+".");
    }

    void runDog(int speed){
        for(int i =0; i<speed; i++){
            System.out.println("Run");
        }
    }
}
