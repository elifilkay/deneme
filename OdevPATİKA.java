import java.util.Arrays;

public class OdevPATİKA {
    public static void main(String[] args) {
        int[]arr={10,20,60,10,90,23,11};
        System.out.println("Dizinin boyutu n : "+arr.length);
        System.out.println("Dizinin elemanlarını giriniz: ");
        for (int i=0;i< arr.length;i++){
            System.out.println((i+1)+".elemanı: "+arr[i]);

        }
        Arrays.sort(arr);
        System.out.println("Sıralama: "+Arrays.toString(arr));


    }
}
