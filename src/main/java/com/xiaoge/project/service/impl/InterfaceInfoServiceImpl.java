package com.xiaoge.project.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiaoge.project.common.ErrorCode;
import com.xiaoge.project.exception.BusinessException;
import com.xiaoge.project.model.entity.InterfaceInfo;
import com.xiaoge.project.mapper.InterfaceInfoMapper;
import com.xiaoge.project.model.entity.Post;
import com.xiaoge.project.model.enums.PostGenderEnum;
import com.xiaoge.project.model.enums.PostReviewStatusEnum;
import com.xiaoge.project.service.InterfaceInfoService;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
* @author 10637
* @description 针对表【interface_info(接口信息)】的数据库操作Service实现
* @createDate 2023-03-22 16:40:53
*/
@Service
public class InterfaceInfoServiceImpl extends ServiceImpl<InterfaceInfoMapper, InterfaceInfo>
    implements InterfaceInfoService{


    @Override
    public void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add) {
        if (interfaceInfo == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        String name = interfaceInfo.getName();
        // 创建时，所有参数必须非空
        if (add) {
            if (StringUtils.isAnyBlank(name)) {
                throw new BusinessException(ErrorCode.PARAMS_ERROR);
            }
        }
        if (StringUtils.isNotBlank(name) && name.length()> 50) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "名称过长");
        }
    }
}




