package Sorting_Algorithm;

public class printf {
    static boolean LeapYear(int y){
        if(y%4==0||y%400==0) return true;
        if(y%100!=0) return true;
        else return false;
    }
    static String find(int date,int month,int year,String []d,int[]m){
        int totaldays = 0;
        for(int y = 1900;y<year;y++){
            if(LeapYear(y)) totaldays+=366;
            else totaldays+=365;
        }
        for(int n =1;n<month;n++){
            if(n==2&&LeapYear(year)) totaldays+=29;
            else totaldays+=m[n-1];
        }
        totaldays+= date-1;
        int ans = totaldays%7;
        return d[ans];
    }
  public static void main(String[] args) {
//        int x = 1;
//        String n ="aman";
//        System.out.printf("%03d%n",x);
//        System.out.printf("%3d%n",x);
//        System.out.printf("%15s",n);
//        System.out.printf("%-15s",n);
      String[]dayname = {"monday","Tuesday","Wednesday","THURSDAY","FRiday","Saturday","sunday"};
      int []month = {31,28,31,30,31,30,31,31,30,31,30,31};
      System.out.println(  find(2,8,2021,dayname,month));

    }
}