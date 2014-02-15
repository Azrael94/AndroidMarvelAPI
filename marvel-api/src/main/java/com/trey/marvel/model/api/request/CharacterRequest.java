package com.trey.marvel.model.api.request;

import org.apache.commons.lang3.StringUtils;

import java.util.Date;
import java.util.List;

/**
 * Created by Trey Robinson on 2/14/14.
 */
public class CharacterRequest extends BaseRequest {

    public enum OrderBy {
        Name ("name")
        ,NameDescending("-name")
        ,Date("date")
        ,DateDescending("-date");

        private String value;

        OrderBy(String value){
            this.value = value;
        }

        public String getValue(){
            return this.value;
        }
    }

    private String name;
    private Date modifiedSince;
    private List<Integer> comics;
    private List<Integer> series;
    private List<Integer> events;
    private List<Integer> stories;
    private OrderBy orderBy;
    private int limit;
    private int offset;

    public CharacterRequest(RequestSignature requestSignature){
        super(requestSignature);
        orderBy = OrderBy.Name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getModifiedSince() {
        return modifiedSince;
    }

    public void setModifiedSince(Date modifiedSince) {
        this.modifiedSince = modifiedSince;
    }

    public List<Integer>getComics(){
        return this.comics;
    }
    public String getComicsParameter() {
        return StringUtils.join(this.comics, ",");
    }

    public void setComics(List<Integer> comics) {
        this.comics = comics;
    }

    public List<Integer> getSeries() {
        return series;
    }

    public String getSeriesParameter() {
        return StringUtils.join(this.series, ",");
    }
    public void setSeries(List<Integer> series) {
        this.series = series;
    }

    public List<Integer> getEvents() {
        return events;
    }

    public String getEventsParameter() {
        return StringUtils.join(this.events, ",");
    }

    public void setEvents(List<Integer> events) {
        this.events = events;
    }

    public List<Integer> getStories() {
        return stories;
    }

    public String getStoriesParameter() {
        return StringUtils.join(this.stories, ",");
    }

    public void setStories(List<Integer> stories) {
        this.stories = stories;
    }

    public OrderBy getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(OrderBy orderBy) {
        this.orderBy = orderBy;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }


}
