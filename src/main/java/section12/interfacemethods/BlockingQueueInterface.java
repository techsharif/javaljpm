package section12.interfacemethods;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQueueInterface {

    public static void show(BlockingQueue<Integer> deque, BlockingQueue<String> strings) {
        QueueInterfaceMethods.show(deque, strings);
    }

    public static void main(String[] args) {
        show(new LinkedBlockingQueue<>(), new LinkedBlockingQueue<>());
    }
}
