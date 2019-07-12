import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu cua mang:");
        size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhap phan tu thu " + (i + 1));
            array[i] = sc.nextInt();
        }
        int min = array[0];
        for (int i = 1; i < size; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Gia tri nho nhat cua mang:" + min);
    }
}
