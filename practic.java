import java.util.*; 
class practic{
    public static void main (String args[]){
        

        for(int k=1; k<16; k++){
            if(k%3==0){
                System.out.println("fizz");
            }
            else if(k%5==0){
                System.out.println("buzz");
            }
            else if(k%3==0 && k%5==0){
                System.out.println("fizzbuzz");
            }
            else{
                System.out.println(k);
            }
        }
    }
}
//development kit
//jre component java runtime environment inside
//it has jvm java virtual machine
//sc.java to sc.class through compiler but condition is os have jvm