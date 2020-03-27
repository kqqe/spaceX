package demo.com.spacex.screens.launches;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import java.util.List;

import demo.com.spacex.R;
import demo.com.spacex.adapter.RvAdapter;
import demo.com.spacex.pojo.Launches;

public class LaunchesListActivity extends AppCompatActivity implements LaunchesListView{

    private RecyclerView recyclerViewCapsule;
    private RvAdapter adapter;
    private LaunchesListPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new LaunchesListPresenter(this);
        recyclerViewCapsule = findViewById(R.id.recyclerViewСapsule);
        adapter = new RvAdapter(this);
        recyclerViewCapsule.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewCapsule.setAdapter(adapter);
        presenter.loadDara();


        //базу данных, сохранять в базу данных(10 элементов),Sql lite

    }
    public void showData(List<Launches> launches){
        adapter.setLaunches(launches);
    }
}
