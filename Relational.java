class Relational{
    public static void main(String a[]){
        int b =10;
        int c= 12;
        System.out.println(b<c);

        int j=10;
        double k=10;
        System.out.println(k>j);


        int d=10;
        double e=10;
        System.out.println(d==e);  // Here type promotion happens for this line only int 10 will be promoted to double 10.0 to compare.

        int f=10;
        double g=12;
        System.out.println(f!=g);

        int h='A';
        double i=65;                // still works because in java characters are also stored as unicode valueswhich are ultimately numbers so the output will be true.
        System.out.println(h==i);

        int l=10;
        double m=11;
        System.out.println(m>=l);

        int n=10;
        double o=10;
        System.out.println(n<=o);
    }
}