package com.alsritter.utils;

/**
 * @author alsritter
 * @version 1.0
 **/
public final class ConstantKit {

    /**
     * 注：这个 REQUEST_CURRENT_KEY 可以读取到登陆后的学生 id（保存到 request 请求作用域里）
     * 原理就是登陆鉴权拦截器里注入的
     */
    public static final String REQUEST_CURRENT_KEY = "REQUEST_CURRENT_KEY";

    /**
     * 设置删除标志为真
     */
    public static final Integer DEL_FLAG_TRUE = 1;

    /**
     * 设置删除标志为假
     */
    public static final Integer DEL_FLAG_FALSE = 0;

    /**
     * redis 存储 token 设置的过期时间，3 天
     */
    public static final Integer TOKEN_EXPIRE_TIME = 60 * 60 * 24 * 3;

    /**
     * 设置可以重置 token 过期时间的时间界限
     */
    public static final Integer TOKEN_RESET_TIME = 30 * 60;

    /**
     * 设置验证码到期时间为 5 分钟
     */
    public static final Integer IMAGE_CODE_EXPIRE_TIME = 5 * 60;

    /**
     * 加上这个可方便和其它 key 产生冲突
     */
    public static final String IMAGE_CODE = "IMAGE_CODE";

    /**
     * 加上这个可方便和其它 key 产生冲突
     */
    public static final String USER_ID_LIST = "USER_ID_LIST";

    public enum UserKey{
        STUDENT,
        WORKER,
        ADMIN
    }
}
