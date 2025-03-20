package com.entity.vo;

import com.entity.LvyoudongtaiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 旅游动态
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("lvyoudongtai")
public class LvyoudongtaiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 动态标题
     */

    @TableField(value = "lvyoudongtai_name")
    private String lvyoudongtaiName;


    /**
     * 动态类型
     */

    @TableField(value = "lvyoudongtai_types")
    private Integer lvyoudongtaiTypes;


    /**
     * 动态图片
     */

    @TableField(value = "lvyoudongtai_photo")
    private String lvyoudongtaiPhoto;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 动态详情
     */

    @TableField(value = "lvyoudongtai_content")
    private String lvyoudongtaiContent;


    /**
     * 发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：动态标题
	 */
    public String getLvyoudongtaiName() {
        return lvyoudongtaiName;
    }


    /**
	 * 获取：动态标题
	 */

    public void setLvyoudongtaiName(String lvyoudongtaiName) {
        this.lvyoudongtaiName = lvyoudongtaiName;
    }
    /**
	 * 设置：动态类型
	 */
    public Integer getLvyoudongtaiTypes() {
        return lvyoudongtaiTypes;
    }


    /**
	 * 获取：动态类型
	 */

    public void setLvyoudongtaiTypes(Integer lvyoudongtaiTypes) {
        this.lvyoudongtaiTypes = lvyoudongtaiTypes;
    }
    /**
	 * 设置：动态图片
	 */
    public String getLvyoudongtaiPhoto() {
        return lvyoudongtaiPhoto;
    }


    /**
	 * 获取：动态图片
	 */

    public void setLvyoudongtaiPhoto(String lvyoudongtaiPhoto) {
        this.lvyoudongtaiPhoto = lvyoudongtaiPhoto;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：动态详情
	 */
    public String getLvyoudongtaiContent() {
        return lvyoudongtaiContent;
    }


    /**
	 * 获取：动态详情
	 */

    public void setLvyoudongtaiContent(String lvyoudongtaiContent) {
        this.lvyoudongtaiContent = lvyoudongtaiContent;
    }
    /**
	 * 设置：发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：发布时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
