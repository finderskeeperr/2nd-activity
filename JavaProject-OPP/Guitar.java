public class Guitar extends Instruments{ // inheritance
    private String name; // encapsulation

    int price;
    
    public void InstruPrice(){
        System.out.println("They wanted to buy, but most of the guitar costs almost 7000 pesos.");
    }

    public void InstruPrice(int specPrice) // overloading
    {
        this.price = specPrice;
    }



    public void type(){

        System.out.println("Lorgem ");
    }

    public void setName(String InstrumentName){ //setter

        name = InstrumentName;
    }

    public String getName(){ // getter
        return name;
        
    }




}