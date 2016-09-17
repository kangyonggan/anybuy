package com.anybuy.service.impl;

import com.anybuy.model.CardHistory;
import com.anybuy.service.CardHistoryService;
import tk.mybatis.mapper.entity.Example;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author houbinbin
 * @since 2016/09/17
 */
@Service
@Transactional
public class CardHistoryServiceImpl extends BaseService<CardHistory> implements CardHistoryService {

    @Override
    public int saveCardHistory(CardHistory cardHistory) {
        return super.insertSelective(cardHistory);
    }

    @Override
    public int updateCardHistory(CardHistory cardHistory) {
        return super.updateByPrimaryKeySelective(cardHistory);
    }

    @Override
    public int deleteCardHistory(Long id) {
        return super.deleteByPrimaryKey(id);
    }

    @Override
    public List<CardHistory> findAllCardHistorysByPage(int pageNum) {
        Example example = new Example(CardHistory.class);
        example.setOrderByClause("id desc");
        return super.selectByExample4Page(pageNum, example);
    }

    @Override
    public CardHistory getCardHistory(Long id) {
        return super.selectByPrimaryKey(id);
    }
}
