import java.util.ArrayList;

public class Queue < T > {

    ArrayList < T > data;

    public Queue() {
        data = new ArrayList < T > ();
    }

    public void add(T value) {
        data.add(value);
    }

    public T remove() {
        return data.remove(0);
    }

    public String toString() {
        String output = "";
        for (T value: data) {
            output += value + ", ";
        }
        return output;
    }

    public int size() {
        return data.size();
    }

}