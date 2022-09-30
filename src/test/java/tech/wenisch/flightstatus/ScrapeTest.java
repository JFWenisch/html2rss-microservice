package tech.wenisch.flightstatus;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import tech.wenisch.html2rss.ScrapeManager;
import tech.wenisch.html2rss.models.ScrapeConfig;

public class ScrapeTest {
	@Test
	void demoTestMethod()  {
		ScrapeConfig config= new ScrapeConfig();
		config.setUrl("https://www.regioactive.de/events/13352/aachen/veranstaltungen-party-konzerte");
		config.setItemSelector("div.media");
		config.setItemTitleSelector("div.media-body span.summary");
		config.setItemDescriptionSelector("div.media-object > a[title]");
		config.setItemURLSelector("div.media-body h2 a");
		config.setItemDateSelector("div.media-body span.dtstart");
		config.setItemImageSelector("div.media-object noscript img");
		try {
			ScrapeManager.getInstance().test(config);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
