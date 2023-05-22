package Repeat;

import java.util.ArrayList;
import java.util.List;

class OrderedStream {
    private String[] data;
    private int ptr;

    public OrderedStream(int n) {
        this.data = new String[n];
        this.ptr = 0;
    }

    public List<String> insert(int id, String value) {
        List<String> list = new ArrayList<>();
        this.data[id - 1] = value;

        while (this.ptr < this.data.length && this.data[this.ptr] != null) {
            list.add(this.data[this.ptr]);
            this.ptr++;
        }

        return list;
    }
}
