package org.example.infrastructure.persistent.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.example.infrastructure.persistent.po.Award;

/**
 * 奖品 DAO
 *
 * @author lijiafu
 * @since 2025/11/29
 */
@Mapper
public interface IAwardDao {

    List<Award> queryAwardList();

    String queryAwardConfigByAwardId(Integer awardId);

    String queryAwardKeyByAwardId(Integer awardId);
}
