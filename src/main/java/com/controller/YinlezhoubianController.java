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
import com.entity.OrdersEntity;
import com.service.OrdersService;

import com.entity.YinlezhoubianEntity;
import com.entity.view.YinlezhoubianView;

import com.service.YinlezhoubianService;
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
 * 音乐周边
 * 后端接口
 * @author 
 * @email 
 * @date 2022-03-03 23:14:41
 */
@RestController
@RequestMapping("/yinlezhoubian")
public class YinlezhoubianController {
    @Autowired
    private YinlezhoubianService yinlezhoubianService;

    @Autowired
    private StoreupService storeupService;

    @Autowired
    private OrdersService ordersService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YinlezhoubianEntity yinlezhoubian,
		HttpServletRequest request){
        EntityWrapper<YinlezhoubianEntity> ew = new EntityWrapper<YinlezhoubianEntity>();
		PageUtils page = yinlezhoubianService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yinlezhoubian), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YinlezhoubianEntity yinlezhoubian, 
		HttpServletRequest request){
        EntityWrapper<YinlezhoubianEntity> ew = new EntityWrapper<YinlezhoubianEntity>();
		PageUtils page = yinlezhoubianService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yinlezhoubian), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YinlezhoubianEntity yinlezhoubian){
       	EntityWrapper<YinlezhoubianEntity> ew = new EntityWrapper<YinlezhoubianEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yinlezhoubian, "yinlezhoubian")); 
        return R.ok().put("data", yinlezhoubianService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YinlezhoubianEntity yinlezhoubian){
        EntityWrapper< YinlezhoubianEntity> ew = new EntityWrapper< YinlezhoubianEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yinlezhoubian, "yinlezhoubian")); 
		YinlezhoubianView yinlezhoubianView =  yinlezhoubianService.selectView(ew);
		return R.ok("查询音乐周边成功").put("data", yinlezhoubianView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YinlezhoubianEntity yinlezhoubian = yinlezhoubianService.selectById(id);
		yinlezhoubian.setClicknum(yinlezhoubian.getClicknum()+1);
		yinlezhoubian.setClicktime(new Date());
		yinlezhoubianService.updateById(yinlezhoubian);
        return R.ok().put("data", yinlezhoubian);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YinlezhoubianEntity yinlezhoubian = yinlezhoubianService.selectById(id);
		yinlezhoubian.setClicknum(yinlezhoubian.getClicknum()+1);
		yinlezhoubian.setClicktime(new Date());
		yinlezhoubianService.updateById(yinlezhoubian);
        return R.ok().put("data", yinlezhoubian);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YinlezhoubianEntity yinlezhoubian, HttpServletRequest request){
    	yinlezhoubian.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yinlezhoubian);
        yinlezhoubianService.insert(yinlezhoubian);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YinlezhoubianEntity yinlezhoubian, HttpServletRequest request){
    	yinlezhoubian.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yinlezhoubian);
        yinlezhoubianService.insert(yinlezhoubian);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody YinlezhoubianEntity yinlezhoubian, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yinlezhoubian);
        yinlezhoubianService.updateById(yinlezhoubian);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yinlezhoubianService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<YinlezhoubianEntity> wrapper = new EntityWrapper<YinlezhoubianEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = yinlezhoubianService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,YinlezhoubianEntity yinlezhoubian, HttpServletRequest request,String pre){
        EntityWrapper<YinlezhoubianEntity> ew = new EntityWrapper<YinlezhoubianEntity>();
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
		PageUtils page = yinlezhoubianService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yinlezhoubian), params), params));
        return R.ok().put("data", page);
    }


        /**
     * 协同算法（按用户购买推荐）
     */
    @RequestMapping("/autoSort2")
    public R autoSort2(@RequestParam Map<String, Object> params,YinlezhoubianEntity yinlezhoubian, HttpServletRequest request){
        String userId = request.getSession().getAttribute("userId").toString();
        String goodtypeColumn = "shangpinfenlei";
        List<OrdersEntity> orders = ordersService.selectList(new EntityWrapper<OrdersEntity>().eq("userid", userId).eq("tablename", "yinlezhoubian").orderBy("addtime", false));
        List<String> goodtypes = new ArrayList<String>();
        Integer limit = params.get("limit")==null?10:Integer.parseInt(params.get("limit").toString());
        List<YinlezhoubianEntity> yinlezhoubianList = new ArrayList<YinlezhoubianEntity>();
	//去重
    	List<OrdersEntity> ordersDist = new ArrayList<OrdersEntity>();
    	for(OrdersEntity o1 : orders) {
    		boolean addFlag = true;
    		for(OrdersEntity o2 : ordersDist) {
    			if(o1.getGoodid()==o2.getGoodid() || o1.getGoodtype().equals(o2.getGoodtype())) {
    				addFlag = false;
    				break;
    			}
    		}
    		if(addFlag) ordersDist.add(o1);
    	}
        if(ordersDist!=null && ordersDist.size()>0) {
                for(OrdersEntity o : ordersDist) {
                        yinlezhoubianList.addAll(yinlezhoubianService.selectList(new EntityWrapper<YinlezhoubianEntity>().eq(goodtypeColumn, o.getGoodtype())));
                }
        }
        EntityWrapper<YinlezhoubianEntity> ew = new EntityWrapper<YinlezhoubianEntity>();
        params.put("sort", "id");
        params.put("order", "desc");
        PageUtils page = yinlezhoubianService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yinlezhoubian), params), params));
        List<YinlezhoubianEntity> pageList = (List<YinlezhoubianEntity>)page.getList();
        if(yinlezhoubianList.size()<limit) {
                int toAddNum = (limit-yinlezhoubianList.size())<=pageList.size()?(limit-yinlezhoubianList.size()):pageList.size();
                for(YinlezhoubianEntity o1 : pageList) {
                    boolean addFlag = true;
                    for(YinlezhoubianEntity o2 : yinlezhoubianList) {
                        if(o1.getId().intValue()==o2.getId().intValue()) {
                            addFlag = false;
                            break;
                        }
                    }
                    if(addFlag) {
                        yinlezhoubianList.add(o1);
                        if(--toAddNum==0) break;
                    }   
                }
        }
        page.setList(yinlezhoubianList);
        return R.ok().put("data", page);
    }





}
