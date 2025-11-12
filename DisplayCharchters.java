package displaycharchters;


public class DisplayCharchters {
    public static void main(String[] args) {
        printChars('1', 'z', 5);
    
    }
    
    
    public static void printChars(char ch1,char ch2,int numberPerline){
    
        int count = 0;
        for(char ch = ch1;ch<=ch2;ch++){
            System.out.print(ch +" ");
            count++;
            if(count%numberPerline==0){
                System.out.println();
            }
        
        }
            System.out.println("");
        
        
    
        }
    
}
