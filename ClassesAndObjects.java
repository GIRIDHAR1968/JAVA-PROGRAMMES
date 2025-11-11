class Addition{
    public int operation(int c, int d){
        int result = c+d;
        return result;
    }
}

public class ClassesAndObjects{
    public static void main(String[] args){
        int a = 4;
        int b = 10;
        Addition add = new Addition();
        int result = add.operation(a,b);
        System.out.println(result);

    }
}