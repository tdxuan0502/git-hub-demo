import java.util.Scanner;

public class testquicksort {
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

    public static void quicksort(int M[], int left, int right) {
        if (left >= right)
            return;
        int pirot = M[(left + right) / 2];
        int i = left, j = right;
        do {
            while (M[i] < pirot)
                i++;
            while (M[j] > pirot)
                j--;
            if (i <= j) {
                int temp = M[i];
                M[i] = M[j];
                M[j] = temp;
                i++;
                j--;
            }
        } while (i < j);
        quicksort(M, left, j);
        quicksort(M, i, right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("nhap so toi da cho mang: ");
        n = sc.nextInt();
        int M[] = new int[n];
        nhapMang(M);
        xuatMang(M);
        quicksort(M, 0, M.length - 1);
        System.out.println();
        System.out.println("mang sau khi sap xep:");
        xuatMang(M);
    }
}
