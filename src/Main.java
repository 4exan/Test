public class Main {

    static void reverse(int[] array){
        for(int i = array.length-1; i != -1; i--){
            System.out.println(array[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] array = {1, 2 ,3 ,4, 5};
        reverse(array);
    }
}
