public class palestine{
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String BLACK = "\u001B[30m";
    public static final String GREEN = "\u001B[32m";
    public static void main(String[] args) {
        
        int n = 5;

        for (int i = 0; i<= n; i++){

            for(int j = 0; j <2*i+1; j++){
                System.out.print(RED+"*"+RESET);
                        }
                        
            for (int j = 0; j<4*n-(i*2+1); j++) {
            if(i<(n*2/3)){
            System.out.print(BLACK+"*"+RESET);
            }else{
                System.out.print("*");
            }
               
        }
        System.out.println();
    }
    
    for (int i = 1; i <= n; i++) {
        for(int j = 0; j <2*(n-i)+1; j++){
            System.out.print(RED+"*"+RESET);
        }

        for(int j = 0; j<4*n-(2*(n-i)+1); j++){
            if(i<(n*2/3)){
                System.out.print("*");
            }else{
                System.out.print(GREEN+"*"+RESET);
            }
        }
        System.out.println();
    }

    
       
       

        
        



}
}