package diemmy.edu.recycler;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

/**
 * Created by DELL on 10/10/2017.
 */

public class ViewAdapter extends RecyclerView.Adapter<ViewAdapter.ItemHolder>{

    private IViewAdapter mInterf;

    public ViewAdapter(IViewAdapter interf){
        this.mInterf = interf;
    }
    @Override
    public ItemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_list,parent,false);
        return new ItemHolder(view);
    }

    @Override
    public void onBindViewHolder(ItemHolder holder, int position) {
        ItemView item = mInterf.getData(position);
        holder.tvName.setText(item.getName());
        holder.tvGia.setText(item.getGia());
        holder.imgAnh.setImageResource(item.getImg());
    }

    @Override
    public int getItemCount() {
        return mInterf.getCount();
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
    public interface IViewAdapter{
        int getCount();
        ItemView getData(int position);

    }
}
