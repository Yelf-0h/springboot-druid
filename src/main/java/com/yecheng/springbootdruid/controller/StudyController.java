package com.yecheng.springbootdruid.controller;
 
import com.yecheng.springbootdruid.entity.Study;
import com.yecheng.springbootdruid.service.StudyService;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
 
/**
 * (Study)表服务控制层
 *
 * @author Yelf
 * @since 2023-12-04 23:09:27
 */
@RestController
@RequestMapping("study")
public class StudyController {
    @Resource
    private StudyService studyService;

    @PostMapping("add")
    public String add(@Validated @RequestBody Study study) {
        return studyService.add(study);
    }
 
}
