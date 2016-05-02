package com.example.query.model;

public class Pagination {

  private int currentPage;

  private int itemsPerPage;

  public Pagination(){}

  public Pagination(int currentPage,int itemsPerPage) {
    this.currentPage = currentPage;
    this.itemsPerPage = itemsPerPage;
  }

  public int getCurrentPage() {
    return currentPage;
  }

  public int getItemsPerPage() {
    return itemsPerPage;
  }
}
