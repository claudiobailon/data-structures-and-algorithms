package challenges.leftjoin;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import static org.junit.Assert.*;

public class LeftJoinTest {

    @Test public void testLeftJoin(){
        HashMap<String, String> left = new HashMap<>();
        HashMap<String, String> right = new HashMap<>();

        left.put("fond", "enamored");
        left.put("wrath", "anger");
        left.put("diligent", "employed");
        left.put("outfit", "garb");
        left.put("guide", "usher");

        right.put("fond", "averse");
        right.put("wrath", "delight");
        right.put("diligent", "idle");
        right.put("guide", "follow");
        right.put("flow", "jam");


        LeftJoin test = new LeftJoin();
        test.leftJoin(left, right);
        System.out.println(test.toString());//Data didn't come out in same order as it went in, don't think that is possible with hashMap
        String expected = "[ [diligent, employed, idle], [outfit, garb, null], [wrath, anger, delight], [guide, usher, follow], [fond, enamored, averse] ] ";
        assertEquals(expected, test.toString());//values are added to keys in correct order, return null if second hashmap doesn not have key
        right.put("check", "testing");
        assertEquals(expected, test.toString()); // second hashmap being larger doesn't affect output

        HashMap<String,String> emptyRight = new HashMap<>();
        test.leftJoin(left, emptyRight);
        expected = "[ [diligent, employed, null], [outfit, garb, null], [wrath, anger, null], [guide, usher, null], [fond, enamored, null] ] ";
        assertEquals(expected, test.toString());//last part of each array should be null

    }
}
