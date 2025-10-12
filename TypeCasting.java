class TypeCasting{
    public static void main(String a[]){
        byte b=12;            /* Type Conversion */
        int c=b;
        System.out.println(b);

        int d=257;
        byte e=(byte)d;        // Type Casting
        System.out.println(e);

        float f=5.6f;
        int t= (int)f;           //Type Casting
        System.out.println(t);

        char g='a';
        int h=g;                      // General testing
        System.out.println(h);

        byte i=10;
        byte j=20;
        int k= i*j;
        System.out.println(k);// Type promotion

    }
}