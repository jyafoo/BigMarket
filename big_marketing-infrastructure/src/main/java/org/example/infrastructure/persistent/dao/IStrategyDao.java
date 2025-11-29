package org.example.infrastructure.persistent.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.example.infrastructure.persistent.po.Strategy;

/**
 * 策略 DAO
 *
 * @author lijiafu
 * @since 2025/11/29
 */
@Mapper
public interface IStrategyDao {
    List<Strategy> queryStrategyList();

    Strategy queryStrategyByStrategyId(Long strategyId);

}
