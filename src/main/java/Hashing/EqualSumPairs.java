package Hashing;

/*
Given an array A of N integers, find the index of values that satisfy P + Q = R + S,
where P,Q,R & S are integers values in the array
If there are more than one solutions, then return the tuple of values which are lexicographical smallest.
 */

//import com.sun.tools.javac.util.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;



public class EqualSumPairs {

    static class Node {
        int i, j;

        public Node(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }

    //checks among the two nodes, if any indices are equal
    public static boolean overlap(Node n1, Node n2) {

        if(n1.i == n2.i || n1.i == n2.j || n1.j == n2.i || n1.j == n2.j)
            return true;
        else
            return false;
    }

    public static ArrayList<Integer> equal(ArrayList<Integer> A) {

        HashMap<Integer, ArrayList<Node>> hm = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();

        if(A.size() < 4) {
            return result;
        }

        int sum = 0;
        Node currentNode;
        ArrayList<Node> nodes;

        //we generate all possible sums of pairs and put them in hashmap (key = sum, value is list of nodes (i,j))
        //if more than two nodes have same sum, we add new node to the list

        for(int i=0; i<A.size(); i++) {
            for(int j=i+1; j<A.size(); j++) {
                sum = A.get(i) + A.get(j);
                currentNode = new Node(i,j);
                if(hm.containsKey(sum))
                    nodes = hm.get(sum);
                else
                    nodes = new ArrayList<>();
                nodes.add(currentNode);
                hm.put(sum, nodes);
            }
        }

        for(int i=0; i<A.size(); i++) {
            for(int j=i+1; j<A.size(); j++) {
                sum = A.get(i) + A.get(j);
                currentNode = new Node(i,j);
                if(hm.containsKey(sum)) {
                    for(Node n : hm.get(sum)) {
                        if(overlap(currentNode, n)) //if any of the index is equal it means one of the elements is contributing to both of these sums
                            continue;
                        result.add(currentNode.i);
                        result.add(currentNode.j);
                        result.add(n.i);
                        result.add(n.j);
                        return result;
                    }
                }
            }
        }

        return result;
    }

    public static void main (String ar[]) {

        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(3, 4, 7, 1, 2, 9, 8));

        System.out.print(equal(A));

    }

}
