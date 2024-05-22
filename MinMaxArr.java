/**
 * MinMaxArr
 */
public class MinMaxArr {
public static void max(int a[]){
    int max=a[0];
for(int i=0; i<a.length; i++){
if(max<a[i]){

max=a[i];
}
}
System.out.println("max of array:- "+max);
}
public static void min(int a[]){
    int min=a[0];
    for(int i=0; i<a.length; i++){
        if(a[i]<min){
            min=a[i];
        }
    }
    System.out.println("min of array:- " +min);
}
    public static void main(String[] args) {
        int [] a={2,3,1,5,30};
        max(a);
        min(a);
    }
}