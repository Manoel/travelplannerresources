package com.example.query.model;

import java.util.List;

public class QueryResult<T extends QueryModel> {

  private List<T> result;

  private int totalItems;

  public QueryResult(List<T> result, int totalItems) {
    this.result = result;
    this.totalItems = totalItems;
  }

  public List<T> getResult() {
    return result;
  }

  public int getTotalItems() {
    return totalItems;
  }
}
