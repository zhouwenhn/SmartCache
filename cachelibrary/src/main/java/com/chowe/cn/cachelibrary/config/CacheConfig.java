package com.chowe.cn.cachelibrary.config;


import com.chowe.cn.cachelibrary.LibApplication;

import java.io.File;

/**
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2016</p>
 *
 * @author zhouwen
 * @version 1.0
 * @since 2016/4/8 16:30
 */
public interface CacheConfig {

    String FILE_NAME = "cache_data";

    String CACHE_PATH = LibApplication.getInstance().getFilesDir().getAbsolutePath() + File.separator + FILE_NAME;

//    String CACHE_KEY = userId + "cache";
}
