package com.example.excellencesys.dao;

import com.example.excellencesys.pojo.Findclassification;
import com.example.excellencesys.pojo.Shopping;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FindDao {
    List<Shopping> allmessage(@Param("findcid") int findcid);   //查询商品信息
    List<Findclassification> findtype();   //发现类型
}
