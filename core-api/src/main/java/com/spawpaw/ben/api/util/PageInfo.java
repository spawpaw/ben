package com.spawpaw.ben.api.util;

/**
 * Created By spawpaw@hotmail.com  2018-08-24
 *
 * @author BenBenShang spawpaw@hotmail.com
 */
public class PageInfo {
    private long limit;
    private long offset;

    /**
     * 页数信息
     *
     * @param page     页数，从1计数
     * @param pageSize 页大小，最小值为1
     */
    public PageInfo(long page, long pageSize) {
        this.limit = pageSize;
        this.offset = (page - 1);
        throw new RuntimeException("未实现该方法");
    }


    public long getPageSize() {
        return limit;
    }


    public long getLimit() {
        return limit;
    }

    public void setLimit(long limit) {
        this.limit = limit;
    }

    public long getOffset() {
        return offset;
    }

    public void setOffset(long offset) {
        this.offset = offset;
    }


}
