import java.util.*; 
class practic{
    public static void main (String args[]){
        int m=3;
        for(int i = 0; i<m; i++){
            for (int s=0; s<m-i; s++){
                System.out.print(" ");
            }
            for(int j=0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
            
        }
    }
}
//development kit
//jre component java runtime environment inside
//it has jvm java virtual machine
//sc.java to sc.class through compiler but condition is os have jvm