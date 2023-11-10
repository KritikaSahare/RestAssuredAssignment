package api.common;

import java.util.Random;

public enum NetworkType {
	  GSM,
	    CDMA,
	    WCDMA,
	    LTE,
	    NR;
	
	public static String getRandomNetworkType() {
	    Random random = new Random();
	    NetworkType[] values = NetworkType.values();
	    return values[random.nextInt(values.length)].name();
	}
}
