import java.util.Iterator;
import java.util.NoSuchElementException;

class Range implements Iterable<Integer> {
    private final int start;
    private final int end;
    private final int step;

    // Constructor for range(start, end, step)
    public Range(int start, int end, int step) {
        if (step == 0) {
            throw new IllegalArgumentException("Step cannot be 0");
        }
        this.start = start;
        this.end = end;
        this.step = step;
    }

    // Overloaded constructor for range(start, end)
    public Range(int start, int end) {
        this(start, end, 1);
    }

    // Overloaded constructor for range(end) → (0, end, 1)
    public Range(int end) {
        this(0, end, 1);
    }

    // ✅ contains() method
    public boolean contains(int number) {
        if (step > 0) {
            if (number < start || number >= end) return false;
        } else {
            if (number > start || number <= end) return false;
        }
        return (number - start) % step == 0;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private int current = start;

            @Override
            public boolean hasNext() {
                if (step > 0) {
                    return current < end; // forward
                } else {
                    return current > end; // backward
                }
            }

            @Override
            public Integer next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int value = current;
                current += step;
                return value;
            }
        };
    }

    @Override
    public String toString() {
        return "Range(" + start + ", " + end + ", step=" + step + ")";
    }
}
