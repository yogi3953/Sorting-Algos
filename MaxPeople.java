import java.util.*;

class MaxPeople {
    public static void main(String[] args) {
        int[] entry = { 1, 2, 9, 5, 5 };
        int[] exit = { 4, 5, 12, 9, 12 };

        List<int[]> inParty = new ArrayList<>();

        for (int i : entry)
            inParty.add(new int[] { i, +1 });

        for (int i : exit)
            inParty.add(new int[] { i, -1 });

        inParty.sort((a, b) -> Integer.compare(a[0], b[0]));

        Set<Integer> maxTimes = new HashSet<>();
        int CurPeople = 0, Maximum = 0;
        for (int i[] : inParty) {
            CurPeople += i[1];
            if (CurPeople > Maximum) {
                Maximum = CurPeople;
                maxTimes.clear();
                maxTimes.add(i[0]);
            }

            if (CurPeople == Maximum)
                maxTimes.add(i[0]);
        }
        System.out.println(maxTimes);
    }

}