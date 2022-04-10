package com.example.voaserver.controller;

import com.example.voaserver.pojo.Salary;
import com.example.voaserver.service.ISalaryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zhanglishen
 * @since 2020-11-14
 */
@Api(tags = "SalaryController")
@RestController
@RequestMapping("/salary/sob")
public class SalaryController {

}
