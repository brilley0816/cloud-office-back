package com.example.voaserver.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.voaserver.mapper.DepartmentMapper;
import com.example.voaserver.pojo.Department;
import com.example.voaserver.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhanglishen
 * @since 2020-11-14
 */
@Service
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements IDepartmentService {

}
