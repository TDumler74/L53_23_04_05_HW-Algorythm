public class Main {
    public static void main(String[] args) {



    int[] ints = {1, 3, 5, 9, 13, 16, 19, 22, 33, 48, 56};
        System.out.println(binarSuche(1, ints));
        System.out.println(binarSuche(19, ints));
        System.out.println(binarSuche(16, ints));
        System.out.println(binarSuche(13, ints));
        System.out.println(binarSuche(48, ints));
        System.out.println(binarSuche(56, ints));
        System.out.println(binarSuche(3,ints));

}



    //Binary search

    public static int binarSuche(int zahl,int[]arr){
        int anfang=0;
        int ende= arr.length-1;

        while (anfang<=ende){

         int   mitte=(anfang+ende)/2;

         if  (zahl<arr[mitte]){
             ende=mitte-1;
         }
         if  (zahl>arr[mitte]){
             anfang=mitte+1;
         }
         if  (zahl==arr[mitte]){
             return mitte;
         }
       }
        return -1;
    }
}







