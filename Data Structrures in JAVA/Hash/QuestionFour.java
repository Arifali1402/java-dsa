/*
 Find Itinerary from Tickets
 
 from -> to

 "Chennai" -> "Bengaluru"
 "Mumbai" -> "Delhi"
 "Goa" -> "Chennai"
 "Delhi" -> "Goa"
 Datas are given in HashMap datas i.e, HashMap<String,String>
 Basic Condition :- No loop is allowed.
  A -> B and A -> C is not allowed

 Output: Mumbai->Delhi->Goa->Chennai->Bengaluru
 */

/*
   Approach:
   1. Find the Starting point (which exist in "from" data but not in "to" data) [Only one starting point is there in the Map]
   2. "from" and "to" both are unique. So we can create a second map (Reverse Map). Reverse map helps in finding the initial or starting point.
   3. Print Itinerary.
*/

import java.util.*;

public class QuestionFour {
    public static String getStart(HashMap<String, String> tickets) {
        HashMap<String, String> revMap = new HashMap<>();
        for (String key : tickets.keySet()) {
            // key -> key and value -> tickets.get(key)
            revMap.put(tickets.get(key), key);
        }
        for (String key : tickets.keySet()) {
            if (!revMap.containsKey(key)) { // initial point
                return key;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");
        String start = getStart(tickets);
        while (tickets.containsKey(start)) {
            System.out.print(start + " -> ");
            start = tickets.get(start);
        }
        System.out.println(start);
    }
}
