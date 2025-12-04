package org.example.domain.strategy.repository;


import java.util.List;
import java.util.Map;

import org.example.domain.strategy.model.entity.StrategyAwardEntity;

/**
 * 策略服务仓储接口
 *
 * @author lijiafu
 * @since 2025/12/1
 */
public interface IStrategyRepository {

    List<StrategyAwardEntity> queryStrategyAwardList(Long strategyId);

    void storeStrategyAwardSearchRateTable(Long strategyId, Integer rateRange, Map<Integer, Integer> strategyAwardSearchRateTable);

    Integer getStrategyAwardAssemble(Long strategyId, Integer rateKey);

    int getRateRange(Long strategyId);

}

