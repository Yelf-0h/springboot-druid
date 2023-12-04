package com.yecheng.springbootdruid.mapper;
 
import com.yecheng.springbootdruid.entity.Study;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Study)表数据库访问层
 *
 * @author Yelf
 * @since 2023-12-04 23:09:27
 */
@Mapper
public interface StudyMapper extends BaseMapper<Study>{

    /**
     * 添加研究
     *
     * @param list 列表
     * @return {@link Integer}
     */
    Integer addStudy(@Param("list") List<Study> list);
}
