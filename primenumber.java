public class primenumber{
    public static void main(String arg[]){
        int i=23;
        for(i=23;i<45;i++){
            if(isprime(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean isprime(int i){
        if(i<=1){
            return false;
        }
        for(int j=2;j<=i/2;j++){
            if(i%j==0){
                return false;
            }

        }
        return true;
    }

}