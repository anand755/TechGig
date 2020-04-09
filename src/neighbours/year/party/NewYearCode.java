package neighbours.year.party;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NewYearCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCaseCount = scanner.nextInt();

        List<Integer> ticketList = new ArrayList<>();
        List<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < testCaseCount; i++) {
            int houseCount = scanner.nextInt();

            //Taking input
            for (int j = 0; j < houseCount; j++) {
                ticketList.add(scanner.nextInt());
            }

            //Finding result
            int ticketSum, ticket1, ticket2;
            int finalTicketSum = 0, finalTicket1, finalTicket2 = 0;
            String result = "";

            for (int k = 0; k < ticketList.size() - 2; k++) {
                ticket1 = ticketList.get(k);

                for (int l = k; l < ticketList.size() - 2; l++) {
                    ticket2 = ticketList.get(l + 2);
                    ticketSum = ticket1 + ticket2;

                    if (ticketSum < ticket1 || ticketSum < ticket2) {
                        ticketSum = ticket1 > 0 ? ticket1 : ticket2;
                        ticket1 = ticket1 > 0 ? ticket1 : 0;
                        ticket2 = ticket2 > 0 ? ticket2 : 0;
                    }
                    if (ticketSum > finalTicketSum) {
                        finalTicketSum = ticketSum;
                        finalTicket1 = ticket1;
                        finalTicket2 = ticket2;
                        result = ticket2 + "" + ticket1;
                    } else if (ticketSum == finalTicketSum) {
                        if (ticket2 > finalTicket2) {
                            finalTicket1 = ticket1;
                            finalTicket2 = ticket2;
                            result = finalTicket1 + "" + finalTicket2;
                        }
                    }
                }
            }
            ticketList.clear();
            //Removing preceding zero and the adding to result list
            resultList.add(Integer.valueOf(result));
        }
        resultList.forEach(System.out::println);
    }
}
