package Generics.CompareTo;
/**
 * Class D implements Comparator
 */

class D implements Comparable<D> {
    int rank;

    public D(int rank) {
        this.rank = rank;
    }

    @Override
    public int compareTo(D o) {
        return this.rank ==o.rank ? 0:this.rank>o.rank?1:-1;
    }

    @Override
    public String toString() {
        return "D{" +
                "rank=" + rank +
                '}';
    }

}
