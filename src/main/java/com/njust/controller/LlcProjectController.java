package com.njust.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.njust.service.LlcProjectService;
import com.njust.utils.PageUtils;
import com.njust.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @author tomato
 * @create 2018-09-02 上午10:00
 */
@Controller
@RequestMapping(value = "/**/Project")
public class LlcProjectController {
    @Autowired
    private LlcProjectService llcProjectService;

    @PostMapping(value = "/getProjectList")
    @ResponseBody
    public JSONObject getReplenishList(@RequestParam Map map) throws Exception {
        if (!StringUtil.isNULLOREmpty((String) map.get("page"))) {
            map.put("page", new PageUtils(map.get("page")).getPage());
        }
        if (!StringUtil.isNULLOREmpty((String) map.get("limit"))) {
            map.put("limit", map.get("limit"));
        }
        JSONObject obj = JSONObject.parseObject(JSON.toJSONString(map));
        return JSONObject.parseObject(JSON.toJSONString(llcProjectService.getLlcProjectByLike(obj)));
    }

    @PostMapping(value = "/updateProject")
    @ResponseBody
    public JSONObject updateProject(@RequestParam Map map) throws Exception {
        JSONObject obj = JSONObject.parseObject(JSON.toJSONString(map));
        return JSONObject.parseObject(JSON.toJSONString(llcProjectService.updateLlcProjectInfo(obj)));
    }

    @PostMapping(value = "/addProject")
    @ResponseBody
    public JSONObject addProject(@RequestParam Map map) throws Exception {
        JSONObject obj = JSONObject.parseObject(JSON.toJSONString(map));
        return JSONObject.parseObject(JSON.toJSONString(llcProjectService.insertLlcProject(obj)));
    }

    @PostMapping(value = "/deleteProject")
    @ResponseBody
    public JSONObject deleteProject(@RequestParam Map map) throws Exception {
        JSONObject obj = JSONObject.parseObject(JSON.toJSONString(map));
        return JSONObject.parseObject(JSON.toJSONString(llcProjectService.deleteLlcProject(obj)));
    }
}
