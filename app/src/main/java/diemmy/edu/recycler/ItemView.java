package diemmy.edu.recycler;

/**
 * Created by DELL on 10/10/2017.
 */

public class ItemView {
    private String name;
    private String gia;
    private int img;

    public ItemView(String name, String gia, int img) {
        this.name = name;
        this.gia = gia;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public String getGia() {
        return gia;
    }

    public int getImg() {
        return img;
    }
}
