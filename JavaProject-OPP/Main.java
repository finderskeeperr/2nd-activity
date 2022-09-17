public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Fondness to Instruments and Music");

        Guitar g = new Guitar(); // instantion 
        g.sound();


        g.setName("Lorgem Bosque, Mark Stephen Geraga, and Jeane Cardiente");
        System.out.println("These are the people who loves music, specifically guitar: " + g.getName());


        g.InstruPrice();
        g.InstruPrice(3000);
    }
}
