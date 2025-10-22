
package findinglargestnumber;

public class FindingLargestnumber {

    public static void main(String[] args) {
    int n = 1;
    while(n*n*n<=12000){
    n++;
    }    
    int largestN =n-1; 
    System.out.println("the largest n such that n^3<12000 is "+ largestN );
    
        
        
    }
    
}
