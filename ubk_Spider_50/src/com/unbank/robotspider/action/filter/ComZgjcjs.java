package com.unbank.robotspider.action.filter;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.stereotype.Component;

import com.unbank.robotspider.action.model.normal.BaseFilter;
import com.unbank.robotspider.action.model.normal.FilterLocator;

@Component
public class ComZgjcjs extends BaseFilter {
	private String domain[] = new String[] { "www.zgjcjs.com" };

	public ComZgjcjs() {
		for (int i = 0; i < domain.length; i++) {
			FilterLocator.getInstance().register(domain[i], this);
		}

	}

	@Override
	public Element removeNoNeedHtmlElement(String url, Document document,
			String title) {
		Element element = document.select(".xinwen").first();
		String cssQuerys[] = new String[] { ".tits", ".from", "#pages",
				".share", "#bdshare", "script" };
		for (String string : cssQuerys) {
			removeNoNeedElement(element, string);
		}
		return element;
	}

	@Override
	public void formatElements(Element maxTextElement) {
		super.formatElements(maxTextElement);
	}

	@Override
	public void saveImage(Element maxTextElement, String url) {
		super.saveImage(maxTextElement, url);
	}

	@Override
	public String replaceStockCode(String content) {
		return super.replaceStockCode(content);
	}

	@Override
	public String replaceSpechars(String content) {
		String str = super.replaceSpechars(content);
		return str;

	}

	@Override
	public String addTag(String content) {
		return super.addTag(content);
	}

}
