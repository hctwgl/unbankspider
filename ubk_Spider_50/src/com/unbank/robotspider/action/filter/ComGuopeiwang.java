package com.unbank.robotspider.action.filter;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.stereotype.Service;

import com.unbank.robotspider.action.model.normal.BaseFilter;
import com.unbank.robotspider.action.model.normal.FilterLocator;

@Service
public class ComGuopeiwang extends BaseFilter {

	String[] domain = new String[] { "www.guopeiwang.com" };

	public ComGuopeiwang() {
		for (int i = 0; i < domain.length; i++) {
			FilterLocator.getInstance().register(domain[i], this);
		}
	}

	@Override
	public Element removeNoNeedHtmlElement(String url, Document document,
			String title) {

		Element element = document.select("div.article_newslist > div.article_news_main").first();
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
		
		String[] subStr={"热点主题：","延伸阅读："};
		for(String s: subStr){
			if(str.contains(s)){
				str=str.substring(0, str.indexOf(s));
			}
		}
		
		return str;
	}

	@Override
	public String addTag(String content) {
		return super.addTag(content);
	}

}
