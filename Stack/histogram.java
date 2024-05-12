import java.util.Arrays;
import java.util.Stack;

public class histogram {

    public static int maxHistogram(int arr[]){
        int prevsmallest[]=new int[arr.length];
        int nextsmallest[]=new int[arr.length];

        //prevsmallest
        Stack<Integer>st = new Stack<>();
        prevsmallest[0]=-1;
        st.push(0);
        for(int i=1;i<arr.length;i++){
            while (!st.isEmpty() && arr[st.peek()]>=arr[i]) {
                st.pop();
            }
            if(st.isEmpty()){
                prevsmallest[i]=-1;
            }
            else{
                prevsmallest[i]=st.peek();
            }
            st.push(i);
        }

        //nextSmallest
        st=new Stack<>();
        nextsmallest[arr.length-1]=arr.length;
        st.push(arr.length-1);

        for(int i=arr.length-2;i>=0;i--){
            while (!st.isEmpty() && arr[st.peek()]>=arr[i]) {
                st.pop();
            }
            if(st.isEmpty()){
                nextsmallest[i]=arr.length;
            }
            else{
                nextsmallest[i]=st.peek();
            }
            st.push(i);
        }
        // System.out.println(Arrays.toString(nextsmallest));

        int maxArea = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int width = nextsmallest[i]-prevsmallest[i]-1;
            int area = width*arr[i];
            maxArea=Math.max(maxArea, area);
        }
        return maxArea;

    }

    //Largest Area Histogram 
    public static void main(String[] args) {
        //next smallest element in the left and right side
        int arr[]={2,1,5,6,2,3};
        int res = maxHistogram(arr);
        System.out.println(res);

       // maximal rectangle 
        int mat[][]={{1 ,0 ,1 ,0 ,0 },
                     {1, 0, 1 ,1 ,1 },
                     {1 ,1,1, 1, 1 },
                     {1, 0 ,0 ,1 ,0 }};
        int currRow[] = mat[0];
        // System.out.println(Arrays.toString(currRow));   
        int maxAns = maxHistogram(currRow);
        for(int i=1;i<mat.length;i++){   //start from second row  
            for(int j=0;j<mat[0].length;j++){
                //currRow = [1,0,1,0,0]
                //if currRow[i]==1 then add+1 if currRow[i]==1 then 0
                if(mat[i][j]==1){
                    currRow[j]=currRow[j]+1;
                }
                else{
                    currRow[j]=0;
                }
                
            }
            int currAns = maxHistogram(currRow);
            maxAns=Math.max(maxAns, currAns);
        }

        System.out.println(maxAns);

        // char[][] matrix = {
        //     {'1', '0', '1', '0', '0'},
        //     {'1', '0', '1', '1', '1'},
        //     {'1', '1', '1', '1', '1'},
        //     {'1', '0', '0', '1', '0'}
        // };
        
        // int[] currRow = new int[matrix[0].length];
        // System.out.println(Arrays.toString(currRow)); //[0, 0, 0, 0, 0]
        // int a[]=new int[5];
        // System.out.println(a[4]); //0
        
        
    }
}




