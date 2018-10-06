package com.spawpaw.ben.api.entity.schedule;

import java.io.Serializable;
import java.util.Date;

public class Schedule implements Serializable {
    /**
     * 事件id
     */
    Long id;

    /**
     * 事件名称
     */
    String title;

    /**
     * 事件发生地点
     */
    String location;

    /**
     * 事件详细描述
     */
    String detail;

    /**
     * 事件创建时间
     */
    Date utcCreate;

    /**
     * 时间最近更新时间
     */
    Date utcUpdate;

    /**
     * 事件开始时间
     */
    Date utcStart;

    /**
     * 事件结束时间
     */
    Date utcEnd;
}
