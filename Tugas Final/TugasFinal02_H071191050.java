import java.util.Scanner;
    class TugasFinal02_H071191050 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("p = ");
            int p = sc.nextInt();
            System.out.print("q = ");
            int q = sc.nextInt();
            int A[][] = new int [p][q];

            System.out.print("r = ");
            int r = sc.nextInt();
            System.out.print("s = ");
            int s = sc.nextInt();        
            int B[][] = new int [r][s];

            int sum;

                System.out.println("Input matriks A");
                for (int i = 0; i < p; i++){
                    for (int j = 0; j <q; j++){
                        System.out.print("matriks A (" + i + "," + j + ") = ");
                        A[i][j] = sc.nextInt();
        
                    }
                }
            System.out.println();
            System.out.println("Input matriks B");
                for (int i = 0; i < r; i++){
                    for (int j = 0; j <s; j++){
                    System.out.print("matriks B (" + i + "," + j + ") = ");
                    B[i][j] = sc.nextInt();
    
                    }
                }

                    // AB
            if (p != s) {
                System.out.print("Perkalian tidak bisa dilakukan");
            }else {
                for (int i = 0; i < p; i++) {
                    for (int j = 0; j < s; j++) {
                        sum = 0;
                        for (int k = 0; k < q; k++) {
                            sum = sum + A[i][k] * B[k][j];
                        }
                        System.out.print(sum + " ");
                    }
                    System.out.println();
                }
            }

            //BA
            if (r != q) {
                System.out.print("Perkalian tidak bisa dilakukan");
            } else {
                for (int i = 0; i < r; i++) {
                    for (int j = 0; j < q; j++) {
                        sum = 0;
                        for (int k = 0; k < s; k++) {
                            sum = sum + B[i][k] * A[k][j];
                        }
                        System.out.print(sum + " ");
                    }
                    System.out.println();
                }
            
            }
        }
    }