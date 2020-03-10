package demo.com.spacex.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Fairings {
    @SerializedName("reused")
    @Expose
    private boolean reused;
    @SerializedName("recovery_attempt")
    @Expose
    private boolean recoveryAttempt;
    @SerializedName("recovered")
    @Expose
    private boolean recovered;
    @SerializedName("ship")
    @Expose
    private Object ship;

    public boolean isReused() {
        return reused;
    }

    public void setReused(boolean reused) {
        this.reused = reused;
    }

    public boolean isRecoveryAttempt() {
        return recoveryAttempt;
    }

    public void setRecoveryAttempt(boolean recoveryAttempt) {
        this.recoveryAttempt = recoveryAttempt;
    }

    public boolean isRecovered() {
        return recovered;
    }

    public void setRecovered(boolean recovered) {
        this.recovered = recovered;
    }

    public Object getShip() {
        return ship;
    }

    public void setShip(Object ship) {
        this.ship = ship;
    }
}
