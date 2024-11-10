package com.entity.model;

import com.entity.RemenyinleEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 热门音乐
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-03 23:14:41
 */
public class RemenyinleModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 音乐分类
	 */
	
	private String yinlefenlei;
		
	/**
	 * 歌曲音频
	 */
	
	private String gequyinpin;
		
	/**
	 * 歌手
	 */
	
	private String geshou;
		
	/**
	 * 专辑名称
	 */
	
	private String zhuanjimingcheng;
		
	/**
	 * 标签
	 */
	
	private String biaoqian;
		
	/**
	 * 歌曲详情
	 */
	
	private String gequxiangqing;
		
	/**
	 * 发行日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faxingriqi;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
				
	
	/**
	 * 设置：封面
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
				
	
	/**
	 * 设置：音乐分类
	 */
	 
	public void setYinlefenlei(String yinlefenlei) {
		this.yinlefenlei = yinlefenlei;
	}
	
	/**
	 * 获取：音乐分类
	 */
	public String getYinlefenlei() {
		return yinlefenlei;
	}
				
	
	/**
	 * 设置：歌曲音频
	 */
	 
	public void setGequyinpin(String gequyinpin) {
		this.gequyinpin = gequyinpin;
	}
	
	/**
	 * 获取：歌曲音频
	 */
	public String getGequyinpin() {
		return gequyinpin;
	}
				
	
	/**
	 * 设置：歌手
	 */
	 
	public void setGeshou(String geshou) {
		this.geshou = geshou;
	}
	
	/**
	 * 获取：歌手
	 */
	public String getGeshou() {
		return geshou;
	}
				
	
	/**
	 * 设置：专辑名称
	 */
	 
	public void setZhuanjimingcheng(String zhuanjimingcheng) {
		this.zhuanjimingcheng = zhuanjimingcheng;
	}
	
	/**
	 * 获取：专辑名称
	 */
	public String getZhuanjimingcheng() {
		return zhuanjimingcheng;
	}
				
	
	/**
	 * 设置：标签
	 */
	 
	public void setBiaoqian(String biaoqian) {
		this.biaoqian = biaoqian;
	}
	
	/**
	 * 获取：标签
	 */
	public String getBiaoqian() {
		return biaoqian;
	}
				
	
	/**
	 * 设置：歌曲详情
	 */
	 
	public void setGequxiangqing(String gequxiangqing) {
		this.gequxiangqing = gequxiangqing;
	}
	
	/**
	 * 获取：歌曲详情
	 */
	public String getGequxiangqing() {
		return gequxiangqing;
	}
				
	
	/**
	 * 设置：发行日期
	 */
	 
	public void setFaxingriqi(Date faxingriqi) {
		this.faxingriqi = faxingriqi;
	}
	
	/**
	 * 获取：发行日期
	 */
	public Date getFaxingriqi() {
		return faxingriqi;
	}
				
	
	/**
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
			
}
