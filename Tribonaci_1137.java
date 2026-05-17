class Tribonaci_1137 {
  public static void main(String[] args) {
    Tribonaci_1137 t = new Tribonaci_1137();
    t.tribonacci(4);
  }

    public int tribonacci(int n) {

        if(n==0){
          System.out.println(0);
            return 0;
        }else if(n==1||n==2){
            System.out.println(1);
            return 1;
        }else{

            int firstterm = 0 ;
            int secondterm = 1 ;
            int thirdterm = 1 ;
            int fourthterm = 0 ;

            for(int i = 1 ; i <= n ; i++){

                fourthterm = firstterm + secondterm + thirdterm;

                firstterm = secondterm; 
                secondterm = thirdterm;
                thirdterm = fourthterm;
                
            }
            System.out.println(firstterm);
            return firstterm;

        }
        
    }
}