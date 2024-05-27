public class FirstDuplicate {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 1, 2, 5, 6 };
        for (int i = 0; i < a.length;) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    System.out.println("first element repeated is:- " + a[i]);
                }
            }
            break;
        }
    }
}
