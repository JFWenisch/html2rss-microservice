package tech.wenisch.html2rss.web;

import java.util.List;

import tech.wenisch.html2rss.models.ScrapedItem;

public class ScrapeResponse {

	List<ScrapedItem> items;

	public List<ScrapedItem> getItems() {
		return items;
	}

	public void setItems(List<ScrapedItem> items) {
		this.items = items;
	}

}
