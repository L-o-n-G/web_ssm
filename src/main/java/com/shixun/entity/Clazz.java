package com.shixun.entity;

import java.util.Date;

public class Clazz {
    private String id;

    private String name;

    private Date createTime;

    private Integer sort;

    private String remarks;

    private Integer isExist;

    private Date startTime;

    private Date endTime;

    private Integer studentCount;

    private Integer hasStugroup;

    private String technologyDirection;

    private String reservedOne;

    private String reservedTwo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Integer getIsExist() {
        return isExist;
    }

    public void setIsExist(Integer isExist) {
        this.isExist = isExist;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(Integer studentCount) {
        this.studentCount = studentCount;
    }

    public Integer getHasStugroup() {
        return hasStugroup;
    }

    public void setHasStugroup(Integer hasStugroup) {
        this.hasStugroup = hasStugroup;
    }

    public String getTechnologyDirection() {
        return technologyDirection;
    }

    public void setTechnologyDirection(String technologyDirection) {
        this.technologyDirection = technologyDirection == null ? null : technologyDirection.trim();
    }

    public String getReservedOne() {
        return reservedOne;
    }

    public void setReservedOne(String reservedOne) {
        this.reservedOne = reservedOne == null ? null : reservedOne.trim();
    }

    public String getReservedTwo() {
        return reservedTwo;
    }

    public void setReservedTwo(String reservedTwo) {
        this.reservedTwo = reservedTwo == null ? null : reservedTwo.trim();
    }
}