public class Leapyear{
     public static void main (String[] args){
       
       int a=2024;
        int b =2026;
       
       String result = (a%400==0 || a%4==0 && a%100 !=0)?"a is leap year":"a is non leap year";
        String result2 = (b%400==0 || b%4==0 && b%100 !=0)?"b is leap year":"b is non leap year";

       System.out.println(result);
        System.out.println(result2);

}
}