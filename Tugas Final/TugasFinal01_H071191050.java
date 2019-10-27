import java.util.Scanner;
class TugasFinal01_H071191050{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        double[] arr = new double[in];
        double[] err = new double[in];
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            double n = sc.nextDouble();
            arr[i] = n;
            sum = sum + arr[i];
        }
        double rata = sum / arr.length;
        for (int i = 0; i < arr.length; i++) {
            err[i] = Math.sqrt(Math.pow(rata - arr[i],2));
        }
        System.out.println("NO\tData\tError");
        System.out.println(".......................");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d\t",i + 1);
            System.out.printf("%.2f\t",arr[i]);
            System.out.printf("%.2f\n",err[i]);
        }

    }
}
