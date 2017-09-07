/**   
* @Title: BaseDict.java 
* @Package cn.itheima.crm.po 
* @Description: TODO(用一句话描述该文件做什么) 
* @author 传智 小杨老师 
* @date 2017-8-28 上午10:00:59 
* @version V1.0   
*/
package cn.itheima.crm.po;

/** 
 * @ClassName: BaseDict 
 * @Description: 数据字典pojo 
 * @author 传智 小杨老师  
 * @date 2017-8-28 上午10:00:59 
 *  
 */
public class BaseDict {
	
	//时代峻峰涉及到福建省地方集
	
	private String dict_id; // varchar(32) NOT NULL COMMENT '数据字典id(主键)',
	private String dict_type_code; // varchar(10) NOT NULL COMMENT '数据字典类别代码',
	private String dict_type_name; // varchar(64) NOT NULL COMMENT '数据字典类别名称',
	private String dict_item_name; // varchar(64) NOT NULL COMMENT '数据字典项目名称',
	private String dict_item_code; // varchar(10) DEFAULT NULL COMMENT
									// '数据字典项目代码(可为空)',
	private Integer dict_sort; // int(10) DEFAULT NULL COMMENT '排序字段',
	private String dict_enable; // char(1) NOT NULL COMMENT '1:使用 0:停用',
	private String dict_memo; // varchar(64) DEFAULT NULL COMMENT '备注',
	/**
	 * @return the dict_id
	 */
	public String getDict_id() {
		return dict_id;
	}
	/**
	 * @param dict_id the dict_id to set
	 */
	public void setDict_id(String dict_id) {
		this.dict_id = dict_id;
	}
	/**
	 * @return the dict_type_code
	 */
	public String getDict_type_code() {
		return dict_type_code;
	}
	/**
	 * @param dict_type_code the dict_type_code to set
	 */
	public void setDict_type_code(String dict_type_code) {
		this.dict_type_code = dict_type_code;
	}
	/**
	 * @return the dict_type_name
	 */
	public String getDict_type_name() {
		return dict_type_name;
	}
	/**
	 * @param dict_type_name the dict_type_name to set
	 */
	public void setDict_type_name(String dict_type_name) {
		this.dict_type_name = dict_type_name;
	}
	/**
	 * @return the dict_item_name
	 */
	public String getDict_item_name() {
		return dict_item_name;
	}
	/**
	 * @param dict_item_name the dict_item_name to set
	 */
	public void setDict_item_name(String dict_item_name) {
		this.dict_item_name = dict_item_name;
	}
	/**
	 * @return the dict_item_code
	 */
	public String getDict_item_code() {
		return dict_item_code;
	}
	/**
	 * @param dict_item_code the dict_item_code to set
	 */
	public void setDict_item_code(String dict_item_code) {
		this.dict_item_code = dict_item_code;
	}
	/**
	 * @return the dict_sort
	 */
	public Integer getDict_sort() {
		return dict_sort;
	}
	/**
	 * @param dict_sort the dict_sort to set
	 */
	public void setDict_sort(Integer dict_sort) {
		this.dict_sort = dict_sort;
	}
	/**
	 * @return the dict_enable
	 */
	public String getDict_enable() {
		return dict_enable;
	}
	/**
	 * @param dict_enable the dict_enable to set
	 */
	public void setDict_enable(String dict_enable) {
		this.dict_enable = dict_enable;
	}
	/**
	 * @return the dict_memo
	 */
	public String getDict_memo() {
		return dict_memo;
	}
	/**
	 * @param dict_memo the dict_memo to set
	 */
	public void setDict_memo(String dict_memo) {
		this.dict_memo = dict_memo;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BaseDict [dict_id=" + dict_id + ", dict_type_code="
				+ dict_type_code + ", dict_type_name=" + dict_type_name
				+ ", dict_item_name=" + dict_item_name + ", dict_item_code="
				+ dict_item_code + ", dict_sort=" + dict_sort
				+ ", dict_enable=" + dict_enable + ", dict_memo=" + dict_memo
				+ "]";
	}


}
