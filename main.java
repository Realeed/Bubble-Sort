 public class main
 {
        public static void main(String[] args) {

            int[] array = {2, 3, 8, 6, 5, 4, 7, 1, 10, 9, 11, 5, 3, 7};
            int y;
            for (int a = 0; a < array.length - 1; a++) {
                for (int i = 0; i < array.length - 1; i++) {
                    if (array[i] > array[i+1]) {
                        y = array[i];
                        array[i] = array[i+1];
                        array[i+1] = y;

                    }
                }
            }
            for (int x : array) {
                System.out.print(x + " ");
            }

        }
    }

