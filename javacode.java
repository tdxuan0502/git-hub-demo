import java.util.Scanner;

public class javacode {
    public static void nhapMang(int M[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < M.length; i++) {
            System.out.print("M[" + i + "]= ");
            M[i] = sc.nextInt();
        }
    }

    public static void xuatMang(int M[]) {
        for (int i = 0; i < M.length; i++) {
            System.out.print(M[i] + "\t");
        }
    }

    public static void selectionSort(int M[]) {
        int min;
        for (int i = 0; i < M.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < M.length; j++) {
                if (M[j] < M[min])
                    min = j;
            }
            if (min != i) {
                int temp = M[i];
                M[i] = M[min];
                M[min] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("nhap so toi da cho mang: ");
        n = sc.nextInt();
        int M[] = new int[n];
        nhapMang(M);
        xuatMang(M);
        selectionSort(M);
        System.out.println();
        System.out.println("mang sau khi sap xep:");
        xuatMang(M);
    }
}
