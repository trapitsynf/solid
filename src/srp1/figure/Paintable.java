package srp1.figure;

public interface Paintable<T extends Shape> {
    void draw(T shape);
}
