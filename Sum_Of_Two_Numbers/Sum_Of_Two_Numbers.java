//给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
//你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
//你可以按任意顺序返回答案。
package Sum_Of_Two_Numbers;
import java.util.Scanner;
public class Sum_Of_Two_Numbers{
    public static void main(String[] args){
        Scanner sc1=new Scanner(System.in);
        Scanner sc2=new Scanner(System.in);
        System.out.println("请输入一个整数");
//        输入整数target
        int target= sc1.nextInt();
        //输入数组nums
        String nums_before=sc2.nextLine();//先输入字符串
        String[] numbers_Array= nums_before.split(",");//存入字符串数组
        int [] nums=new int[numbers_Array.length];//转换成整型数组
        //将数字存入数组
        for (int i=0;i<numbers_Array.length;i++){
            nums[i]=Integer.parseInt(numbers_Array[i]);
        };
        //(主程序)读取数组中的数字并进行加法和判断
        int size=nums.length;
        //遍历外层（被加数）
        for (int j=0;j<size;j++){
            int J=nums[j];
            //遍历内层（加数）
            for(int k=0;k<size;k++){
                int K=nums[k];
                int sum=K+J;
                if(sum==target) {
                    if (k == j) {
                        break;
                    } else  {
                        System.out.println("["+j+","+k+"]");
                    }
                }else{
                    continue;
                }
            }//内层循环的

        }//外层循环的

    }

}
