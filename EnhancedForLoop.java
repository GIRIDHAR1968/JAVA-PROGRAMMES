public class EnhancedForLoop{
  int rollNo;
  String name;
    public static void main(String[] args){
        int nums[] = new int[4];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        

        // USAGE OF ENHANCED FOR LOOP(INSTEAD OF TRADITIONAL FOR LOOP USING COUNTERS)
        for( int n : nums){            // No counter and no array index checking everything is handled by the loop itself.
            System.out.println(n);

        }
    }
}