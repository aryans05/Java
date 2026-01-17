public class Test {

    public static void main(String[]args){

        int [] a = {1,2,3,4,5,6};
        sumofArray(a);
    }

    public static void sumofArray(int[]arr){

        int res =0;
        for(int i : arr){
            res+=1;
        }
        System.out.println(res);
    }
}
