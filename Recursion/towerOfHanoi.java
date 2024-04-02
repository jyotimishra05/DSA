public class towerOfHanoi {
    public static void towerOfHanoii(int n,char src,char aux,char des){
        if(n==1){
            System.out.println(src+"->"+des);
            return;
        }
        towerOfHanoii(n-1, src, des, aux);
        towerOfHanoii(1, src, aux, des);
        towerOfHanoii(n-1, aux, src, des);
    }
    public static void main(String[] args) {
        towerOfHanoii(3,'A','B','C');
    }
    
}
