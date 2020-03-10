package demo.com.spacex.api;

import java.util.List;

import demo.com.spacex.pojo.Launches;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("launches")//number
    Call<List<Launches>> getLaunchess();

}
