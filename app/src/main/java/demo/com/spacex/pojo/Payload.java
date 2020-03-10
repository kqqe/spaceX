package demo.com.spacex.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Payload {
    @SerializedName("payload_id")
    @Expose
    private String payloadId;
    @SerializedName("norad_id")
    @Expose
    private List<Integer> noradId = null;
    @SerializedName("reused")
    @Expose
    private boolean reused;
    @SerializedName("customers")
    @Expose
    private List<String> customers = null;
    @SerializedName("nationality")
    @Expose
    private String nationality;
    @SerializedName("manufacturer")
    @Expose
    private String manufacturer;
    @SerializedName("payload_type")
    @Expose
    private String payloadType;
    @SerializedName("payload_mass_kg")
    @Expose
    private int payloadMassKg;
    @SerializedName("payload_mass_lbs")
    @Expose
    private int payloadMassLbs;
    @SerializedName("orbit")
    @Expose
    private String orbit;
//    @SerializedName("orbit_params")
//    @Expose
//    //private OrbitParams orbitParams;

    public String getPayloadId() {
        return payloadId;
    }

    public void setPayloadId(String payloadId) {
        this.payloadId = payloadId;
    }

    public List<Integer> getNoradId() {
        return noradId;
    }

    public void setNoradId(List<Integer> noradId) {
        this.noradId = noradId;
    }

    public boolean isReused() {
        return reused;
    }

    public void setReused(boolean reused) {
        this.reused = reused;
    }

    public List<String> getCustomers() {
        return customers;
    }

    public void setCustomers(List<String> customers) {
        this.customers = customers;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getPayloadType() {
        return payloadType;
    }

    public void setPayloadType(String payloadType) {
        this.payloadType = payloadType;
    }

    public int getPayloadMassKg() {
        return payloadMassKg;
    }

    public void setPayloadMassKg(int payloadMassKg) {
        this.payloadMassKg = payloadMassKg;
    }

    public int getPayloadMassLbs() {
        return payloadMassLbs;
    }

    public void setPayloadMassLbs(int payloadMassLbs) {
        this.payloadMassLbs = payloadMassLbs;
    }

    public String getOrbit() {
        return orbit;
    }

//    public void setOrbit(String orbit) {
//        this.orbit = orbit;
//    }
//
//    public OrbitParams getOrbitParams() {
//        return orbitParams;
//    }
//
//    public void setOrbitParams(OrbitParams orbitParams) {
//        this.orbitParams = orbitParams;
//    }
}
