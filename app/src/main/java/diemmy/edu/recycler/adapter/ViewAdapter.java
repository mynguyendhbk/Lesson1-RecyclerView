package diemmy.edu.recycler.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import diemmy.edu.recycler.R;
import diemmy.edu.recycler.widget.ItemView;

/**
 * Created by DELL on 10/10/2017.
 */

public class ViewAdapter extends RecyclerView.Adapter<ViewAdapter.ItemHolder>{
    private List<ItemView> mItemViews;

    public ViewAdapter(List<ItemView> itemViews) {
        this.mItemViews = itemViews;
    }

    @Override
    public ItemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_list,parent,false);
        return new ItemHolder(view);
    }

    @Override
    public void onBindViewHolder(ItemHolder holder, int position) {
        holder.tvName.setText(mItemViews.get(position).getmName());
        holder.tvGia.setText(mItemViews.get(position).getPrice());
        holder.imgAnh.setImageResource(mItemViews.get(position).getmImg());
    }

    @Override
    public int getItemCount() {
        return mItemViews.size();
    }


    public class ItemHolder extends RecyclerView.ViewHolder {
        private TextView tvName;
        private TextView tvGia;
        private ImageView imgAnh;
        public ItemHolder(View itemView) {
            super(itemView);
            tvName = (TextView)itemView.findViewById(R.id.tv_name);
            tvGia = (TextView)itemView.findViewById(R.id.tv_gia);
            imgAnh = (ImageView)itemView.findViewById(R.id.img_anh);
        }
    }
}
