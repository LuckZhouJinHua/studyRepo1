package com.zjh.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Casual developer
 * @version 1.0
 * @date 2019/7/23/023 16:02
 */
public class RelearnOptionsModel implements Serializable {
    private String id;//id
    private String questionId;//题目表id
    private String option; //选项
    private String detail; //内容
    private Integer seq; //序号
    private String isDelete; //是否删除
    private String createId;//创建人id
    private Date createTime;//创建时间
    private Date lastUpdateTime;//最后更新时间
    private String lastUpdateId;//最后更新人id
    private String remark;//备注

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
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

    public String getLastUpdateId() {
        return lastUpdateId;
    }

    public void setLastUpdateId(String lastUpdateId) {
        this.lastUpdateId = lastUpdateId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "RelearnOptionsModel{" +
                "id='" + id + '\'' +
                ", questionId='" + questionId + '\'' +
                ", option='" + option + '\'' +
                ", detail='" + detail + '\'' +
                ", seq=" + seq +
                ", isDelete='" + isDelete + '\'' +
                ", createId='" + createId + '\'' +
                ", createTime=" + createTime +
                ", lastUpdateTime=" + lastUpdateTime +
                ", lastUpdateId='" + lastUpdateId + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
