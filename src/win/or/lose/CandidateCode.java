package win.or.lose;

import java.io.*;
import java.util.*;

public class CandidateCode {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int testCaseCount = scanner.nextInt();
        String result[] = new String[testCaseCount];

        for (int i = 0; i < testCaseCount; i++) {
            int playersCount = scanner.nextInt();

            int playersPower[] = new int[playersCount];
            int villiansPower[] = new int[playersCount];

            for (int j = 0; j < playersCount; j++) {
                villiansPower[j] = scanner.nextInt();
            }
            Arrays.sort(villiansPower);

            for (int j = 0; j < playersCount; j++) {
                playersPower[j] = scanner.nextInt();
            }
            Arrays.sort(playersPower);

            String res = "WIN";
            for (int j = 0; j < playersCount; j++) {
                if (playersPower[j] > villiansPower[j]) {
                    continue;
                } else {
                    res = "LOSE";
                }
            }

            result[i] = res;

        }

        for (int i = 0; i < testCaseCount; i++) {
            System.out.println(result[i]);
        }
    }
}