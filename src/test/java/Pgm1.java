public class Pgm1 {
    public static void main(String []args){
        String s="907wefj&65";
        String digit="";
        for(int i=0;i<s.length();i++){
            Character c=s.charAt(i);
            if(Character.isDigit(c)){
                digit=digit+c;
            }
        }System.out.println(digit);

        int num=Integer.parseInt(digit),rem=0,rev=0;
        while(num>10){
        rem=num%10; //
        rev=rev*10+rem;
        num=num/10;

    }
        System.out.println(rev);}
}
