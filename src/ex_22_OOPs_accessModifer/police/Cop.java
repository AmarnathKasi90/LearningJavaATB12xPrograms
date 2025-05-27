package ex_22_OOPs_accessModifer.police;

public class Cop {
    private int gun;
   public String iCard;

    // PC
    public Cop(int bullet){
        this.gun = bullet;
    }
    public Cop(String iCard){
        this.iCard = iCard;
      }

    // Method / Behav
    protected void canIShoot(){
        System.out.println("Yes You can shoot!");
    }
    public void show_iCard()
    {

        System.out.println("You can view iCard");
    }

}