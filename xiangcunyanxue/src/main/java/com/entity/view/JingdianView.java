package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.JingdianEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 景点
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("jingdian")
public class JingdianView extends JingdianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 景点星级的值
	*/
	@ColumnInfo(comment="景点星级的字典表值",type="varchar(200)")
	private String jingdianXingjiValue;
	/**
	* 景点类型的值
	*/
	@ColumnInfo(comment="景点类型的字典表值",type="varchar(200)")
	private String jingdianValue;
	/**
	* 是否上架的值
	*/
	@ColumnInfo(comment="是否上架的字典表值",type="varchar(200)")
	private String shangxiaValue;




	public JingdianView() {

	}

	public JingdianView(JingdianEntity jingdianEntity) {
		try {
			BeanUtils.copyProperties(this, jingdianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 景点星级的值
	*/
	public String getJingdianXingjiValue() {
		return jingdianXingjiValue;
	}
	/**
	* 设置： 景点星级的值
	*/
	public void setJingdianXingjiValue(String jingdianXingjiValue) {
		this.jingdianXingjiValue = jingdianXingjiValue;
	}
	//当前表的
	/**
	* 获取： 景点类型的值
	*/
	public String getJingdianValue() {
		return jingdianValue;
	}
	/**
	* 设置： 景点类型的值
	*/
	public void setJingdianValue(String jingdianValue) {
		this.jingdianValue = jingdianValue;
	}
	//当前表的
	/**
	* 获取： 是否上架的值
	*/
	public String getShangxiaValue() {
		return shangxiaValue;
	}
	/**
	* 设置： 是否上架的值
	*/
	public void setShangxiaValue(String shangxiaValue) {
		this.shangxiaValue = shangxiaValue;
	}




	@Override
	public String toString() {
		return "JingdianView{" +
			", jingdianXingjiValue=" + jingdianXingjiValue +
			", jingdianValue=" + jingdianValue +
			", shangxiaValue=" + shangxiaValue +
			"} " + super.toString();
	}
}
