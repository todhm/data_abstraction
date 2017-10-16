package Model;

public class Combo {
    private int ComboID;
    private String ComboName;
    private int Price;

    public Combo(int comboid, String comboname, int price){
        ComboID = comboid;
        ComboName = comboname;
        Price = price;
    }

    public int returnPrice(){
        return Price;
    }


}
