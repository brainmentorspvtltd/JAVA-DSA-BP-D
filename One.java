class One{
    public static void main(String[] args) {
        int x = 100;
        var y = 200;
        int arr[] = {10,20,30,40};
        for(var i : arr){
            System.out.println(i);
        }
        int []arr2 = {10,20,30,40};
        int arr3[] = new int[]{10,20,30,40};
        int arr4[] = new int[5];
       // int a [][] = new int[3][4];
       int b[][] =new int[3][];
       b[0] =new int[5];
       b[1] = new int[6];
       b[2] = new int[10];
       for(int e[] : b){
        for(int x1 : e){
            System.out.print(x1 + " ");
        }
        System.out.println();
       }
    //    for(int i = 0; i<b.length; i++){
    //     for(int j = 0; j<b[i].length; j++){
    //         System.out.print(b[i][j]+" ");
    //     }
    //     System.out.println();
    //    }

    }
}