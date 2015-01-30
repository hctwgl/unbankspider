package com.unbank.robotspider.filter.titlelist;

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

@Service
public class CnExecunetTitleListFilter extends BaseTitleListFilter {
	private String domain = "www.execunet.cn";

	public CnExecunetTitleListFilter() {
		TitleListFilterLocator.getInstance().register(domain, this);
	}

	@Override
	public Elements getPossibleListElement(Document document) {
		return document.select("td.ntitle>a");
	}

}
