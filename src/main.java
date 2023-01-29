public class main {
    public static void main(String[] args) {
        Person person = new Person();
        person.name="Alex";
        person.age=45;
        person.weight=80.2;

        Person person1=new Person();
        person1.name="Vyky";
        person1.age=39;
        person1.weight=71.5;

        Person person2=new Person();
        person2.name="Andy";
        person2.age=15;
        person2.weight=65;

        Person person3=new Person();
        person3.name="Alex2";
        person3.age=5;
        person3.weight=25.25;

        System.out.println(" Средний возраст составляет --->"+(person.age+ person1.age+ person2.age+ person3.age)/4);

    }
}
