public class TwoD {
    
    public static void main(String[] args) {
        int arr[][] = { {1,2,3,},
                        {2,3,4},
                        {6,7,8}};
        int n = arr.length;
        int m = arr[0].length;

        for(int i = 0;i<=n;i++){
            for(int j = 0;j<=m;j++){
                if(i==j)
                    System.out.print(arr[i][j]+" ");
            }
        }


        for(int i = 0;i<=n;i++){
            for(int j = 0;j<=m;j++){
                if(i+j==n-1)
                    System.out.print(arr[i][j]+" ");
            }
        }
        // System.out.println(n);
        // System.out.println("n");
        
    }
}
