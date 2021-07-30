package Arrays;

/*
Given a set of non-overlapping intervals, insert a new interval into the intervals (merge if necessary).
 */

import java.util.ArrayList;

class Interval {

    int start;
    int end;
    Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }
}

public class MergeInterval {

    public static ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {

        if(intervals.isEmpty()) {
            intervals.add(newInterval);
            return intervals;
        }

        if(newInterval.start > newInterval.end) {
            int temp = newInterval.start;
            newInterval.start = newInterval.end;
            newInterval.end = temp;
        }

        int i=0;
        int start = newInterval.start;
        int end = newInterval.end;

        int startIndex = -1, endIndex = -1;  //will give us the position where the newly merged or newInterval as it is has to be inserted

        //calculate in which existing intervals do the endpoints of the newInterval lie
        for(Interval in : intervals) {
            if(start >= in.start && start <= in.end)
                startIndex = i;
            if(end >= in.start && end <= in.end)
                endIndex = i;
            i++;
        }

        //both start and end points of newInterval do not lie inside any existing interval
        if(startIndex==-1 && endIndex==-1) {

            //find the position at which the newInterval has to be inserted in the list

            //calculate start of newInterval is after which interval's end point, startIndex will have the position next to that
            startIndex=0;
            for(i=0; i<intervals.size(); i++)
                if(start > intervals.get(i).end)
                    startIndex = i+1;

            //calculate end of newInterval is before which interval's start point, endIndex will have the position right before that
            endIndex=intervals.size()-1;
            for(i=intervals.size()-1; i>=0; i--) {
                if(end < intervals.get(i).start)
                    endIndex = i-1;
            }

            //remove existing intervals that lie completely inside the range of [startIndex - endIndex] inclusive
            for(i = startIndex; i<=endIndex; i++)
                intervals.remove(startIndex);

            //add the newInterval at the position given by startIndex
            intervals.add(startIndex, newInterval);

            return intervals;
        }

        //the start point of newInterval does not lie inside any existing interval
        if(startIndex == -1) {
            //start from the end of the list and calculate the interval whose start point lies after the start point of newInterval
            for(i=intervals.size()-1; i>=0; i--) {
                if(start <= intervals.get(i).start)
                    startIndex = i;
            }
        }

        //the end point of newInterval does not lie inside any existing interval
        if(endIndex == -1) {
            //start from the start of the list and calculate the interval whose end point lies before the end point of newInterval
            for(i=0; i<intervals.size(); i++) {
                if(end >= intervals.get(i).end)
                    endIndex = i;
            }
        }

        start = Math.min(intervals.get(startIndex).start, start);
        end = Math.max(intervals.get(endIndex).end, end);

        intervals.get(startIndex).start = start;
        intervals.get(startIndex).end = end;

        for(i=startIndex + 1; i <= endIndex; i++) {
            intervals.remove(startIndex+1);
        }

        return intervals;

    }

    public static void main (String ar[]) {

        Interval i1 = new Interval(57358781,14055448);
        //Interval i2 = new Interval(45639660,84793834);
        Interval newInterval = new Interval(45639660,84793834);

        ArrayList<Interval> intervals = new ArrayList<>();
        intervals.add(i1);
        //intervals.add(i2);

        ArrayList<Interval> result = insert(intervals, newInterval);

        for(Interval in : result) {
            System.out.print("( "+in.start+", "+in.end+" ) ");
        }
    }

}
