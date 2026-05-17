class Fabonaaci_509 {
  public static void main(String[] args) {
    Fabonaaci_509 f = new Fabonaaci_509();
    f.fib(4);
  }

    public int fib(int n) {
        if(n==0){
            System.out.println(0);
            return 0;
        }
        if(n==1){
          System.out.println(1);
            return 1;
        }

        int firstnum = 0 ;
        int secondnum = 1 ;
        int thirdnum =0 ;

        for(int i = 1; i < n ; i++){
            thirdnum = firstnum + secondnum;

            firstnum= secondnum;
            secondnum = thirdnum;

        }
        System.out.println(thirdnum);
        return thirdnum;
    }
}