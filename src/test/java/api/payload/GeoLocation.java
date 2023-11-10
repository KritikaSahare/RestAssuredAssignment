package api.payload;

public class GeoLocation {

	private int homeMobileCountryCode;
    private int homeMobileNetworkCode;
    private String radioType;
    private String carrier;
    private boolean considerIp;

    public GeoLocation() {
        // Default constructor
    }

    public GeoLocation(int homeMobileCountryCode, int homeMobileNetworkCode, String radioType, String carrier, boolean considerIp) {
        this.homeMobileCountryCode = homeMobileCountryCode;
        this.homeMobileNetworkCode = homeMobileNetworkCode;
        this.radioType = radioType;
        this.carrier = carrier;
        this.considerIp = considerIp;
    }

    public int getHomeMobileCountryCode() {
        return homeMobileCountryCode;
    }

    public void setHomeMobileCountryCode(int homeMobileCountryCode) {
        this.homeMobileCountryCode = homeMobileCountryCode;
    }

    public int getHomeMobileNetworkCode() {
        return homeMobileNetworkCode;
    }

    public void setHomeMobileNetworkCode(int homeMobileNetworkCode) {
        this.homeMobileNetworkCode = homeMobileNetworkCode;
    }

    public String getRadioType() {
        return radioType;
    }

    public void setRadioType(String radioType) {
        this.radioType = radioType;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public boolean isConsiderIp() {
        return considerIp;
    }

    public void setConsiderIp(boolean considerIp) {
        this.considerIp = considerIp;
    }
}
