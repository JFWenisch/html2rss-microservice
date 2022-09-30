package tech.wenisch.html2rss.models;

import java.util.Map;

public class ScrapeConfig {
	
	String url;
	String itemSelector;
	String itemTitleSelector;
	String itemDescriptionSelector;
	String itemURLSelector;
	String itemDateSelector;
	String itemDateFormat;
	String itemImageSelector;
	Map<String,String> itemCustomFields;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getItemSelector() {
		return itemSelector;
	}
	public void setItemSelector(String itemSelector) {
		this.itemSelector = itemSelector;
	}
	public String getItemTitleSelector() {
		return itemTitleSelector;
	}
	public void setItemTitleSelector(String itemTitleSelector) {
		this.itemTitleSelector = itemTitleSelector;
	}
	public String getItemDescriptionSelector() {
		return itemDescriptionSelector;
	}
	public void setItemDescriptionSelector(String itemDescriptionSelector) {
		this.itemDescriptionSelector = itemDescriptionSelector;
	}
	public String getItemURLSelector() {
		return itemURLSelector;
	}
	public void setItemURLSelector(String itemURLSelector) {
		this.itemURLSelector = itemURLSelector;
	}
	public String getItemDateSelector() {
		return itemDateSelector;
	}
	public void setItemDateSelector(String itemDateSelector) {
		this.itemDateSelector = itemDateSelector;
	}
	public String getItemDateFormat() {
		return itemDateFormat;
	}
	public void setItemDateFormat(String itemDateFormat) {
		this.itemDateFormat = itemDateFormat;
	}
	public String getItemImageSelector() {
		return itemImageSelector;
	}
	public void setItemImageSelector(String itemImageSelector) {
		this.itemImageSelector = itemImageSelector;
	}
	public Map<String, String> getItemCustomFields() {
		return itemCustomFields;
	}
	public void setItemCustomFields(Map<String, String> itemCustomFields) {
		this.itemCustomFields = itemCustomFields;
	}

}
