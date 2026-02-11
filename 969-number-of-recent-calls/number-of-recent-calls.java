import java.util.*;

class RecentCounter {
    Queue<Integer> queue = new LinkedList<>();

    public int ping(int t) {
        queue.add(t);
        
        while (queue.peek() < t - 3000)
            queue.remove();
        
        return queue.size();
    }
}
