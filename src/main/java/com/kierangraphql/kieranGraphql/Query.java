package com.kierangraphql.kieranGraphql;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLResolver;

public class Query implements GraphQLResolver {
  private final LinkList linkList;

  public Query(LinkList linkList) {
    this.linkList = linkList;
  }

  public List<Link> allLinks() {
    return linkList.getAllLinks();
  }
}