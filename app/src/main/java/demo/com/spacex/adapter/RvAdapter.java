package demo.com.spacex.adapter;

import android.app.Fragment;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import java.util.ArrayList;
import java.util.List;

import demo.com.spacex.R;
import demo.com.spacex.pojo.Launches;

public class RvAdapter extends RecyclerView.Adapter<RvAdapter.RvViewHolder> {

    private List<Launches> launches = new ArrayList<Launches>();
    private Context context;

    public List<Launches> getLaunches() {
        return launches;
    }

    public void setLaunches(List<Launches> launches) {
        this.launches = launches;
        notifyDataSetChanged();
    }

    public RvAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override

    public RvViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.model_space_item, parent, false);
        return new RvViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RvViewHolder holder, int position) {
        Launches launche = launches.get(position);
        holder.nameSpace.setText(launche.getMissionName());
        holder.yearSpace.setText(launche.getLaunchYear());
        Glide.with(context)
                .load(launche.getLinks().getMissionPatchSmall())
                //.diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return launches.size();
    }

    class RvViewHolder extends RecyclerView.ViewHolder {
        private TextView nameSpace;
        private TextView yearSpace;
        private ImageView imageView;

        public RvViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageViewSpace);
            nameSpace = itemView.findViewById(R.id.textViewSerial);
            yearSpace = itemView.findViewById(R.id.textViewId);
        }
    }
}
