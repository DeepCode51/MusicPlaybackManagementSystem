package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.RemenyinleEntity;
import com.entity.view.RemenyinleView;

import com.service.RemenyinleService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 热门音乐
 * 后端接口
 * @author 
 * @email 
 * @date 2022-03-03 23:14:41
 */
@RestController
@RequestMapping("/remenyinle")
public class RemenyinleController {
    @Autowired
    private RemenyinleService remenyinleService;

    @Autowired
    private StoreupService storeupService;

    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,RemenyinleEntity remenyinle,
		HttpServletRequest request){
        EntityWrapper<RemenyinleEntity> ew = new EntityWrapper<RemenyinleEntity>();
		PageUtils page = remenyinleService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, remenyinle), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,RemenyinleEntity remenyinle, 
		HttpServletRequest request){
        EntityWrapper<RemenyinleEntity> ew = new EntityWrapper<RemenyinleEntity>();
		PageUtils page = remenyinleService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, remenyinle), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( RemenyinleEntity remenyinle){
       	EntityWrapper<RemenyinleEntity> ew = new EntityWrapper<RemenyinleEntity>();
      	ew.allEq(MPUtil.allEQMapPre( remenyinle, "remenyinle")); 
        return R.ok().put("data", remenyinleService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(RemenyinleEntity remenyinle){
        EntityWrapper< RemenyinleEntity> ew = new EntityWrapper< RemenyinleEntity>();
 		ew.allEq(MPUtil.allEQMapPre( remenyinle, "remenyinle")); 
		RemenyinleView remenyinleView =  remenyinleService.selectView(ew);
		return R.ok("查询热门音乐成功").put("data", remenyinleView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        RemenyinleEntity remenyinle = remenyinleService.selectById(id);
		remenyinle.setClicknum(remenyinle.getClicknum()+1);
		remenyinle.setClicktime(new Date());
		remenyinleService.updateById(remenyinle);
        return R.ok().put("data", remenyinle);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        RemenyinleEntity remenyinle = remenyinleService.selectById(id);
		remenyinle.setClicknum(remenyinle.getClicknum()+1);
		remenyinle.setClicktime(new Date());
		remenyinleService.updateById(remenyinle);
        return R.ok().put("data", remenyinle);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R vote(@PathVariable("id") String id,String type){
        RemenyinleEntity remenyinle = remenyinleService.selectById(id);
        if(type.equals("1")) {
        	remenyinle.setThumbsupnum(remenyinle.getThumbsupnum()+1);
        } else {
        	remenyinle.setCrazilynum(remenyinle.getCrazilynum()+1);
        }
        remenyinleService.updateById(remenyinle);
        return R.ok("投票成功");
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody RemenyinleEntity remenyinle, HttpServletRequest request){
    	remenyinle.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(remenyinle);
        remenyinleService.insert(remenyinle);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody RemenyinleEntity remenyinle, HttpServletRequest request){
    	remenyinle.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(remenyinle);
        remenyinleService.insert(remenyinle);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody RemenyinleEntity remenyinle, HttpServletRequest request){
        //ValidatorUtils.validateEntity(remenyinle);
        remenyinleService.updateById(remenyinle);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        remenyinleService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<RemenyinleEntity> wrapper = new EntityWrapper<RemenyinleEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = remenyinleService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,RemenyinleEntity remenyinle, HttpServletRequest request,String pre){
        EntityWrapper<RemenyinleEntity> ew = new EntityWrapper<RemenyinleEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicknum");
        params.put("order", "desc");
		PageUtils page = remenyinleService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, remenyinle), params), params));
        return R.ok().put("data", page);
    }


    /**
     * 协同算法（按收藏推荐）
     */
    @RequestMapping("/autoSort2")
    public R autoSort2(@RequestParam Map<String, Object> params,RemenyinleEntity remenyinle, HttpServletRequest request){
        String userId = request.getSession().getAttribute("userId").toString();
        String inteltypeColumn = "yinlefenlei";
        List<StoreupEntity> storeups = storeupService.selectList(new EntityWrapper<StoreupEntity>().eq("type", 1).eq("userid", userId).eq("tablename", "remenyinle").orderBy("addtime", false));
        List<String> inteltypes = new ArrayList<String>();
        Integer limit = params.get("limit")==null?10:Integer.parseInt(params.get("limit").toString());
        List<RemenyinleEntity> remenyinleList = new ArrayList<RemenyinleEntity>();
        //去重
        if(storeups!=null && storeups.size()>0) {
            for(StoreupEntity s : storeups) {
                remenyinleList.addAll(remenyinleService.selectList(new EntityWrapper<RemenyinleEntity>().eq(inteltypeColumn, s.getInteltype())));
            }
        }
        EntityWrapper<RemenyinleEntity> ew = new EntityWrapper<RemenyinleEntity>();
        params.put("sort", "id");
        params.put("order", "desc");
        PageUtils page = remenyinleService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, remenyinle), params), params));
        List<RemenyinleEntity> pageList = (List<RemenyinleEntity>)page.getList();
        if(remenyinleList.size()<limit) {
            int toAddNum = (limit-remenyinleList.size())<=pageList.size()?(limit-remenyinleList.size()):pageList.size();
            for(RemenyinleEntity o1 : pageList) {
                boolean addFlag = true;
                for(RemenyinleEntity o2 : remenyinleList) {
                    if(o1.getId().intValue()==o2.getId().intValue()) {
                        addFlag = false;
                        break;
                    }
                }
                if(addFlag) {
                    remenyinleList.add(o1);
                    if(--toAddNum==0) break;
                }
            }
        }
        page.setList(remenyinleList);
        return R.ok().put("data", page);
    }





}
