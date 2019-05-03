package cleaner;

import sun.misc.Cleaner;

public class Room implements AutoCloseable {

    private static final Cleaner cleaner = Cleaner.create();
    private final State state;


    public

    @Override
    public void close() throws Exception {

    }

    private static class State implements Runnable {

        private int numJunkiles;

        public State(int numJunkiles) {
            this.numJunkiles = numJunkiles;
        }

        @Override
        public void run() {
            System.out.println("Cleaning room");
            numJunkiles = 0;
        }
    }
}
