public class Monster {
    int eye;
    int hands;
    int legs;

    Monster() {
        this.legs = 2;
        this.eye = 2;
        this.hands = 2;
    }

    Monster(int size) {
        this.legs = size;
        this.eye = size;
        this.hands = size;
    }

    Monster(int legs, int eye, int hands){
        this.legs = legs;
        this.eye = eye;
        this.hands = hands;
    }

    void voce(){
        System.out.println("Gr........");
    }

    void voce(int count){
        for(int i =0; i<count; i++){
            System.out.println("Gr.....");
        }
    }

    void voce(int count, String message){
        for(int i =0; i<count; i++){
            System.out.println(message);
        }

    }



}
