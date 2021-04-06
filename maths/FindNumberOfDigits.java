import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(count(n));
        System.out.println(count1(n));
        System.out.println(count2(n));
    }
    static int count(int n){
        int cnt=0;
        while(n>0){
            n= n/10;
            cnt++;
        }// 123 -> n/10->12 (cnt=1)  -------n/10->1 (cnt=2)----------(n=1;;>0) n = 0; (cnt=3) exit loop;)
        return cnt;
    }
    static int count1(int n){
        if(n==0) return 0;
        return 1+count1(n/10);
    }
/*    |
    |                                       |
    |                                       |
    |1+cnt(0)//(1/10)   1+0                 |  ---> RECURSIVE STACK
    |1+cnt(1)//(12/10)    1+1               |
    |1+cnt(12)//(123/10)   1+1+1 ->ans = 3  |
 */
    static int count2(int n){
        return (int) Math.floor((Math.log10(n)+1));
    }
}
