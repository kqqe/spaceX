package demo.com.spacex.screens.launches;

import android.util.Log;

import java.util.List;

import demo.com.spacex.api.ApiFactory;
import demo.com.spacex.api.ApiService;
import demo.com.spacex.pojo.Launches;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LaunchesListPresenter {

    private LaunchesListView launchesListView;

    public LaunchesListPresenter(LaunchesListView launchesListView) {
        this.launchesListView = launchesListView;
    }

    public  void loadDara(){
        ApiFactory apiFactory = ApiFactory.getInstance();
        ApiService apiService = apiFactory.getApiService();

        Call<List<Launches>> call = apiService.getLaunchess();

        call.enqueue(new Callback<List<Launches>>() {
            @Override
            public void onResponse(Call<List<Launches>> call, Response<List<Launches>> response) {
                //List<Launches> launches = response.body();
                //Log.i("War", "this");
                //adapter.setLaunches(response.body());
                launchesListView.showData(response.body());

            }

            @Override
            public void onFailure(Call<List<Launches>> call, Throwable t) {
                //t.printStackTrace();

            }
        });
    }
}
