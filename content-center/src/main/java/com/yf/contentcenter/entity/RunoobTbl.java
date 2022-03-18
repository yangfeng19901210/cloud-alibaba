package com.yf.contentcenter.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author yf
 * @since 2022-03-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Builder
public class RunoobTbl implements Serializable {

private static final long serialVersionUID=1L;

    @TableId(value = "runoob_id", type = IdType.AUTO)
    private Integer runoobId;

    private String runoobTitle;

    private String runoobAuthor;

    private Date submissionDate;


}
