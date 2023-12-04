package com.yecheng.springbootdruid.service.impl;
 
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yecheng.springbootdruid.mapper.StudyMapper;
import com.yecheng.springbootdruid.entity.Study;
import com.yecheng.springbootdruid.service.StudyService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * (Study)表服务实现类
 *
 * @author Yelf
 * @since 2023-12-04 23:09:27
 */
@Service
public class StudyServiceImpl extends ServiceImpl<StudyMapper, Study> implements StudyService {

    @Override
    public String add(Study study) {
        List<Study> list = new ArrayList<>();
        for (int i = 1; i < 4; i++) {
            Study study1 = new Study();
            study1.setId(i);
            study1.setNum(2);
            study1.setName("张三"+i);
            list.add(study1);
        }
        return baseMapper.addStudy(list).toString();
    }
}
