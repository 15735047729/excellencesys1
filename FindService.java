package com.example.excellencesys.service;

import com.example.excellencesys.pojo.Findclassification;
import com.example.excellencesys.pojo.Shopping;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FindService {
    List<Shopping> allmessage(@Param("findcid") int findcid);   //查询商品信息

    List<Findclassification> findtype();   //发现类型
}
