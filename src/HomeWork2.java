public class HomeWork2 {
    public static void main(String[] args) {

            int array[] = new int[50];
            int l = 0;
            for (int i = 0; i < 100; i++) {
                if (i % 2 == 1) {
                    array[l] = i;
                    l++;
                }
            }
            for (int i = 0; i < l; i++) {
                System.out.println(array[i]);
            }
    }
}
