package Commons;

public class StringUtil {
	private static String URL;
	public static String CombinURL(String platform, String urlDirectory){
		URL = platform + urlDirectory;
		return URL;
	}

}
