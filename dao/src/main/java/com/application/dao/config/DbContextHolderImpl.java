package com.application.dao.config;

public class DbContextHolderImpl {

    private final static ThreadLocal<DataSourceType> contextHolder = new ThreadLocal<DataSourceType>();

    public static void setDbType(DataSourceType dbType) {
        if (dbType == null)
            throw new RuntimeException("DbType can't be null");
        contextHolder.set(dbType);
    }

    public static DataSourceType getDbType() {
        return (DataSourceType) contextHolder.get();
    }

    public static void clearDbType() {
        contextHolder.remove();
    }
}
