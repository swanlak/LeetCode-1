package idv.carl.datastructures.btree;

/**
 * @author Carl Lu
 */
public class KeyItem {

    private int id;
    private int data;

    public KeyItem(int id) {
        super();
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "KeyItem{" + "id=" + id + ", data=" + data + '}';
    }

}
