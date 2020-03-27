package mybatis.generator.mapper;

import mybatis.generator.model.CouponAuth;

public interface CouponAuthMapper {
    int insert(CouponAuth record);

    int insertSelective(CouponAuth record);

    CouponAuth selectByPrimaryKey(Long id);
}