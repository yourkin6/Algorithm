//给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
//回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
//例如，121 是回文，而 123 不是。
package Palindrome;
import java.util.Scanner;
public class Palindrome {
    public static void main (String[]args){
        //输入一个数字
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int a=sc.nextInt();
        Boolean b=judge_Numbers(a);
        if(b==true) {
            System.out.println("这个数是回文数");
        }else if(b==false) {
            System.out.println("这个数不是回文数");
        }
    }
    //定义一个方法，使输入的数字变为字符串，将其反转后与原数比较
    public static boolean judge_Numbers(int number) {
        String Char_Groups = String.valueOf(number);//转换成字符串
        String Reversed = new StringBuilder(Char_Groups).reverse().toString();//反转字符串
        //判断前后两个字符串是否相等
        return Char_Groups.equals(Reversed);
    }

}
