package com.example.excellencesys.service.impl;

import com.example.excellencesys.dao.FindDao;
import com.example.excellencesys.pojo.Find;
import com.example.excellencesys.pojo.Findclassification;
import com.example.excellencesys.pojo.Shopping;
import com.example.excellencesys.service.FindService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FindServiceImpl implements FindService {

    @Resource
    FindDao findDao;


    @Override
    public List<Shopping> allmessage(int findcid) {
        return findDao.allmessage(findcid);
    }

    @Override
    public List<Findclassification> findtype() {
        return findDao.findtype();
    }


}
