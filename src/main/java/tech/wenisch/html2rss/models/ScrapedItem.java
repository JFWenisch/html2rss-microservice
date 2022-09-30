package tech.wenisch.html2rss.models;

import java.util.Map;

public class ScrapedItem {
	
	String itemTitle;
	String itemDescription;
	String itemURL;
	String itemDate;
	String itemDateFormat;
	String itemImage;
	Map<String,String> itemCustomFields;
	public String getItemTitle() {
		return itemTitle;
	}
	public void setItemTitle(String itemTitle) {
		this.itemTitle = itemTitle;
	}
	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	public String getItemURL() {
		return itemURL;
	}
	public void setItemURL(String itemURL) {
		this.itemURL = itemURL;
	}
	public String getItemDate() {
		return itemDate;
	}
	public void setItemDate(String itemDate) {
		this.itemDate = itemDate;
	}
	public String getItemDateFormat() {
		return itemDateFormat;
	}
	public void setItemDateFormat(String itemDateFormat) {
		this.itemDateFormat = itemDateFormat;
	}
	public String getItemImage() {
		return itemImage;
	}
	public void setItemImage(String itemImage) {
		this.itemImage = itemImage;
	}
	public Map<String, String> getItemCustomFields() {
		return itemCustomFields;
	}
	public void setItemCustomFields(Map<String, String> itemCustomFields) {
		this.itemCustomFields = itemCustomFields;
	}


}
