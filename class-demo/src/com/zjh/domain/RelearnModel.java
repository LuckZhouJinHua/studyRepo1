package com.zjh.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Casual developer
 * @version 1.0
 * @date 2019/7/23/023 15:56
 */
public class RelearnModel implements Serializable {
    private String id;//id
    private String belongType;//题目所属类型  1-考试 ;2-问卷调查
    private String type; //试题类型 1-单选;2-多选;3-判断
    private String title; //题目
    private String answer; //答案
    private String mainCategory; //大类
    private String category; //细类
    private String isDelete; //是否删除
    private String createId; //创建人id
    private Date createTime; //创建时间
    private Date lastUpdateTime; //最后更新时间
    private Date lastUpdateId; //最后更新人Id

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBelongType() {
        return belongType;
    }

    public void setBelongType(String belongType) {
        this.belongType = belongType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getMainCategory() {
        return mainCategory;
    }

    public void setMainCategory(String mainCategory) {
        this.mainCategory = mainCategory;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }

    public String getCreateId() {
        return createId;
    }

    public void setCreateId(String createId) {
        this.createId = createId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public Date getLastUpdateId() {
        return lastUpdateId;
    }

    public void setLastUpdateId(Date lastUpdateId) {
        this.lastUpdateId = lastUpdateId;
    }

    @Override
    public String toString() {
        return "RelearnModel{" +
                "id='" + id + '\'' +
                ", belongType='" + belongType + '\'' +
                ", type='" + type + '\'' +
                ", title='" + title + '\'' +
                ", answer='" + answer + '\'' +
                ", mainCategory='" + mainCategory + '\'' +
                ", category='" + category + '\'' +
                ", isDelete='" + isDelete + '\'' +
                ", createId='" + createId + '\'' +
                ", createTime=" + createTime +
                ", lastUpdateTime=" + lastUpdateTime +
                ", lastUpdateId=" + lastUpdateId +
                '}';
    }
}
