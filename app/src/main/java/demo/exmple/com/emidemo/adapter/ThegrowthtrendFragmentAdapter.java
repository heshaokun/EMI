package demo.exmple.com.emidemo.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import demo.exmple.com.emidemo.R;

/**
 * Created by 贺韶坤 on 2018/5/18.
 */
//长势适配器
public class ThegrowthtrendFragmentAdapter extends RecyclerView.Adapter<ThegrowthtrendFragmentAdapter.ViewHolder> implements View.OnClickListener {

    private Context Con;
//    private List<TuJian.DataBean.RecommendAppsBean> list;
    private View view;
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        view = View.inflate(Con, R.layout.thegrowthtrendfragment_item, null);
        ViewHolder houdel = new ViewHolder(view);
        view.setOnClickListener(this);
        return houdel;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
//        final TuJian.DataBean.RecommendAppsBean dataBean = list.get(position);
//        holder.tv_textView1.setText(dataBean.getDisplayName());
//        holder.tv_textView2.setText(dataBean.getBriefShow());
//        holder.tv_textView2.setText(dataBean.getBriefShow());
        ((ViewHolder) holder).itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(Con, dataBean.getDisplayName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return 0;
    }



    class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tv_textView1, tv_textView2,tv_textView3;

        public ViewHolder(View itemView) {
            super(itemView);
            tv_textView1 = (TextView) itemView.findViewById(R.id.TheGrowth_name);
            tv_textView2 = (TextView) itemView.findViewById(R.id.TheGrowth_MuShu);
            tv_textView3 = (TextView) itemView.findViewById(R.id.TheGrowth_DiKuai);
        }
    }
    public Setonclck seton;

    public interface Setonclck {
        void seteonclick(View v, int position);
    }

    @Override
    public void onClick(View v) {
        if (seton != null) {
            seton.seteonclick(v, (Integer) v.getTag());
        }

    }

    public void getOnclick(Setonclck seton) {
        this.seton = seton;
    }
}
