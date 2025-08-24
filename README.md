Range class contents:
class Range implements Iterable<Integer> {
    // Fields
    private final int start;
    private final int end;
    private final int step;

    // Constructors
    Range(int start, int end, int step)
    Range(int start, int end)
    Range(int end)

    // Methods
    boolean contains(int number)
    Iterator<Integer> iterator()
    String toString()

    // Inner Iterator (via anonymous class)
    boolean hasNext()
    Integer next()
}
