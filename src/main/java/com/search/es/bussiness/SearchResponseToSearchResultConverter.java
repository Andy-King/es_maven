package com.search.es.bussiness;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.elasticsearch.action.search.SearchResponse;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component(SearchResponseToSearchResultConverter.BEAN_ID)
public class SearchResponseToSearchResultConverter implements
		Converter<SearchResponse, SearchResult> {

	protected final Log logger = LogFactory.getLog(getClass());

	public static final String BEAN_ID = "searchResponseToSearchResultConverter";

	@Override
	public SearchResult convert(SearchResponse source) {
		return null;
	}
}