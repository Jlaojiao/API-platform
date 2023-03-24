package com.xiaoge.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaoge.project.model.entity.InterfaceInfo;
import com.xiaoge.project.model.entity.Post;

/**
* @author 10637
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2023-03-22 16:40:53
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
