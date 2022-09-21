public class Eighth {
    public static void main(String[] args) {
        int a=2;
        int b=3;
        int c=5;
        if(a>b){
            if(b>c){
                System.out.println("C is Smallest");
            }
            else{
                System.out.println("B is Smallest");
            }
        }
        else{
            if(a>c){
                System.out.println("C is Smallest");
            }
            else{
                System.out.println("A is Smallest");
            }
        }
    }
}
