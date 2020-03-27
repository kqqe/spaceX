package demo.com.spacex.screens.launches;

import java.util.List;

import demo.com.spacex.pojo.Launches;

public interface LaunchesListView {
    void showData(List<Launches> launches);
}
