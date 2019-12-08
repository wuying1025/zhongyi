package com.weichuang.service;

import com.weichuang.dao.IndexDao;
import com.weichuang.dao.IndexDaoImpl;
import com.weichuang.pojo.Banner;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class IndexServiceImpl implements IndexService {
    private IndexDao indexDao;
    @Override
    public List<Banner> getBanner() {
        indexDao = new IndexDaoImpl();
        List<Banner> banners = null;
        try {
            ResultSet resultSet = indexDao.getBanner();
            banners = new ArrayList<>();
            while (resultSet.next()) {
                Banner b = new Banner();
                b.setId(resultSet.getInt("id"));
                b.setImg(resultSet.getString("img"));
                b.setTitle(resultSet.getString("title"));
                b.setPostDate(resultSet.getString("post_date"));
                b.setOnline(resultSet.getInt("online"));
                banners.add(b);
            }
        } catch (Exception e) {

        }
        return banners;
    }
}
