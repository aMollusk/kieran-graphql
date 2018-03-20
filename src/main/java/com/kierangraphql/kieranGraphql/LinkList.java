package com.kierangraphql.kieranGraphql;

import java.util.ArrayList;
import java.util.List;

public class LinkList {
  public List<Link> allLinks;

  public LinkList() {
    ArrayList<Link> myLinks = new ArrayList<Link>();

    myLinks.add(new Link("One", "two"));
    this.allLinks = myLinks;
  }

  public List<Link> getAllLinks() {
    return allLinks;
  }
}