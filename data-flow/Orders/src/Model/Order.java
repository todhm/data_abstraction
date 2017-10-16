package Model;
import java.util.ArrayList;
public class Order {
    private int OrderID;
    private ArrayList<Combo> ComboList;
    public boolean Status;
    public String Instruction;

    public Order(int orderId){
        OrderID = orderId;
        ComboList = new ArrayList<>();
        Status = false;

    }




    //Effects: return Status of Order.
    public boolean checkComplete(){
        return Status;
    }

    //Modify : this
    //Effects : add Combo object to comboList.
    public void addCombo(Combo newCombo){
        ComboList.add(newCombo);

    }

    //Requires: ComboList should not be empty.
    //Effects: print out all the combos and price of Order.
    public void printRecipt(){

    }

    //Effects: print kitchen ID to the other.
    public int returnKitchenTicket(){
        return OrderID;

    }

    //Modifies: this
    //Effects: add instruction to the order.
    public void addInstruction(){

    }

    //Effects: return totalPriceOfCombo.
    public int giveTotalPrice(){
        int sumPrice =0 ;
        for(Combo combo : ComboList){
            sumPrice += combo.returnPrice();
        }
        return sumPrice;
    }

    //Effects: return ListOfCombo.
    public ArrayList<Combo> returnComboList(){
        return ComboList;
    }

    //Modifies: this
    //Effects: change status
    public void changeStatus(){
        Status = !Status;

    }
}
