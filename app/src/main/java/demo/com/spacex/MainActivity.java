package demo.com.spacex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import demo.com.spacex.adapter.RvAdapter;
import demo.com.spacex.api.ApiFactory;
import demo.com.spacex.api.ApiService;
import demo.com.spacex.pojo.Launches;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewCapsule;
    private RvAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewCapsule = findViewById(R.id.recyclerViewСapsule);
        adapter = new RvAdapter(this);
        recyclerViewCapsule.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewCapsule.setAdapter(adapter);
        ApiFactory apiFactory = ApiFactory.getInstance();
        ApiService apiService = apiFactory.getApiService();

        Call<List<Launches>> call = apiService.getLaunchess();

        call.enqueue(new Callback<List<Launches>>() {
            @Override
            public void onResponse(Call<List<Launches>> call, Response<List<Launches>> response) {
                //List<Launches> launches = response.body();
                Log.i("zas", "залупа");
                adapter.setLaunches(response.body());

            }

            @Override
            public void onFailure(Call<List<Launches>> call, Throwable t) {
                t.printStackTrace();

            }
        });

        //glide android //баз дуанных, сохранять в базу данных(10 элементов),Sql lite

    }
}
