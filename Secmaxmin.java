public class Secmaxmin {
    public static void max(int a []){
        int temp=0;
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i]<a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("second largest element is:- "+a[1]);
    }
    public static void min(int [] a){
        int temp=0;
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("second smallest : "+a[1]);
    }
    public static void main(String[] args) {
        int [] a={2,4,1,43,28,34,87,65};
        max(a);
        min(a);
    }
}
