package com.spawpaw.ben.api.entity.schedule;

import java.util.Date;

/**
 * 为某个资源指定日程
 * 多个资源可以拥有同一个日程，比如一个用户和一个会议室可以享有同一个日程，多个用户也可以享有同一个日程
 */
public class ResourceHasSchedule {

    /**
     * 资源类型
     */
    String resource;

    /**
     * 资源id
     * 默认设置为实体表名，如user表填写为user
     */
    Long resourceId;

    /**
     * 日程id
     */
    Long scheduleId;

    /**
     * 创建该条关系的用户
     */
    Long creatorId;

    /**
     * 0. 等待指定资源拥有者确认
     * -1. 资源拥有者已拒绝
     * 1. 指定资源的拥有者已接受该日程
     */
    Short status;

    /**
     * 仅当status为1时该字段才有效。
     * 负数表示 已拒绝，且以后不再接收该资源的任何请求
     * 正数表示拒绝原因，如果日程内容发生变化，则会再次通知指定资源进行确认
     * -1. 已拒绝
     * 1.  时间冲突
     */
    Short denialReason;

    /**
     * 资源拥有者拒绝该日程的详细解释
     */
    String denialReasonDetail;


    /**
     * 仅当所有与该scheduleId相关的vital为true的resource的status变为1时，才会通知vital为false的资源进行确认
     * 如果vital为true的资源的拥有者拒绝了该日程，则该日程将不可用
     */
    Boolean vital;


}
