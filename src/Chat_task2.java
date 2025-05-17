public class Chat_task2 {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,12,14,16};
        int[] result;
        isNumberEven(arr);
    }
    public static int[] isNumberEven(int[] arr){
        for(int i  = 0; i<arr.length; i++){
            if(arr[i] % 2 == 0){
                System.out.println(arr[i]);
            }
        }
        return arr;
    }
}
