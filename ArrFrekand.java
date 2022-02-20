import java.util.Arrays;

public class ArrFrekand {
    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20}; // 5  10 10 10 20 20 20 20
        int count = 0;

        Arrays.sort(list); // Dizideki elemanları küçükten büyüğe sırala

        for (int i = 0; i < list.length; i++) {
            count = 0;
            for (int j = 0; j < list.length; j++) {
                if (list[i] == list[j]) {
                    count++;

                }
            }

            if (i == 0 && list[i + 1] == list[i]) {
                System.out.println(String.format("%d 'den %d tane var.", list[i], count));
            }

            if (i == 0 && list[i + 1] != list[i]) {
                System.out.println(String.format("%d 'den %d tane var.", list[i], count));
            }
            if (i != 0 && list[i - 1] != list[i]) {
                System.out.println(String.format("%d 'den %d tane var.", list[i], count));
            }
        }
    }
}


