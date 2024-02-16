public class reverseno1 {
public static void main(String args[]){
    int rev=0;
    int num=10999;
    while(num>0){
      int lastdigit=num%10;
      rev=(rev*10)+lastdigit;
      num=num/10;
    }
    System.out.println(rev);
}
}
