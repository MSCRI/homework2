package untitled;

import java.util.Scanner;

public class main2{
        public static void main(String[] args) {


            Scanner scanner = new Scanner (System.in);
            if(scanner.hasNextInt()) {
                int n = scanner.nextInt();
                int count = 0;
                for (int i = 2; i <= n; i++) {
                    int sign = 1; // 用于标记是否是素数
                    for (int j = 2; j < i; j++) {
                        if (i % j == 0 ) {
                            sign = 0;
                            break;
                        }
                    }
                    if (sign == 1) {
                        System.out.print(i+"\t");
                        count++;
                        if(count % 5 == 0) {
                            System.out.println();
                        } // 2,3,5,7,11,13,17,19,23,29,31,37,41,43,53,59,61,67,71,73,79,83,89,97。
                    }
                }
            }
            scanner.close(); // 关闭 IO 流
        }
    }

