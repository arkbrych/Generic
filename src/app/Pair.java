package app;

/**
 * @Author Arkadiusz Brych
 * Generic class
 */
class Pair<T, V> {
    private T typeT;
    private V typeV;

    public T getTypeT() {
        return typeT;
    }

    public void setTypeT(T typeT) {
        this.typeT = typeT;
    }

    public V getTypeV() {
        return typeV;
    }

    public void setTypeV(V typeV) {
        this.typeV = typeV;
    }

    public Pair(T typeT, V typeV) {
        this.typeT = typeT;
        this.typeV = typeV;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "typeT=" + typeT +
                ", typeV=" + typeV +
                '}';
    }
}
