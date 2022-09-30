package tech.wenisch.html2rss;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;

import tech.wenisch.html2rss.models.ScrapeConfig;
import tech.wenisch.html2rss.models.ScrapedItem;
import tech.wenisch.html2rss.web.ScrapeResponse;

public class ScrapeManager {

	private static ScrapeManager instance;

	private static Logger logger = LoggerFactory.getLogger(ScrapeManager.class);

	static {
		try {
			instance = new ScrapeManager();
		} catch (Exception e) {
			throw new RuntimeException("Exception occured initialization of ElasticManager:" + e.getMessage());
		}
	}
	private ScrapeManager() {
		logger.info("Trying to read env variable ELASTICSEARCH_HOST and ELASTICSEARCH_PORT");

//		if ((System.getenv("ELASTICSEARCH_HOST") != null && System.getenv("ELASTICSEARCH_HOST").length() != 0)
//				&& (System.getenv("ELASTICSEARCH_PORT") != null && System.getenv("ELASTICSEARCH_PORT").length() != 0)) {
//			logger.info("Found env variables. Establishing connection to elasticsearch on "+ System.getenv("ELASTICSEARCH_HOST")+":"+System.getenv("ELASTICSEARCH_PORT"));
//			restClient = RestClient.builder(new HttpHost(System.getenv("ELASTICSEARCH_HOST"),
//					Integer.parseInt(System.getenv("ELASTICSEARCH_PORT")))).build();
//		} else {
//			logger.warn("Couldn't read env variable ELASTICSEARCH_HOST. Defaulting to localhost:9200");
//			restClient = RestClient.builder(new HttpHost("localhost", 9200)).build();
//		}

	}


	public static ScrapeManager getInstance() {
		return instance;
	}

	public ScrapeResponse test(ScrapeConfig config) throws IOException
	{
		ScrapeResponse response = new ScrapeResponse();
		List<ScrapedItem> items = new ArrayList<ScrapedItem>();
		 Document doc = Jsoup.connect(config.getUrl()).get();
		 
		 //find elements
		  Elements elems = doc.select(config.getItemSelector());
		    for(Element elem: elems){
		    
		    	ScrapedItem item = new ScrapedItem();
		    	item.setItemTitle(elem.select(config.getItemTitleSelector()).text());
		    	item.setItemDescription(elem.select(config.getItemDescriptionSelector()).text());
		    	item.setItemDate(elem.select(config.getItemDateSelector()).text());
		    	item.setItemImage(elem.select(config.getItemImageSelector()).attr("src"));
		    	item.setItemURL(elem.select(config.getItemURLSelector()).attr("href"));
		    	
		 
		    	logger.info(elem.toString());
		       	logger.info(elem.select(config.getItemDescriptionSelector()).text());
		    	logger.info(new ObjectMapper().writer().withDefaultPrettyPrinter().writeValueAsString(item));
		    	items.add(item);
		    }
		    response.setItems(items);
		    logger.info("Found a total of "+ elems.size());
		return response;

	}

}