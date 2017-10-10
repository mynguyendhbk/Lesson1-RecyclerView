package diemmy.edu.recycler;

/**
 * Created by DELL on 10/10/2017.
 */

public class ItemView {
    private String mName;
    private String mPrice;
    private int mImg;

    public ItemView(String name, String gia, int img) {
        this.mName = name;
        this.mPrice = gia;
        this.mImg = img;
    }

    public String getmName() {
        return mName;
    }

    public String getPrice() {
        return mPrice;
    }

    public int getmImg() {
        return mImg;
    }
}
