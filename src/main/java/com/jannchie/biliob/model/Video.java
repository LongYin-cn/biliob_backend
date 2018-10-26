package com.jannchie.biliob.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author jannchie
 */
public class Video {
    @Id
    private ObjectId id;
    private Long aid;
    private Long mid;
    private String title;
    private String author;
    private String channel;
    private String subChannel;
    private String pic;
    private Boolean focus;
    private ArrayList<Data> data;

    public Video(Long aid) {
        this.aid = aid;
    }

    public Long getAid() {
        return aid;
    }

    public Long getMid() {
        return mid;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getChannel() {
        return channel;
    }

    public String getSubChannel() {
        return subChannel;
    }

    public String getPic() {
        return pic;
    }

    public ArrayList<Data> getData() {
        return data;
    }

    public Boolean getFocus() {
        return focus;
    }

    public class Data {
        private Integer view;
        private Integer favorite;
        private Integer danmaku;
        private Integer coin;
        private Integer share;
        private Integer like;
        private Integer dislike;
        private Date datetime;

        public Integer getView() {
            return view;
        }

        public Integer getFavorite() {
            return favorite;
        }

        public Integer getDanmaku() {
            return danmaku;
        }

        public Integer getCoin() {
            return coin;
        }

        public Integer getShare() {
            return share;
        }

        public Integer getLike() {
            return like;
        }

        public Integer getDislike() {
            return dislike;
        }

        public Date getDatetime() {
            return datetime;
        }
    }
}
