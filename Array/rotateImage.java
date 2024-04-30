public class rotateImage {
    public static void swap(int i,int j,int matrix[][]){
        int temp= matrix[i][j];
        matrix[i][j]=matrix[j][i];
        matrix[j][i]=temp;

    }
    public static void reverse(int arr[]){
        int s=0;
        int e = arr.length-1;
        while(s<e){
            int temp = arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int n = matrix.length;
        // System.out.println(n);
        //find transpose
        for(int i=0;i<=n-2;i++){
            for(int j=i+1;j<=n-1;j++){
                swap(i,j,matrix);
            }
        }
        //reverse row of matrix
        for(int row[]:matrix){
            reverse(row);
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Move to the next line after printing each row
        }

    }
}
