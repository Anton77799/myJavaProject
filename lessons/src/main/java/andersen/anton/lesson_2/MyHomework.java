package andersen.anton.lesson_2;

import java.util.ArrayList;

public class MyHomework {
    public static void main(String[] args){
        Task1(6,6);
        Task2(-7);
        Task3(12);
        Task4("Деревяшка", 6);
        Task5(1456);
        Task6();
        Task7();
        Task8();
        Task9();
        Task10(12, 40);
        Task10_1();
        Task10_2(new int[]{2,2,2,2,8,16,0});
    }
    public static boolean Task1(int a, int b){
        if (a+b>=10 && a+b<=20){
            return true;
        }
        else {
            return false;
        }
    }
    public static void  Task2(int a){
        if (a>=0){
            System.out.println("Число положительно");
        }
        else {
            System.out.println("Число отрицательное");
        }
    }
    public static boolean Task3(int a){
        if (a<0){
            return true;
        }
        else {
            return false;
        }
    }
    public static void Task4(String s, int a){
        for (int i=0; i<a; i++){
            System.out.println(s);
        }
    }
    public static boolean Task5(int a){
        if (a%400==0){
            return true;
        }
        else if (a%100==0){
            return false;
        }
        else if (a%4==0){
            return true;
        }
        else {
            return false;
        }
    }
    public static void Task6(){
        int a[]={1,0,0,1,1,1,1,0,1,0,1};
        for (int i=0; i<a.length; i++){
            if (a[i]==1){
                a[i]=0;
            }
            else{
                a[i]=1;
            }
        }
    }
    public static void Task7(){
        int a[]= new int[100];
        for (int i=0; i< a.length; i++){
            a[i]=i+1;
        }
    }
    public static void Task8(){
        int a[]= {1,5,3,2,11,4,5,2,4,8,9,1};
        for (int i=0; i< a.length;i++){
            if (a[i]<6){
                a[i]*=2;
            }
        }
    }
    public static void Task9(){
        int a[][]= new int[7][7];
        for (int i=0; i<7;i++){
            for (int j=0; j<7; j++){
                if (i==j){
                    a[i][j]=1;
                }
                if (i+j==6){
                    a[i][j]=1;
                }
            }
        }
    }
    public static void Task10(int len, int initialValue){
        int a[]= new int[len];
        for (int i=0; i<len; i++){
            a[i]= initialValue;
        }
    }
    public static void Task10_1(){
        int a[]={5,7,8,20,10,75,18,58,1,342,99,28,90};
        int min=a[0];
        int max=a[0];
        for (int i=0; i< a.length;  i++){
            if (a[i]>max){
                max = a[i];
            }
            if (a[i]<min){
                min = a[i];
            }
        }
    }
    public static boolean Task10_2(int a[]){
        int sum = 0;
        int sum1 = 0;
        int c=0;
        for (int i=0; i< a.length; i++){
            sum+=a[i];
        }
        if (sum%2==0){
            for (int i=0; i< a.length; i++){
                sum1+=a[i];
                if (sum/2==sum1){
                    c++;
                }
            }
        }
        if(c>0){
            return true;
        }
        else {
            return false;
        }

    }


}