package demo.com.spacex.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Timeline {
    @SerializedName("webcast_liftoff")
    @Expose
    private int webcastLiftoff;
    @SerializedName("go_for_prop_loading")
    @Expose
    private int goForPropLoading;
    @SerializedName("rp1_loading")
    @Expose
    private int rp1Loading;
    @SerializedName("stage1_lox_loading")
    @Expose
    private int stage1LoxLoading;
    @SerializedName("stage2_lox_loading")
    @Expose
    private int stage2LoxLoading;
    @SerializedName("engine_chill")
    @Expose
    private int engineChill;
    @SerializedName("prelaunch_checks")
    @Expose
    private int prelaunchChecks;
    @SerializedName("propellant_pressurization")
    @Expose
    private int propellantPressurization;
    @SerializedName("go_for_launch")
    @Expose
    private int goForLaunch;
    @SerializedName("ignition")
    @Expose
    private int ignition;
    @SerializedName("liftoff")
    @Expose
    private int liftoff;
    @SerializedName("maxq")
    @Expose
    private int maxq;
    @SerializedName("meco")
    @Expose
    private int meco;
    @SerializedName("stage_sep")
    @Expose
    private int stageSep;
    @SerializedName("second_stage_ignition")
    @Expose
    private int secondStageIgnition;
    @SerializedName("fairing_deploy")
    @Expose
    private int fairingDeploy;
    @SerializedName("first_stage_entry_burn")
    @Expose
    private int firstStageEntryBurn;
    @SerializedName("seco-1")
    @Expose
    private int seco1;
    @SerializedName("first_stage_landing")
    @Expose
    private int firstStageLanding;
    @SerializedName("second_stage_restart")
    @Expose
    private int secondStageRestart;
    @SerializedName("seco-2")
    @Expose
    private int seco2;
    @SerializedName("payload_deploy")
    @Expose
    private int payloadDeploy;

    public int getWebcastLiftoff() {
        return webcastLiftoff;
    }

    public void setWebcastLiftoff(int webcastLiftoff) {
        this.webcastLiftoff = webcastLiftoff;
    }

    public int getGoForPropLoading() {
        return goForPropLoading;
    }

    public void setGoForPropLoading(int goForPropLoading) {
        this.goForPropLoading = goForPropLoading;
    }

    public int getRp1Loading() {
        return rp1Loading;
    }

    public void setRp1Loading(int rp1Loading) {
        this.rp1Loading = rp1Loading;
    }

    public int getStage1LoxLoading() {
        return stage1LoxLoading;
    }

    public void setStage1LoxLoading(int stage1LoxLoading) {
        this.stage1LoxLoading = stage1LoxLoading;
    }

    public int getStage2LoxLoading() {
        return stage2LoxLoading;
    }

    public void setStage2LoxLoading(int stage2LoxLoading) {
        this.stage2LoxLoading = stage2LoxLoading;
    }

    public int getEngineChill() {
        return engineChill;
    }

    public void setEngineChill(int engineChill) {
        this.engineChill = engineChill;
    }

    public int getPrelaunchChecks() {
        return prelaunchChecks;
    }

    public void setPrelaunchChecks(int prelaunchChecks) {
        this.prelaunchChecks = prelaunchChecks;
    }

    public int getPropellantPressurization() {
        return propellantPressurization;
    }

    public void setPropellantPressurization(int propellantPressurization) {
        this.propellantPressurization = propellantPressurization;
    }

    public int getGoForLaunch() {
        return goForLaunch;
    }

    public void setGoForLaunch(int goForLaunch) {
        this.goForLaunch = goForLaunch;
    }

    public int getIgnition() {
        return ignition;
    }

    public void setIgnition(int ignition) {
        this.ignition = ignition;
    }

    public int getLiftoff() {
        return liftoff;
    }

    public void setLiftoff(int liftoff) {
        this.liftoff = liftoff;
    }

    public int getMaxq() {
        return maxq;
    }

    public void setMaxq(int maxq) {
        this.maxq = maxq;
    }

    public int getMeco() {
        return meco;
    }

    public void setMeco(int meco) {
        this.meco = meco;
    }

    public int getStageSep() {
        return stageSep;
    }

    public void setStageSep(int stageSep) {
        this.stageSep = stageSep;
    }

    public int getSecondStageIgnition() {
        return secondStageIgnition;
    }

    public void setSecondStageIgnition(int secondStageIgnition) {
        this.secondStageIgnition = secondStageIgnition;
    }

    public int getFairingDeploy() {
        return fairingDeploy;
    }

    public void setFairingDeploy(int fairingDeploy) {
        this.fairingDeploy = fairingDeploy;
    }

    public int getFirstStageEntryBurn() {
        return firstStageEntryBurn;
    }

    public void setFirstStageEntryBurn(int firstStageEntryBurn) {
        this.firstStageEntryBurn = firstStageEntryBurn;
    }

    public int getSeco1() {
        return seco1;
    }

    public void setSeco1(int seco1) {
        this.seco1 = seco1;
    }

    public int getFirstStageLanding() {
        return firstStageLanding;
    }

    public void setFirstStageLanding(int firstStageLanding) {
        this.firstStageLanding = firstStageLanding;
    }

    public int getSecondStageRestart() {
        return secondStageRestart;
    }

    public void setSecondStageRestart(int secondStageRestart) {
        this.secondStageRestart = secondStageRestart;
    }

    public int getSeco2() {
        return seco2;
    }

    public void setSeco2(int seco2) {
        this.seco2 = seco2;
    }

    public int getPayloadDeploy() {
        return payloadDeploy;
    }

    public void setPayloadDeploy(int payloadDeploy) {
        this.payloadDeploy = payloadDeploy;
    }
}
