package first;

public class ArrayClass {
    ArrayClass {
        int[] array = new int[10];

        public static void main (String[]args){
            int[] array = {1, 2, 3, 5};
            for (int index = 0; index < array.length; index++)
                for (int i = 0; i <= index; i++) {
                    System.out.println(array[index]);
                }
        }
    }
}