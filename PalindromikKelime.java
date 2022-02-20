public class PalindromikKelime {
    public static void main(String[] args) {

        System.out.println(isPalindrome("kavak")); //ada,kavak
    }

     static boolean isPalindrome(String str) {
        int i=0; //baslangıç indeksi
        int j= str.length()-1;//sondan indeks
        while (i<j) {
            if (str.charAt(i) == str.charAt(j)) {
                return true;
            }
            i++;
            j--;
        }
        return false;
    }
}
