import java.util.Arrays;
import java.util.Scanner;
public class TestDemo{
    public static void main(String[] args){
//        KiKi非常喜欢网购，在一家店铺他看中了一件衣服，
//        他了解到，如果今天是“双11”（11月11日）则这件衣服打7折，“双12” （12月12日）则这件衣服打8折，
//        如果有优惠券可以额外减50元（优惠券只能在双11或双12使用），求KiKi最终所花的钱数。
        Scanner scan = new Scanner(System.in);
        double price = scan.nextDouble();
        int month = scan.nextInt();
        int day = scan.nextInt();
        int coupon = scan.nextInt();
        if(month==day&&month==12){
            price = price*0.8;
        }
        if(month==day&&month==11){
            price = price*0.7;
        }
        if(coupon==1){
            price = price-50;
        }
        System.out.printf("%.2f",price>0?price:0.0);
    }

    public static void main1(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int[] array = new int[scan.nextInt()];
            for(int i=0;i<array.length;i++){
                array[i] = scan.nextInt();
            }
            Arrays.sort(array);// sort方法排序默认是从小到大排序
            // 这里又新建了一个数组，把从小到大排序后的数组从后往前放入新建数组中，则得到一个从大到小排列的数组
            // 这里也可以不新建数组，直接在原来数组的基础，把前半部分和后半部分交换也可以得到一个从大到小排列的数组
            int[] re_array = new int[array.length];
            for(int j=0;j<array.length;j++){
                re_array[j] = array[array.length-1-j];
            }
            for(int k = 0;k<5;k++){
                System.out.print(re_array[k]+" ");
            }
        }
    }
}