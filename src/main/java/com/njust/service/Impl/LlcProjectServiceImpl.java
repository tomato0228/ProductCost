package com.njust.service.Impl;

import com.alibaba.fastjson.JSONObject;
import com.njust.mapper.LlcProjectMapper;
import com.njust.model.LlcProject;
import com.njust.model.LlcProjectExample;
import com.njust.service.LlcProjectService;
import com.njust.utils.GetDateBaseName;
import com.njust.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author tomato
 * @create 2018-09-02 上午9:54
 */
@Service("Project")
public class LlcProjectServiceImpl implements LlcProjectService {

    @Autowired(required = false)
    LlcProjectMapper llcProjectMapper;

    @Override
    public Map<String, Object> insertLlcProject(JSONObject object) throws Exception {
        Map<String, Object> resultSet = new HashMap<>(16);
        try {
            LlcProject llcProject = new LlcProject();
            llcProject.setProjectName(object.getString("projectName"));
            llcProject.setProjectId(llcProjectMapper.maxId() + 1);
            llcProjectMapper.insertSelective(llcProject);
            resultSet.put("code", 0);
        } catch (Exception e) {
            resultSet.put("code", 100);
            e.printStackTrace();
        }
        return resultSet;
    }

    @Override
    public Map<String, Object> getLlcProjectByLike(JSONObject object) throws Exception {
        int total = 0;
        Map<String, Object> resultSet = new HashMap<>(16);
        List<LlcProject> llcProjects;
        try {
            LlcProjectExample llcProjectExample = new LlcProjectExample();
            LlcProjectExample.Criteria criteria = llcProjectExample.createCriteria();
            //查询条件
            if (!StringUtil.isNULLOREmpty(object.getString("projectName"))) {
                criteria.andProjectNameLike("%" + object.getString("projectName") + "%");
            }
            llcProjects = llcProjectMapper.selectByExample(llcProjectExample);
            if (llcProjects != null) {
                total = llcProjects.size();
            }
            //排序
            String sort = object.getString("sort");
            String order = object.getString("order");
            if (sort != null && order != null) {
                sort = GetDateBaseName.getSortName(sort);
                llcProjectExample.setOrderByClause(sort + " " + order);
            }
            //分页
            if (object.getInteger("limit") != null && object.getInteger("page") != null) {
                int page = object.getInteger("page");
                int limit = object.getInteger("limit");
                if (page >= 0 && limit > 0) {
                    llcProjectExample.setOffset(page * limit);
                    llcProjectExample.setLimit(limit);
                }
            }
            llcProjects = llcProjectMapper.selectByExample(llcProjectExample);
            resultSet.put("code", 0);
            resultSet.put("msg", "获取项目列表成功！");
            resultSet.put("count", total);
            resultSet.put("data", llcProjects);
        } catch (Exception e) {
            resultSet.put("code", 100);
            resultSet.put("msg", "获取项目列表错误！");
            resultSet.put("count", 0);
            resultSet.put("data", new ArrayList<>());
        }
        return resultSet;
    }

    @Override
    public Map<String, Object> updateLlcProjectInfo(JSONObject object) throws Exception {
        Map<String, Object> resultSet = new HashMap<>(16);
        try {
            LlcProject llcProject = new LlcProject();
            llcProject.setProjectId(object.getInteger("projectId"));
            llcProject.setProjectName(object.getString("projectName"));
            llcProjectMapper.updateByPrimaryKeySelective(llcProject);
            resultSet.put("code", 0);
        } catch (Exception e) {
            resultSet.put("code", 100);
        }
        return resultSet;
    }

    @Override
    public Map<String, Object> deleteLlcProject(JSONObject object) throws Exception {
        Map<String, Object> resultSet = new HashMap<>(16);
        try {
            llcProjectMapper.deleteByPrimaryKey(object.getInteger("projectId"));
            resultSet.put("code", 0);
        } catch (Exception e) {
            resultSet.put("code", 100);
        }
        return resultSet;
    }
}
