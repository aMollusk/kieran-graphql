package com.kierangraphql.kieranGraphql;

public class Link {
  public String url;
  public String name;

  public Link(String url, String name) {
    this.url = url;
    this.name = name;
  }

  public String getUrl() {
    return url;
  }

  public String getName() {
    return name;
  }
}