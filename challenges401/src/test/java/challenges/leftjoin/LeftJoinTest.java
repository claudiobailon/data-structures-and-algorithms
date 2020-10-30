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
        String[][] output = test.leftJoin(left, right);
        System.out.println(test.toString());
        assertEquals("[fond, enamored, averse]", Arrays.toString(output[0]));

    }
}
