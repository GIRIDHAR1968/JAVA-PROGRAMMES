public class Grading {
   public static void main(String[] args) {
       
        int score = 75;
        char grade = 'B';
        
        // TODO: Check pass or fail
        if(score >=50)
            System.out.println("Passed");
        else
            System.out.println("Failed");
        if(score>=90){
            grade='A';
            System.out.println("Grade: "+grade);
        }
        else if(score>=75&&score<=89){
            grade='B';
            System.out.println("Grade: "+grade);
        }    
        else if(score>=60&&score<=74)
        { 
            grade='C';
            System.out.println("Grade: "+grade);
        }
        else{
              grade='D';
            System.out.println("Grade: "+grade);
        }
        // TODO: Determine grade based on score
       
   }
}