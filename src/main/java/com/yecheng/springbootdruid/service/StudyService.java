package com.yecheng.springbootdruid.service;
 
import com.baomidou.mybatisplus.extension.service.IService;
import com.yecheng.springbootdruid.entity.Study;
 
/**
 * (Study)表服务接口层
 *
 * @author Yelf
 * @since 2023-12-04 23:09:26
 */
public interface StudyService extends IService<Study>{

    String add(Study study);
}
