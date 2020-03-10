package demo.com.spacex.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import demo.com.spacex.R;
import demo.com.spacex.pojo.Launches;

public class RvAdapter extends RecyclerView.Adapter<RvAdapter.RvViewHolder> {

    private List<Launches> launches = new ArrayList<Launches>();

    public List<Launches> getLaunches() {
        return launches;
    }

    public void setLaunches(List<Launches> launches) {
        this.launches = launches;
        notifyDataSetChanged();
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
        holder.capsuleSerial.setText(launche.getMissionName());
        holder.capsuleId.setText(launche.getLaunchYear());
    }

    @Override
    public int getItemCount() {
        return launches.size();
    }

    class RvViewHolder extends RecyclerView.ViewHolder {
        private TextView capsuleSerial;
        private TextView capsuleId;

        public RvViewHolder(@NonNull View itemView) {
            super(itemView);
            capsuleSerial = itemView.findViewById(R.id.textViewSerial);
            capsuleId = itemView.findViewById(R.id.textViewId);
        }
    }
}
