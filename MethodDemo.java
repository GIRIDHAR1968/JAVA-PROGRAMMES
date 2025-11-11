class Computer{
    public void playMusic(){
        System.out.println("Music Playing");
    }
    public String getMeAPen(int cost){
        if(cost>=10)
          return "pen";
        return "Nothing";
    }
}


                              

public class MethodDemo{
    public static void main(String[] args){
        Computer c = new Computer();
        c.playMusic();
        String str = c.getMeAPen(10);     // we cannot pass empty arguments since the method above is expecting something to be there.
        System.out.println(str);
    }
}