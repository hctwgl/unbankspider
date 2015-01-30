package com.unbank.robotspider.filter.content;

import org.apache.log4j.Logger;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.stereotype.Service;

@Service
public class AfinanceContentFilter extends ContentBaseFilter {
	public Logger logger = Logger.getLogger(AfinanceContentFilter.class);

	private String domain = "www.afinance.cn";

	public AfinanceContentFilter() {
		ContentFilterLocator.getInstance().register(domain, this);
	}

	public Element getContentNode(Document document) {
		Element element = assignPossibleElement(document, "#zuo003");
		if (element == null) {
			return null;
		}
		return element;
	}

	public void removeNoNeedElementsByText(Element contentElement) {
		// String textQuerys[] = new String[] { "" };
		// for (String textQuery : textQuerys) {
		// removeNoNeedTextElement(contentElement, textQuery);
		// }
	}

	public void removeNoNeedElementsByCssQuery(Element contentElement) {
		String cssQuerys[] = new String[] { "#hzh", "#nextpage", "#pages" };
		for (String cssQuery : cssQuerys) {
			removeNoNeedElement(contentElement, cssQuery);
		}
	}

}
