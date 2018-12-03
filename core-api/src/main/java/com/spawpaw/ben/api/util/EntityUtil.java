package com.spawpaw.ben.api.util;

import javax.persistence.Table;

public class EntityUtil {

    /**
     * 返回实体的表名
     *
     * @param clazz 实体类
     * @return 对应的表名，如不存在，则返回空
     */
    public static String getTableName(Class<?> clazz) {
        Table annotation = clazz.getAnnotation(Table.class);

        if (annotation != null) {
            return annotation.name();
        } else {
            return "";
        }
    }


}
