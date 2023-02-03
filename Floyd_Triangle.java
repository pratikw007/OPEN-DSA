public class Floyd_Triangle {

    public static void Floyd_Triangle(int n){
        int count = 1;
//        outer loop
        for (int i = 1; i<=n;i++){
//            inner - how many times eill counter be printed
            for (int j = 1; j<=i;j++){
                System.out.print(count+" ");
                count = count + 1;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
      Floyd_Triangle(5);
    }
}

//        1
//        2 3
//        4 5 6
//        7 8 9 10
//        11 12 13 14 15
