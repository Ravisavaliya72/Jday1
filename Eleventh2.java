public class Eleventh2 {
    public static void main(String[] args) {
        int a;
        int b;
        int c=5;
        for(a=0;a<c;a++){
            for(b=c-a;b>1;b--){
                System.out.print(" ");
            }
            for(b=0;b<=a;b++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
