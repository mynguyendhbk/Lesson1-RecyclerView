package diemmy.edu.recycler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ViewAdapter.IViewAdapter {
    private ViewAdapter viewAdapter;
    private List<ItemView> itemViews;
    private RecyclerView rcList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initDatas();
        initView();


    }

    private void initView() {
        rcList = (RecyclerView)findViewById(R.id.rc_list);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        rcList.setLayoutManager(manager);
        viewAdapter = new ViewAdapter(this);
        rcList.setAdapter(viewAdapter);
    }

    private void initDatas() {
        itemViews = new ArrayList<>();
        itemViews.add(new ItemView("Ca Chua", "20.000 VND/1kg", R.drawable.cachua));
        itemViews.add(new ItemView("Khoai Tay", "15.000 VND/1kg", R.drawable.khoaitay));
        itemViews.add(new ItemView("Ca Rot", "20.000 VND/1kg", R.drawable.carot));
        itemViews.add(new ItemView("Dua Chuot", "12.000 VND/1kg", R.drawable.duachuot));
        itemViews.add(new ItemView("Sup Lo", "22.000 VND/1kg", R.drawable.suplo));
    }

    @Override
    public int getCount() {
        return itemViews.size();
    }

    @Override
    public ItemView getData(int position) {
        return itemViews.get(position);
    }
}
