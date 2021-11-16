import java.util.ArrayList;
import java.util.List;

public class BuyingShowTickets {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        li.add(2);
        li.add(6);
        li.add(3);
        li.add(4);
        li.add(5);
        //2,6,3,4,5
        //2

        //12
        System.out.println(waitingTime(li, 2));
    }
    static int waitingTime(List<Integer> tickets, int p) {
        int total = 0;
        for(int i = 0; i < tickets.size(); i++) {
            int toAdd = 0;
            if(i<=p)
                toAdd = Math.min(tickets.get(i), tickets.get(p));
            else
                toAdd = Math.min(tickets.get(i), tickets.get(p) - 1);
            total += toAdd;
        }
        return total;
    }

}

//    def waitingTime(tickets, p):
//        return sum([min(tickets[i], tickets[p]) if i<=p else min(tickets[i], tickets[p] - 1) for i in range(len(tickets))])
