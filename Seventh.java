public class Seventh {
    public static void main(String[] args) {
        int a=2;
        int b=3;
        int c=5;
        if(a<b){
            if(b<c){
                System.out.println("C is Largest");
            }
            else{
                System.out.println("B is Largest");
            }
        }
        else{
            if(a<c){
                System.out.println("C is Largest");
            }
            else{
                System.out.println("A is Largest");
            }
        }
    }
}
