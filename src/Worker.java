public class Worker {
    String name;
    String post;
    double salary;

    Worker(String name, String post, double salary){
        this.name=name;
        this.post=post;
        this.salary=salary;
    }

    void showInfo(){
        System.out.println("Name worker --> "+name+"\nPost worker --> "+post+"\nSalary worker -->"+salary+"rur.");
    }
}
