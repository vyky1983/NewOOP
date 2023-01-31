public class main {
    public static void main(String[] args) {
        Box current =new Box(80);
        Box another =new Box(current);
        another.setDimens(20,30,5);
        current.setDimens(50,50,50 );
        current.showVolume();
        another.showVolume();




    }
}
