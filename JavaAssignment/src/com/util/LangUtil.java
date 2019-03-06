package com.util;

import java.util.HashMap;
import java.util.Map;


public class LangUtil {
	
	private static LangUtil instance = null;
	
	private Map<String, String> roosterLanguages = null;
	
	private LangUtil() {
		roosterLanguages = initRoosterLanguages();
	}

	public static synchronized LangUtil getInstance() {
		if(instance == null) {
			instance = new LangUtil();
		} 
		return instance;
	}
	
	public Map<String, String> initRoosterLanguages() {
		Map<String, String> langMap = new HashMap<String, String>();
		
		langMap.put("DANISH", "kykyliky");
		langMap.put("DUTCH", "kukeleku");
		langMap.put("ENGLISH", "cock-a-doodle-doo");
		langMap.put("FINNISH", "kukko kiekuu");
		langMap.put("FRENCH", "cocorico");
		langMap.put("GERMAN", "kikeriki");
		langMap.put("GREEK", "kikiriki");
		langMap.put("HEBREW", "coo-koo-ri-koo");
		langMap.put("HUNGARIAN", "kukuriku");
		langMap.put("ITALIAN", "chicchirichi");
		langMap.put("JAPANESE", "ko-ke-kok-ko-o");
		langMap.put("PORTUGUESE", "cucurucu");
		langMap.put("RUSSIAN", "kukareku");
		langMap.put("SWEDISH", "kuckeliku");
		langMap.put("TAGALOG", "tik-tilaok");
		langMap.put("TURKISH", "kuk-kurri-kuuu");
		langMap.put("URDU", "kuklooku");

		return langMap;
	}

	public Map<String, String> getRoosterLanguages() {
		return roosterLanguages;
	}

	public void setRoosterLanguages(Map<String, String> roosterLanguages) {
		this.roosterLanguages = roosterLanguages;
	}
	
}
