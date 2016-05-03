package com.example.query.model.trip;

import com.example.query.model.Pagination;
import com.example.query.model.QueryResult;

public interface TripFinder {
	
	QueryResult<TripQueryModel> find(Pagination pagination, TripFilter filter);

}
