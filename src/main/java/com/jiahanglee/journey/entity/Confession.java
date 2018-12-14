package com.jiahanglee.journey.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
@Entity
public class Confession {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String detail;
    private Timestamp loveTime;
    private String together;
    @CreationTimestamp
    @Column(name = "create_time", columnDefinition = "DATETIME COMMENT '添加时间'")
    private Timestamp createTime;
    @UpdateTimestamp
    @Column(name = "update_time", columnDefinition = "DATETIME COMMENT '最后更新时间'")
    private Timestamp updateTime;

    public Timestamp getLoveTime() {
        return loveTime;
    }

    public void setLoveTime(Timestamp loveTime) {
        this.loveTime = loveTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getTogether() {
        return together;
    }

    public void setTogether(String together) {
        this.together = together;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "Confession{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", detail='" + detail + '\'' +
                ", loveTime=" + loveTime +
                ", together='" + together + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
