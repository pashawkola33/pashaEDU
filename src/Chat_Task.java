public class Chat_Task {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int result = suma(a);

        System.out.println("The sum of all array digits is: " + suma(a));
        System.out.println("The multiplication of all array digits is: " + multi(a));
        }
        public static int suma(int[] a){
        int sum = 0;
        for(int i = 0; i<a.length; i++){
            sum += a[i];
        }
        return sum;
    }
    public static int multi(int[]a){
        int multi = 1;
        for(int i = 0; i<a.length; i++){
            multi *= a[i];
        }
        return multi;
    }

}