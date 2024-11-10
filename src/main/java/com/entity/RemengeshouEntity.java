package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 热门歌手
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-03 23:14:41
 */
@TableName("remengeshou")
public class RemengeshouEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public RemengeshouEntity() {
		
	}
	
	public RemengeshouEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 歌手姓名
	 */
					
	private String geshouxingming;
	
	/**
	 * 头像
	 */
					
	private String touxiang;
	
	/**
	 * 歌手分类
	 */
					
	private String geshoufenlei;
	
	/**
	 * 歌曲流派
	 */
					
	private String gequliupai;
	
	/**
	 * 标签
	 */
					
	private String biaoqian;
	
	/**
	 * 代表作
	 */
					
	private String daibiaozuo;
	
	/**
	 * 歌手介绍
	 */
					
	private String geshoujieshao;
	
	/**
	 * 最近点击时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date clicktime;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：歌手姓名
	 */
	public void setGeshouxingming(String geshouxingming) {
		this.geshouxingming = geshouxingming;
	}
	/**
	 * 获取：歌手姓名
	 */
	public String getGeshouxingming() {
		return geshouxingming;
	}
	/**
	 * 设置：头像
	 */
	public void setTouxiang(String touxiang) {
		this.touxiang = touxiang;
	}
	/**
	 * 获取：头像
	 */
	public String getTouxiang() {
		return touxiang;
	}
	/**
	 * 设置：歌手分类
	 */
	public void setGeshoufenlei(String geshoufenlei) {
		this.geshoufenlei = geshoufenlei;
	}
	/**
	 * 获取：歌手分类
	 */
	public String getGeshoufenlei() {
		return geshoufenlei;
	}
	/**
	 * 设置：歌曲流派
	 */
	public void setGequliupai(String gequliupai) {
		this.gequliupai = gequliupai;
	}
	/**
	 * 获取：歌曲流派
	 */
	public String getGequliupai() {
		return gequliupai;
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
	 * 设置：代表作
	 */
	public void setDaibiaozuo(String daibiaozuo) {
		this.daibiaozuo = daibiaozuo;
	}
	/**
	 * 获取：代表作
	 */
	public String getDaibiaozuo() {
		return daibiaozuo;
	}
	/**
	 * 设置：歌手介绍
	 */
	public void setGeshoujieshao(String geshoujieshao) {
		this.geshoujieshao = geshoujieshao;
	}
	/**
	 * 获取：歌手介绍
	 */
	public String getGeshoujieshao() {
		return geshoujieshao;
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

}
