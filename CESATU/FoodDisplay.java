package CESATU;

public class FoodDisplay {
    public float id;
    public String menu;

    FoodDisplay(int id, String menu) {
        this.id =id;
        this.menu =menu;
    }
    public void display(){
        System.out.println("Menu yang di pesan : " + id + " " + " Nama menu : "+ menu);
    }
    public static void main(String[] args) {
        
        FoodDisplay[] arry;

        arry= new FoodDisplay[2];

        arry[0] = new FoodDisplay(001, "ES TEH");
        arry[0].display();
    }
}
