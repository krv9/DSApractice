class ReverseArray {
    public static void reverse(char[] a){
        for ( int i=a.length-1; i>=0; i--){
            System.out.print(a[i]+ " ");
        }
    }
    public static void main(String[] args) {
        char[] a = new char[] { 'k','i','a'};
        System.out.println("original array");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("After reverse");
        reverse(a);
    }
}