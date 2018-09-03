package com.njust.service;

import com.alibaba.fastjson.JSONObject;

import java.util.Map;

/**
 * @author tomato
 * @create 2018-09-02 上午9:53
 */

public interface LlcProjectService {

    /**
     * 创建项目
     *
     * @param object 创建的项目名称
     * @return 是否创建成功
     * @throws Exception 处理异常
     */
    Map<String, Object> insertLlcProject(JSONObject object) throws Exception;

    /**
     * 项目按项目名称模糊查询
     *
     * @param object 查询项目名称
     * @return 项目列表
     * @throws Exception 处理异常
     */
    Map<String, Object> getLlcProjectByLike(JSONObject object) throws Exception;


    /**
     * 更改项目名称
     *
     * @param object 新的项目名称
     * @return 是否更改成功
     * @throws Exception 处理异常
     */
    Map<String, Object> updateLlcProjectInfo(JSONObject object) throws Exception;

    /**
     * 删除项目
     *
     * @param object 删除项目的ID
     * @return 是否删除成功
     * @throws Exception 处理异常
     */
    Map<String, Object> deleteLlcProject(JSONObject object) throws Exception;
}
