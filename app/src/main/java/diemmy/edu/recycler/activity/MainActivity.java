package diemmy.edu.recycler.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import diemmy.edu.recycler.widget.ItemView;
import diemmy.edu.recycler.R;
import diemmy.edu.recycler.adapter.ViewAdapter;

public class MainActivity extends AppCompatActivity{
    private ViewAdapter mViewAdapter;
    private List<ItemView> mItemViews;
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initDatas();
        initView();
    }

    private void initView() {
        mRecyclerView = (RecyclerView)findViewById(R.id.rc_list);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(manager);
        mViewAdapter = new ViewAdapter(mItemViews);
        mRecyclerView.setAdapter(mViewAdapter);
    }

    private void initDatas() {
        mItemViews = new ArrayList<>();
        mItemViews.add(new ItemView("Ca Chua", "20.000 VND/1kg", R.drawable.cachua));
        mItemViews.add(new ItemView("Khoai Tay", "15.000 VND/1kg", R.drawable.khoaitay));
        mItemViews.add(new ItemView("Ca Rot", "20.000 VND/1kg", R.drawable.carot));
        mItemViews.add(new ItemView("Dua Chuot", "12.000 VND/1kg", R.drawable.duachuot));
        mItemViews.add(new ItemView("Sup Lo", "22.000 VND/1kg", R.drawable.suplo));
    }

}
