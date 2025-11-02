public class LoopsExercise {
    public static void main(String[] args) {
    
    System.out.print("For Loop:");
        for (int i=1;i<=5;i++){
            System.out.print(" " + i);
        }
      int i=1;
        System.out.println();
        System.out.print("While Loop:");
        while(i<=5){
            System.out.print(" " + i);
            i++;
        }
        i=1;
        System.out.println();
        System.out.print("Do-While Loop:");
        do{
            System.out.print(" " + i);
            i++;
        }while(i<=5);
        System.out.println();
    }
}