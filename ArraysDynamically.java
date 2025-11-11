import java.util.Scanner;
 public class ArraysDynamically{
    public static void main(String[] args){
        int nums[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter all 5 elements of the array");
        for(int i = 0; i < nums.length; i++ )
          nums[i] = sc.nextInt();
        for(int i = 0; i <=4; i++)
          System.out.println(nums[i]);
        sc.close();
    }
}