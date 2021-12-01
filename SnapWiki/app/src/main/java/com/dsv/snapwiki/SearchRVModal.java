package com.dsv.snapwiki;

public class SearchRVModal {
    private String link;
    private String title;
    private String display_link;
    private String snippet;

    public SearchRVModal(String link, String title, String display_link, String snippet) {
        this.link = link;
        this.title = title;
        this.display_link = display_link;
        this.snippet = snippet;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDisplay_link() {
        return display_link;
    }

    public void setDisplay_link(String display_link) {
        this.display_link = display_link;
    }

    public String getSnippet() {
        return snippet;
    }

    public void setSnippet(String snippet) {
        this.snippet = snippet;
    }
}
